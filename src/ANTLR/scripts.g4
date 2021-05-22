grammar scripts;
@header{
package ANTLR;

}
@parser::members{

    private Java.Sintesis myinfo;

    public scriptsParser(TokenStream input, Java.Sintesis theinfo){
        this(input);
        myinfo = theinfo;
    }

}


program returns [String v]: part program2 {$v = $part.v + $program2.v;};
program2 returns [String v]: part program2 {$v = $part.v + $program2.v;}//USAR HEREDADOS??
    | {$v = "juan pepe";}
    ;

part returns [String v]: 'funcion' type restpart["funcion "]
    {$v = myinfo.palres("funcion ") + $type.v + $restpart.v + "<BR/>";
    myinfo.newDec($v);

    } | 'procedimiento' restpart["procedimiento "] {$v = myinfo.palres("procedimiento ") + $restpart.v + "</BR>";myinfo.newDec($v);};

//generar una dupla? para coger cabecera o el resto de cosas
restpart[String i] returns [String v]: IDENTIFICADOR '(' restpart2[$i + $IDENTIFICADOR.text + " ( ", $IDENTIFICADOR.text]
    {$v = myinfo.identificadores($IDENTIFICADOR.text) + "(" + $restpart2.v;};
restpart2[String frase, String nombreCab] returns [String v]: listparam ')' blq
    {
    String cab = $listparam.v + " ) ";
    myinfo.addCabecera($frase + $listparam.v + " ) ",$nombreCab);
    $v = $listparam.v + ")" + $blq.v;
    }
    | ')' blq {
    myinfo.addCabecera($frase + ")",$nombreCab);
    $v = ")" + $blq.v;
    }
    ;

listparam returns [String v]: type IDENTIFICADOR listparam2 {$v = $type.v + myinfo.identificadores($IDENTIFICADOR.text) + $listparam2.v;};
listparam2 returns [String v]: ',' type IDENTIFICADOR {$v = "," + $type.v + myinfo.identificadores($IDENTIFICADOR.text);} //USAR HEREDADOS??
    | {$v = "";}
    ;

type returns [String v]: 'entero' {$v = myinfo.palres("entero ");}| 'real' {$v = myinfo.palres("real ");}|'caracter' {$v = myinfo.palres("caracter ");};

blq returns [String v]: 'inicio' sentlist 'fin' {$v = "\r\n<BR/>" + myinfo.palres("inicio ") + $sentlist.v + myinfo.palres("fin ");};

sentlist returns [String v]: sent sentlist2 {$v = $sent.v + $sentlist2.v;};
sentlist2 returns [String v]: sent sentlist2 {$v = $sent.v + $sentlist2.v;} //USAR HEREDADOS????
    | {$v = "";}
    ;

sent returns [String v]: type lid ';'
        {$v = myinfo.addSentencia($type.v + $lid.v + ";");}
    | IDENTIFICADOR sent2
        {
            String id = myinfo.identificadores($IDENTIFICADOR.text);
            $v =  myinfo.addSentencia(id + $sent2.v);
        }
    | 'return' exp ';'
        {
            String r = myinfo.palres("return ");
            $v = myinfo.addSentencia(r + $exp.v + ";");
        }
    | 'bifurcacion' '(' lcond ')' 'entonces' blq 'sino' blq
        {
        String bif = myinfo.palres("bifurcacion ");
        String entonces = myinfo.palres("entonces ");
        String sino = myinfo.palres("sino ");
        $v = myinfo.addSentencia(bif + "(" + $lcond.v + ")" + entonces + $blq.v + sino + $blq.v);
        }
    | 'buclepara' '(' IDENTIFICADOR asig exp ';' lcond ';' sentfor
        {
        String buclepara = myinfo.palres("buclepara ");
        String id = myinfo.identificadores($IDENTIFICADOR.text);
        $v = myinfo.addSentencia(buclepara + "(" + id + $asig.v + $exp.v + ";" + $lcond.v + ";" + $sentfor.v);
        }
    | 'buclemientras' '(' lcond ')' blq
        {
            String buclemientras = myinfo.palres("buclemientras ");
            $v = myinfo.addSentencia(buclemientras + "(" + $lcond.v + ")" + $blq.v);
        }
    | 'bucle' blq 'hasta' '(' lcond ')'
        {
            String bucle = myinfo.palres("bucle ");
            String hasta = myinfo.palres("hasta ");
            $v = myinfo.addSentencia(bucle + $blq.v + hasta + "(" + $lcond.v + ")");
        }
    | blq {$v = myinfo.addSentencia($blq.v);}
    ;
sentfor returns [String v] : IDENTIFICADOR asig exp ')' blq
    {
    $v = $IDENTIFICADOR.text + $asig.v + $exp.v + ")" + $blq.v;
    };
sent2 returns [String v]: '(' sent3 {$v = "(" + $sent3.v;}
    | asig exp ';' {$v = $asig.v + $exp.v;}
    ;
sent3 returns [String v]: lid ')' ';' {$v = $lid.v + ")" + ";";}
    | ')' ';' {$v = ")" + ";";}
    ;

lcond returns [String v]: opl lcond lcond2 {$v = $opl.v + $lcond.v + $lcond2.v;}
    | cond lcond2 {$v = $cond.v + $lcond2.v;}
    | 'no' cond lcond2 {$v = myinfo.palres("no ") + $cond.v + $lcond2.v;}
    ;
lcond2 returns [String v]: opl lcond {$v = $opl.v + $lcond.v;}
    | {$v = "";}
    ;

cond returns [String v]: exp opr exp {$v = $exp.v + $opr.v + $exp.v;}
    | 'cierto' {$v = myinfo.palres("cierto ");}
    | 'falso' {$v = myinfo.palres("falso ");}
    ;

opl returns [String v]: 'y' {$v = myinfo.palres("y ");}
    | 'o' {$v = myinfo.palres("o ");}
    ;

opr returns [String v]: '==' {$v = "==";}
    | '<>' {$v = "<>";}
    | '<' {$v = "<";}
    | '>' {$v = ">";}
    | '>=' {$v = ">=";}
    | '<=' {$v = "<=";}
    ;

lid returns [String v]: IDENTIFICADOR lid2 {$v = myinfo.identificadores($IDENTIFICADOR.text) + $lid2.v;};
lid2 returns [String v]: ',' lid {$v = "," + $lid.v;} //USAR HERENCIA?????
    | {$v = "";}
    ;

asig returns [String v]: '=' {$v = "=";} | '+=' {$v = "+=";}| '-=' {$v = "-=";}| '*=' {$v = "*=";}| '/='{$v = "/=";};


exp returns [String v]: funcion exp2 {$v = $funcion.v + $exp2.v;};
exp2 returns [String v]: op funcion exp2 {$v = $op.v + $funcion.v + $exp2.v;}//USAR HERENCIA??
    | {$v = "";}
    ;

funcion returns [String v]: IDENTIFICADOR funcion2 {$v = myinfo.identificadores($IDENTIFICADOR.text) + $funcion2.v;}
    | '(' exp ')' {$v = "(" + $exp.v + ")";}
    | CONSTENTERO {$v = myinfo.constante($CONSTENTERO.text);}
    | CONSTREAL {$v = myinfo.constante($CONSTREAL.text);}
    | CONSTLIT {$v = myinfo.constante($CONSTLIT.text);}
    ;
funcion2 returns [String v]: '(' lid ')' {$v = "(" + $lid.v + ")\n";} // Usar atributos heredados????
    | {$v = " ";}
    ;



op returns [String v]: '+' {$v = "+";}| '-' {$v = "-";}| '*' {$v = "*";}| '/' {$v = "/";};


// Parte léxico

IDENTIFICADOR : ('_'|[a-z])([a-zA-Z]|[0-9]|'_')*;

CONSTENTERO : (HEXENTERO|DECENTERO);

CONSTREAL : (HEXREAL|DECREAL);

CONSTLIT : (COMILLASIMPLE|COMILLADOBLE);

COMENTARIOLINEA : '%%'(~'\n')*;

COMENTARIOMULTI : '%-'.*?'-%';

WS : (' '|'\r'|'\n'|'\t')+ -> skip;

fragment HEXENTERO : ('$')('+'|'-')?([0-9]|[A-F])+;
fragment DECENTERO : ('-'|'+')?([0-9])+;
fragment DECREAL : ('-'|'+')?([0-9])+('.')([0-9])+;
fragment HEXREAL : ('$')('+'|'-')?([0-9]|[A-F])+('.')([0-9]|[A-F])+;
fragment COMILLASIMPLE : ('\'')(~('\'')|'\'\'')*('\'');
fragment COMILLADOBLE : ('"')(~('"')|'""')*('"');
