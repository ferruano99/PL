grammar scripts;
@header{
package ANTLR;

import Java.Reservadas;
import Java.ListParams;
import Java.Restpart;
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

part returns [String v]: 'funcion' type restpart[$type.v.getPalabra()]
    {$v = myinfo.palres("funcion ").formatPalres() + $type.v.getPalHTML() + $restpart.v.getNombreFuncion() + "<BR/>";
    myinfo.newDec($v,$restpart.v.getRest());

    } | 'procedimiento' restpart[""]
    {$v = myinfo.palres("procedimiento ").formatPalres() + $restpart.v.getNombreFuncion() + "</BR>";
    myinfo.newDec($v,$restpart.v.getRest());
    };

//generar una dupla? para coger cabecera o el resto de cosas
restpart[String tipo] returns [Restpart v]: IDENTIFICADOR '(' restpart2[$tipo + $IDENTIFICADOR.text + " ( ", $IDENTIFICADOR.text]
    {
        $v = myinfo.restp(myinfo.identificadores($IDENTIFICADOR.text).formatIdentificadores() + "(" + $restpart2.v,$IDENTIFICADOR.text);
    };
restpart2[String frase, String nombreCab] returns [String v]: listparam ')' blq
    {
    String cab = $listparam.v + " ) ";
    myinfo.addCabecera($frase + $listparam.v.getTextoPlano() + " ) ",$nombreCab);
    $v = $listparam.v.getFormateado() + ")" + $blq.v;
    }
    | ')' blq {
    myinfo.addCabecera($frase + ")",$nombreCab);
    $v = ")" + $blq.v;
    }
    ;

listparam returns [ListParams v]: type IDENTIFICADOR listparam2 {$v = myinfo.listaPar($type.v.getPalHTML() + myinfo.identificadores($IDENTIFICADOR.text).formatIdentificadores() + $listparam2.v.getFormateado(), $type.v.getPalabra() + myinfo.identificadores($IDENTIFICADOR.text).getPalabra() + $listparam2.v.getTextoPlano());};
listparam2 returns [ListParams v]: ',' type IDENTIFICADOR {$v = myinfo.listaPar("," + $type.v.getPalHTML() + myinfo.identificadores($IDENTIFICADOR.text).formatIdentificadores(), "," + $type.v.getPalabra() + myinfo.identificadores($IDENTIFICADOR.text).getPalabra());} //USAR HEREDADOS??
    | {$v = myinfo.listaPar("","");}
    ;

type returns [Reservadas v]: 'entero' {$v = myinfo.palres("entero ");$v.formatPalres();}| 'real' {$v = myinfo.palres("real ");$v.formatPalres();}|'caracter' {$v = myinfo.palres("caracter ");$v.formatPalres();};

blq returns [String v]: 'inicio' sentlist 'fin' {$v = "\r\n<BR/>" + myinfo.palres("inicio ").formatPalres() + "<BR/>\r\n" + $sentlist.v + myinfo.palres("fin ").formatPalres();};

sentlist returns [String v]: sent sentlist2 {$v = $sent.v + $sentlist2.v;};
sentlist2 returns [String v]: sent sentlist2 {$v = $sent.v + $sentlist2.v;} //USAR HEREDADOS????
    | {$v = "";}
    ;

sent returns [String v]: type lid ';'
        {$v = myinfo.addSentencia($type.v.getPalHTML() + $lid.v + ";  ");}
    | IDENTIFICADOR sent2
        {
            String id = myinfo.identificadores($IDENTIFICADOR.text).formatIdentificadores();
            $v =  myinfo.addSentencia(id + $sent2.v);
        }
    | 'return' exp ';'
        {
            String r = myinfo.palres("return ").formatPalres();
            $v = myinfo.addSentencia(r + $exp.v + " ; ");
        }
    | 'bifurcacion' '(' lcond ')' 'entonces' blq 'sino' blq
        {
        String bif = myinfo.palres("bifurcacion ").formatPalres();
        String entonces = myinfo.palres("entonces ").formatPalres();
        String sino = myinfo.palres("sino ").formatPalres();
        $v = myinfo.addSentencia(bif + " ( " + $lcond.v + " ) " + entonces + $blq.v + sino + $blq.v);
        }
    | 'buclepara' '(' IDENTIFICADOR asig exp ';' lcond ';' sentfor
        {
        String buclepara = myinfo.palres("buclepara ").formatPalres();
        String id = myinfo.identificadores($IDENTIFICADOR.text).formatIdentificadores();
        $v = myinfo.addSentencia(buclepara + " ( " + id + $asig.v + $exp.v + " ; " + $lcond.v + " ; " + $sentfor.v);
        }
    | 'buclemientras' '(' lcond ')' blq
        {
            String buclemientras = myinfo.palres("buclemientras ").formatPalres();
            $v = myinfo.addSentencia(buclemientras + " ( " + $lcond.v + " ) " + $blq.v);
        }
    | 'bucle' blq 'hasta' '(' lcond ')'
        {
            String bucle = myinfo.palres("bucle ").formatPalres();
            String hasta = myinfo.palres("hasta ").formatPalres();
            $v = myinfo.addSentencia(bucle + $blq.v + hasta + " ( " + $lcond.v + " ) ");
        }
    | blq {$v = myinfo.addSentencia($blq.v);}
    ;
sentfor returns [String v] : IDENTIFICADOR asig exp ')' blq
    {
    $v = $IDENTIFICADOR.text + $asig.v + $exp.v + " ) " + $blq.v;
    };
sent2 returns [String v]: '(' sent3 {$v = " ( " + $sent3.v;}
    | asig exp ';' {$v = $asig.v + $exp.v + " ; ";}
    ;
sent3 returns [String v]: lid ')' ';' {$v = $lid.v + " ) " + " ; ";}
    | ')' ';' {$v = " ) " + " ; ";}
    ;

lcond returns [String v]: opl lcond lcond2 {$v = $opl.v + $lcond.v + $lcond2.v;}
    | cond lcond2 {$v = $cond.v + $lcond2.v;}
    | 'no' cond lcond2 {$v = myinfo.palres("no ").formatPalres() + $cond.v + $lcond2.v;}
    ;
lcond2 returns [String v]: opl lcond {$v = $opl.v + $lcond.v;}
    | {$v = "";}
    ;

cond returns [String v]: exp opr exp {$v = $exp.v + $opr.v + $exp.v;}
    | 'cierto' {$v = myinfo.palres("cierto ").formatPalres();}
    | 'falso' {$v = myinfo.palres("falso ").formatPalres();}
    ;

opl returns [String v]: 'y' {$v = myinfo.palres("y ").formatPalres();}
    | 'o' {$v = myinfo.palres("o ").formatPalres();}
    ;

opr returns [String v]: '==' {$v = " == ";}
    | '<>' {$v = " <> ";}
    | '<' {$v = " < ";}
    | '>' {$v = " > ";}
    | '>=' {$v = " >= ";}
    | '<=' {$v = " <= ";}
    ;

lid returns [String v]: IDENTIFICADOR lid2 {$v = myinfo.identificadores($IDENTIFICADOR.text).formatIdentificadores() + $lid2.v;};
lid2 returns [String v]: ',' lid {$v = " , " + $lid.v;} //USAR HERENCIA?????
    | {$v = "";}
    ;

asig returns [String v]: '=' {$v = " = ";} | '+=' {$v = " += ";}| '-=' {$v = " -= ";}| '*=' {$v = " *= ";}| '/='{$v = " /= ";};


exp returns [String v]: funcion exp2 {$v = $funcion.v + $exp2.v;};
exp2 returns [String v]: op funcion exp2 {$v = $op.v + $funcion.v + $exp2.v;}//USAR HERENCIA??
    | {$v = "";}
    ;

funcion returns [String v]: IDENTIFICADOR funcion2 {$v = myinfo.identificadores($IDENTIFICADOR.text).formatIdentificadores() + $funcion2.v;}
    | '(' exp ')' {$v = " ( " + $exp.v + " ) ";}
    | CONSTENTERO {$v = myinfo.constante($CONSTENTERO.text).formatConstante();}
    | CONSTREAL {$v = myinfo.constante($CONSTREAL.text).formatConstante();}
    | CONSTLIT {$v = myinfo.constante($CONSTLIT.text).formatConstante();}
    ;
funcion2 returns [String v]: '(' lid ')' {$v = " ( " + $lid.v + " ) \n";} // Usar atributos heredados????
    | {$v = " ";}
    ;



op returns [String v]: '+' {$v = " + ";}| '-' {$v = " - ";}| '*' {$v = " * " ;}| '/' {$v = " / ";};


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
