grammar scripts;
@header{
package ANTLR;

import Clases.*;
}
@parser::members{

    private ClasePrincipal myinfo;
    public scriptsParser(TokenStream input, ClasePrincipal theinfo){
        this(input);
        this.myinfo = theinfo;
    }

}

program : part program2;
program2 : part program2
    |
    ;

part returns [Part v]: 'funcion' type restpart
    {
        $v = myinfo.nuevaPart($restpart.v.getNombreFuncion(), "funcion " + $type.v.getTextoHTML() + $restpart.v.getTextoHTML(), "funcion " + $type.v.getTextoNormal() + $restpart.v.getTextoNormal());
    }
    | 'procedimiento' restpart
    {
        $v = myinfo.nuevaPart($restpart.v.getNombreFuncion(),"procedimiento " + $type.v.getTextoHTML() + $restpart.v.getTextoHTML(), $type.v.getTextoNormal() + $restpart.v.getTextoNormal());
    }
    ;

restpart returns [Restpart v]: IDENTIFICADOR '(' restpart2
    {
        $v = myinfo.nuevaRestpart($IDENTIFICADOR.text, $IDENTIFICADOR.text + " ( " + $restpart2.v.getTextoHTML(), $IDENTIFICADOR.text + " ( " + $restpart2.v.getTextoNormal());
    };
restpart2 returns [Restpart v]: listparam ')' blq
    {$v = myinfo.nuevaRestpart("",$listparam.v.getTextoHTML() + " ) " + $blq.v.getTextoHTML(), $listparam.v.getTextoNormal() + " ) ");
    }
    | ')' blq
    {
        $v = myinfo.nuevaRestpart(""," ) " + $blq.v.getTextoHTML(), " ) ");
    }
    ;

listparam returns [Listparam v]: type IDENTIFICADOR listparam2
    {
    };
listparam2 returns [Listparam v]: ',' type IDENTIFICADOR
    |
    ;

type returns [Constantes v]: 'entero'
    | 'real'
    | 'caracter';

blq returns [Blq v]: 'inicio' sentlist 'fin';

sentlist : sent sentlist2;
sentlist2 : sent sentlist2 //USAR HEREDADOS????
    |
    ;

sent returns [Sent v]: type lid ';'
    | IDENTIFICADOR sent2
    | 'return' exp ';'
    | 'bifurcacion' '(' lcond ')' 'entonces' blq 'sino' blq
    | 'buclepara' '(' id1=IDENTIFICADOR asig exp ';' lcond ';' id2=IDENTIFICADOR asig exp ')' blq
    | 'buclemientras' '(' lcond ')' blq
    | 'bucle' blq 'hasta' '(' lcond ')'
    | blq
    ;
sent2 returns [Sent v]: '(' sent3
    | asig exp ';'
    ;
sent3 returns [Sent v]: lid ')' ';'
    | ')' ';'
    ;

lcond : opl lcond lcond2
    | cond lcond2
    | 'no' cond lcond
    ;
lcond2 : opl lcond
    |
    ;

cond : exp opr exp
    | 'cierto'
    | 'falso'
    ;

opl returns [Constantes v]: 'y'
    | 'o'
    ;

opr returns [String v]: '==' {$v = " == ";}
    | '<>' {$v = " <> ";}
    | '<' {$v = " < ";}
    | '>' {$v = " > ";}
    | '>=' {$v = " >= ";}
    | '<=' {$v = " <= ";}
    ;

lid returns [Lid v]: IDENTIFICADOR lid2;
lid2 returns [Lid v]: ',' lid
    |
    ;

asig returns [String v]: '=' {$v = " = ";} | '+=' {$v = " += ";}| '-=' {$v = " -= ";}| '*=' {$v = " *= ";}| '/='{$v = " /= ";};


exp : funcion exp2 ;
exp2 : op funcion exp2
    |
    ;

funcion: IDENTIFICADOR funcion2
    | '(' exp ')'
    | CONSTENTERO
    | CONSTREAL
    | CONSTLIT
    ;
funcion2 : '(' lid ')'
    |
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


/*
grammar scripts;

program : part program2;
program2 : part program2
    |
    ;

part : 'funcion' type restpart
    | 'procedimiento' restpart
    ;

restpart : IDENTIFICADOR '(' restpart2;
restpart2 : listparam ')' blq
    | ')' blq
    ;

listparam : type IDENTIFICADOR listparam2;
listparam2 : ',' type IDENTIFICADOR
    |
    ;

type : 'entero'
    | 'real'
    | 'caracter'
    ;

blq : 'inicio' sent 'fin';

sentlist : sent sentlist2;
sentlist2 : sent sentlist2
    |
    ;

sent : type lid ';'
    | IDENTIFICADOR asig exp ';'
    | 'return' exp ';'
    ;

lid : IDENTIFICADOR lid2;
lid2 : ',' lid2
    |
    ;

asig : '='
    | '+='
    | '-='
    | '/='
    ;

funcion : IDENTIFICADOR funcion2
    | '(' exp ')'
    | CONSTENTERO
    | CONSTREAL
    | CONSTLIT
    ;
funcion2 : '(' lid ')'
    |
    ;

exp : funcion exp2;
exp2 : op funcion exp2
    |
    ;

op : '+'
    | '-'
    | '*'
    | '/'
    ;



// RESERVADAS: ('funcion'|'procedimiento'|'entero'|'real'|'caracter'|'inicio'|'fin');

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
*/