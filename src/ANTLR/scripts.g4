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

part returns [String v]: 'funcion' type restpart {$v = "funcion " + $type.v + " " + $restpart.v;myinfo.newDec($v);} | 'procedimiento' restpart {$v = "procedimiento" + $restpart.v;myinfo.newDec($v);};

//generar una dupla? para coger cabecera o el resto de cosas
restpart returns [String v]: IDENTIFICADOR '(' restpart2 {$v = $IDENTIFICADOR.text + "(" + $restpart2.v;};
restpart2 returns [String v]: listparam ')' blq {$v = $listparam.v + ")" + $blq.v;}
    | ')' blq {$v = ")" + $blq.v;}
    ;

listparam returns [String v]: type IDENTIFICADOR listparam2 {$v = $type.v + $IDENTIFICADOR.text + $listparam2.v;};
listparam2 returns [String v]: ',' type IDENTIFICADOR {$v = "," + $type.v + $IDENTIFICADOR.text;} //USAR HEREDADOS??
    | {$v = "";}
    ;

type returns [String v]: 'entero' {$v = "entero";}| 'real' {$v = "real";}|'caracter' {$v = "caracter";};

blq returns [String v]: 'inicio' sentlist 'fin' {$v = "inicio" + $sentlist.v + "fin";};

sentlist returns [String v]: sent sentlist2 {$v = $sent.v + $sentlist2.v;};
sentlist2 returns [String v]: sent sentlist2 {$v = $sent.v + $sentlist2.v;} //USAR HEREDADOS????
    | {$v = "";}
    ;

sent returns [String v]: type lid ';' {$v = $type.v + $lid.v + ";";}
    | IDENTIFICADOR sent2 {$v = $IDENTIFICADOR.text + $sent2.v;}
    | 'return' exp ';' {$v = "return" + $exp.v + ";";}
    | 'bifurcacion' '(' lcond ')' 'entonces' blq 'sino' blq
    | 'buclepara' '(' IDENTIFICADOR asig exp ';' lcond ';' IDENTIFICADOR asig exp ')' blq
    | 'buclemientras' '(' lcond ')' blq
    | 'bucle' blq 'hasta' '(' lcond ')'
    | blq
    ;
sent2 returns [String v]: '(' sent3 {$v = "(" + $sent3.v;}
    | asig exp ';' {$v = $asig.v + $exp.v;}
    ;
sent3 returns [String v]: lid ')' ';' {$v = $lid.v + ")" + ";";}
    | ')' ';' {$v = ")" + ";";}
    ;

lcond returns [String v]: opl lcond lcond2
    | cond lcond2
    | 'no' cond lcond2
    ;
lcond2 returns [String v]: opl lcond
    | {$v = ""}
    ;

cond returns [String v]: exp opr exp
    | 'cierto' {$v = "cierto";}
    | 'falso' {$v = "falso";}
    ;

opl returns [String v]: 'y' {$v = "y";}
    | 'o' {$v = "o";}
    ;

opr returns [String v]: '==' {$v = "==";}
    | '<>' {$v = "<>";}
    | '<' {$v = "<";}
    | '>' {$v = ">";}
    | '>=' {$v = ">=";}
    | '<=' {$v = "<=";}
    ;

lid returns [String v]: IDENTIFICADOR lid2 {$v = $IDENTIFICADOR.text + $lid2.v;};
lid2 returns [String v]: ',' lid {$v = "," + $lid.v;} //USAR HERENCIA?????
    | {$v = "";}
    ;

asig returns [String v]: '=' {$v = "=";} | '+=' {$v = "+=";}| '-=' {$v = "-=";}| '*=' {$v = "*=";}| '/='{$v = "/=";};


exp returns [String v]: funcion exp2 {$v = $funcion.v + $exp2.v;};
exp2 returns [String v]: op funcion exp2 {$v = $op.v + $funcion.v + $exp2.v;}//USAR HERENCIA??
    | {$v = "";}
    ;

funcion returns [String v]: IDENTIFICADOR funcion2 {$v = $IDENTIFICADOR.text + $funcion2.v;}
    | '(' exp ')' {$v = "(" + $exp.v + ")";}
    | CONSTENTERO {$v = $CONSTENTERO.text;}
    | CONSTREAL {$v = $CONSTREAL.text;}
    | CONSTLIT {$v = $CONSTLIT.text;}
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
