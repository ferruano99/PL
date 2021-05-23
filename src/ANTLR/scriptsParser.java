// Generated from scripts.g4 by ANTLR 4.9.1

package ANTLR;

import Java.Reservadas;
import Java.ListParams;
import Java.Restpart;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class scriptsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, IDENTIFICADOR=40, CONSTENTERO=41, CONSTREAL=42, CONSTLIT=43, 
		COMENTARIOLINEA=44, COMENTARIOMULTI=45, WS=46;
	public static final int
		RULE_program = 0, RULE_program2 = 1, RULE_part = 2, RULE_restpart = 3, 
		RULE_restpart2 = 4, RULE_listparam = 5, RULE_listparam2 = 6, RULE_type = 7, 
		RULE_blq = 8, RULE_sentlist = 9, RULE_sentlist2 = 10, RULE_sent = 11, 
		RULE_sentfor = 12, RULE_sent2 = 13, RULE_sent3 = 14, RULE_lcond = 15, 
		RULE_lcond2 = 16, RULE_cond = 17, RULE_opl = 18, RULE_opr = 19, RULE_lid = 20, 
		RULE_lid2 = 21, RULE_asig = 22, RULE_exp = 23, RULE_exp2 = 24, RULE_funcion = 25, 
		RULE_funcion2 = 26, RULE_op = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "program2", "part", "restpart", "restpart2", "listparam", 
			"listparam2", "type", "blq", "sentlist", "sentlist2", "sent", "sentfor", 
			"sent2", "sent3", "lcond", "lcond2", "cond", "opl", "opr", "lid", "lid2", 
			"asig", "exp", "exp2", "funcion", "funcion2", "op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'funcion'", "'procedimiento'", "'('", "')'", "','", "'entero'", 
			"'real'", "'caracter'", "'inicio'", "'fin'", "';'", "'return'", "'bifurcacion'", 
			"'entonces'", "'sino'", "'buclepara'", "'buclemientras'", "'bucle'", 
			"'hasta'", "'no'", "'cierto'", "'falso'", "'y'", "'o'", "'=='", "'<>'", 
			"'<'", "'>'", "'>='", "'<='", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "IDENTIFICADOR", "CONSTENTERO", "CONSTREAL", 
			"CONSTLIT", "COMENTARIOLINEA", "COMENTARIOMULTI", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "scripts.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	    private Java.Sintesis myinfo;

	    public scriptsParser(TokenStream input, Java.Sintesis theinfo){
	        this(input);
	        myinfo = theinfo;
	    }


	public scriptsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public String v;
		public PartContext part;
		public Program2Context program2;
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public Program2Context program2() {
			return getRuleContext(Program2Context.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			((ProgramContext)_localctx).part = part();
			setState(57);
			((ProgramContext)_localctx).program2 = program2();
			((ProgramContext)_localctx).v =  ((ProgramContext)_localctx).part.v + ((ProgramContext)_localctx).program2.v;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Program2Context extends ParserRuleContext {
		public String v;
		public PartContext part;
		public Program2Context program2;
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public Program2Context program2() {
			return getRuleContext(Program2Context.class,0);
		}
		public Program2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterProgram2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitProgram2(this);
		}
	}

	public final Program2Context program2() throws RecognitionException {
		Program2Context _localctx = new Program2Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_program2);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				((Program2Context)_localctx).part = part();
				setState(61);
				((Program2Context)_localctx).program2 = program2();
				((Program2Context)_localctx).v =  ((Program2Context)_localctx).part.v + ((Program2Context)_localctx).program2.v;
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				((Program2Context)_localctx).v =  "juan pepe";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartContext extends ParserRuleContext {
		public String v;
		public TypeContext type;
		public RestpartContext restpart;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RestpartContext restpart() {
			return getRuleContext(RestpartContext.class,0);
		}
		public PartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitPart(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_part);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(T__0);
				setState(68);
				((PartContext)_localctx).type = type();
				setState(69);
				((PartContext)_localctx).restpart = restpart(((PartContext)_localctx).type.v.getPalabra());
				((PartContext)_localctx).v =  myinfo.palres("funcion ").formatPalres() + ((PartContext)_localctx).type.v.getPalHTML() + ((PartContext)_localctx).restpart.v.getNombreFuncion() + "<BR/>";
				    myinfo.newDec(_localctx.v,((PartContext)_localctx).restpart.v.getRest());

				    
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(T__1);
				setState(73);
				((PartContext)_localctx).restpart = restpart("");
				((PartContext)_localctx).v =  myinfo.palres("procedimiento ").formatPalres() + ((PartContext)_localctx).restpart.v.getNombreFuncion() + "</BR>";
				    myinfo.newDec(_localctx.v,((PartContext)_localctx).restpart.v.getRest());
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestpartContext extends ParserRuleContext {
		public String tipo;
		public Restpart v;
		public Token IDENTIFICADOR;
		public Restpart2Context restpart2;
		public TerminalNode IDENTIFICADOR() { return getToken(scriptsParser.IDENTIFICADOR, 0); }
		public Restpart2Context restpart2() {
			return getRuleContext(Restpart2Context.class,0);
		}
		public RestpartContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RestpartContext(ParserRuleContext parent, int invokingState, String tipo) {
			super(parent, invokingState);
			this.tipo = tipo;
		}
		@Override public int getRuleIndex() { return RULE_restpart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterRestpart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitRestpart(this);
		}
	}

	public final RestpartContext restpart(String tipo) throws RecognitionException {
		RestpartContext _localctx = new RestpartContext(_ctx, getState(), tipo);
		enterRule(_localctx, 6, RULE_restpart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((RestpartContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(79);
			match(T__2);
			setState(80);
			((RestpartContext)_localctx).restpart2 = restpart2(_localctx.tipo + (((RestpartContext)_localctx).IDENTIFICADOR!=null?((RestpartContext)_localctx).IDENTIFICADOR.getText():null) + " ( ", (((RestpartContext)_localctx).IDENTIFICADOR!=null?((RestpartContext)_localctx).IDENTIFICADOR.getText():null));

			        ((RestpartContext)_localctx).v =  myinfo.restp(myinfo.identificadores((((RestpartContext)_localctx).IDENTIFICADOR!=null?((RestpartContext)_localctx).IDENTIFICADOR.getText():null)).formatIdentificadores() + "(" + ((RestpartContext)_localctx).restpart2.v,(((RestpartContext)_localctx).IDENTIFICADOR!=null?((RestpartContext)_localctx).IDENTIFICADOR.getText():null));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Restpart2Context extends ParserRuleContext {
		public String frase;
		public String nombreCab;
		public String v;
		public ListparamContext listparam;
		public BlqContext blq;
		public ListparamContext listparam() {
			return getRuleContext(ListparamContext.class,0);
		}
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public Restpart2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Restpart2Context(ParserRuleContext parent, int invokingState, String frase, String nombreCab) {
			super(parent, invokingState);
			this.frase = frase;
			this.nombreCab = nombreCab;
		}
		@Override public int getRuleIndex() { return RULE_restpart2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterRestpart2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitRestpart2(this);
		}
	}

	public final Restpart2Context restpart2(String frase,String nombreCab) throws RecognitionException {
		Restpart2Context _localctx = new Restpart2Context(_ctx, getState(), frase, nombreCab);
		enterRule(_localctx, 8, RULE_restpart2);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				((Restpart2Context)_localctx).listparam = listparam();
				setState(84);
				match(T__3);
				setState(85);
				((Restpart2Context)_localctx).blq = blq();

				    String cab = ((Restpart2Context)_localctx).listparam.v + " ) ";
				    myinfo.addCabecera(_localctx.frase + ((Restpart2Context)_localctx).listparam.v.getTextoPlano() + " ) ",_localctx.nombreCab);
				    ((Restpart2Context)_localctx).v =  ((Restpart2Context)_localctx).listparam.v.getFormateado() + ")" + ((Restpart2Context)_localctx).blq.v;
				    
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(T__3);
				setState(89);
				((Restpart2Context)_localctx).blq = blq();

				    myinfo.addCabecera(_localctx.frase + ")",_localctx.nombreCab);
				    ((Restpart2Context)_localctx).v =  ")" + ((Restpart2Context)_localctx).blq.v;
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListparamContext extends ParserRuleContext {
		public ListParams v;
		public TypeContext type;
		public Token IDENTIFICADOR;
		public Listparam2Context listparam2;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(scriptsParser.IDENTIFICADOR, 0); }
		public Listparam2Context listparam2() {
			return getRuleContext(Listparam2Context.class,0);
		}
		public ListparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterListparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitListparam(this);
		}
	}

	public final ListparamContext listparam() throws RecognitionException {
		ListparamContext _localctx = new ListparamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			((ListparamContext)_localctx).type = type();
			setState(95);
			((ListparamContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(96);
			((ListparamContext)_localctx).listparam2 = listparam2();
			((ListparamContext)_localctx).v =  myinfo.listaPar(((ListparamContext)_localctx).type.v.getPalHTML() + myinfo.identificadores((((ListparamContext)_localctx).IDENTIFICADOR!=null?((ListparamContext)_localctx).IDENTIFICADOR.getText():null)).formatIdentificadores() + ((ListparamContext)_localctx).listparam2.v.getFormateado(), ((ListparamContext)_localctx).type.v.getPalabra() + myinfo.identificadores((((ListparamContext)_localctx).IDENTIFICADOR!=null?((ListparamContext)_localctx).IDENTIFICADOR.getText():null)).getPalabra() + ((ListparamContext)_localctx).listparam2.v.getTextoPlano());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Listparam2Context extends ParserRuleContext {
		public ListParams v;
		public TypeContext type;
		public Token IDENTIFICADOR;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(scriptsParser.IDENTIFICADOR, 0); }
		public Listparam2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listparam2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterListparam2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitListparam2(this);
		}
	}

	public final Listparam2Context listparam2() throws RecognitionException {
		Listparam2Context _localctx = new Listparam2Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_listparam2);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__4);
				setState(100);
				((Listparam2Context)_localctx).type = type();
				setState(101);
				((Listparam2Context)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				((Listparam2Context)_localctx).v =  myinfo.listaPar("," + ((Listparam2Context)_localctx).type.v.getPalHTML() + myinfo.identificadores((((Listparam2Context)_localctx).IDENTIFICADOR!=null?((Listparam2Context)_localctx).IDENTIFICADOR.getText():null)).formatIdentificadores(), "," + ((Listparam2Context)_localctx).type.v.getPalabra() + myinfo.identificadores((((Listparam2Context)_localctx).IDENTIFICADOR!=null?((Listparam2Context)_localctx).IDENTIFICADOR.getText():null)).getPalabra());
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				((Listparam2Context)_localctx).v =  myinfo.listaPar("","");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Reservadas v;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(T__5);
				((TypeContext)_localctx).v =  myinfo.palres("entero ");_localctx.v.formatPalres();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(T__6);
				((TypeContext)_localctx).v =  myinfo.palres("real ");_localctx.v.formatPalres();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(T__7);
				((TypeContext)_localctx).v =  myinfo.palres("caracter ");_localctx.v.formatPalres();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlqContext extends ParserRuleContext {
		public String v;
		public SentlistContext sentlist;
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public BlqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterBlq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitBlq(this);
		}
	}

	public final BlqContext blq() throws RecognitionException {
		BlqContext _localctx = new BlqContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__8);
			setState(116);
			((BlqContext)_localctx).sentlist = sentlist();
			setState(117);
			match(T__9);
			((BlqContext)_localctx).v =  "\r\n<BR/>" + myinfo.palres("inicio ").formatPalres() + "<BR/>\r\n" + ((BlqContext)_localctx).sentlist.v + myinfo.palres("fin ").formatPalres();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentlistContext extends ParserRuleContext {
		public String v;
		public SentContext sent;
		public Sentlist2Context sentlist2;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sentlist2Context sentlist2() {
			return getRuleContext(Sentlist2Context.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitSentlist(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			((SentlistContext)_localctx).sent = sent();
			setState(121);
			((SentlistContext)_localctx).sentlist2 = sentlist2();
			((SentlistContext)_localctx).v =  ((SentlistContext)_localctx).sent.v + ((SentlistContext)_localctx).sentlist2.v;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentlist2Context extends ParserRuleContext {
		public String v;
		public SentContext sent;
		public Sentlist2Context sentlist2;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sentlist2Context sentlist2() {
			return getRuleContext(Sentlist2Context.class,0);
		}
		public Sentlist2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterSentlist2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitSentlist2(this);
		}
	}

	public final Sentlist2Context sentlist2() throws RecognitionException {
		Sentlist2Context _localctx = new Sentlist2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_sentlist2);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__11:
			case T__12:
			case T__15:
			case T__16:
			case T__17:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				((Sentlist2Context)_localctx).sent = sent();
				setState(125);
				((Sentlist2Context)_localctx).sentlist2 = sentlist2();
				((Sentlist2Context)_localctx).v =  ((Sentlist2Context)_localctx).sent.v + ((Sentlist2Context)_localctx).sentlist2.v;
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				((Sentlist2Context)_localctx).v =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentContext extends ParserRuleContext {
		public String v;
		public TypeContext type;
		public LidContext lid;
		public Token IDENTIFICADOR;
		public Sent2Context sent2;
		public ExpContext exp;
		public LcondContext lcond;
		public BlqContext blq;
		public AsigContext asig;
		public SentforContext sentfor;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(scriptsParser.IDENTIFICADOR, 0); }
		public Sent2Context sent2() {
			return getRuleContext(Sent2Context.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public LcondContext lcond() {
			return getRuleContext(LcondContext.class,0);
		}
		public List<BlqContext> blq() {
			return getRuleContexts(BlqContext.class);
		}
		public BlqContext blq(int i) {
			return getRuleContext(BlqContext.class,i);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public SentforContext sentfor() {
			return getRuleContext(SentforContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitSent(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sent);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				((SentContext)_localctx).type = type();
				setState(132);
				((SentContext)_localctx).lid = lid();
				setState(133);
				match(T__10);
				((SentContext)_localctx).v =  myinfo.addSentencia(((SentContext)_localctx).type.v.getPalHTML() + ((SentContext)_localctx).lid.v + ";  ");
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				((SentContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(137);
				((SentContext)_localctx).sent2 = sent2();

				            String id = myinfo.identificadores((((SentContext)_localctx).IDENTIFICADOR!=null?((SentContext)_localctx).IDENTIFICADOR.getText():null)).formatIdentificadores();
				            ((SentContext)_localctx).v =   myinfo.addSentencia(id + ((SentContext)_localctx).sent2.v);
				        
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(T__11);
				setState(141);
				((SentContext)_localctx).exp = exp();
				setState(142);
				match(T__10);

				            String r = myinfo.palres("return ").formatPalres();
				            ((SentContext)_localctx).v =  myinfo.addSentencia(r + ((SentContext)_localctx).exp.v + " ; ");
				        
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				match(T__12);
				setState(146);
				match(T__2);
				setState(147);
				((SentContext)_localctx).lcond = lcond();
				setState(148);
				match(T__3);
				setState(149);
				match(T__13);
				setState(150);
				((SentContext)_localctx).blq = blq();
				setState(151);
				match(T__14);
				setState(152);
				((SentContext)_localctx).blq = blq();

				        String bif = myinfo.palres("bifurcacion ").formatPalres();
				        String entonces = myinfo.palres("entonces ").formatPalres();
				        String sino = myinfo.palres("sino ").formatPalres();
				        ((SentContext)_localctx).v =  myinfo.addSentencia(bif + " ( " + ((SentContext)_localctx).lcond.v + " ) " + entonces + ((SentContext)_localctx).blq.v + sino + ((SentContext)_localctx).blq.v);
				        
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				match(T__15);
				setState(156);
				match(T__2);
				setState(157);
				((SentContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(158);
				((SentContext)_localctx).asig = asig();
				setState(159);
				((SentContext)_localctx).exp = exp();
				setState(160);
				match(T__10);
				setState(161);
				((SentContext)_localctx).lcond = lcond();
				setState(162);
				match(T__10);
				setState(163);
				((SentContext)_localctx).sentfor = sentfor();

				        String buclepara = myinfo.palres("buclepara ").formatPalres();
				        String id = myinfo.identificadores((((SentContext)_localctx).IDENTIFICADOR!=null?((SentContext)_localctx).IDENTIFICADOR.getText():null)).formatIdentificadores();
				        ((SentContext)_localctx).v =  myinfo.addSentencia(buclepara + " ( " + id + ((SentContext)_localctx).asig.v + ((SentContext)_localctx).exp.v + " ; " + ((SentContext)_localctx).lcond.v + " ; " + ((SentContext)_localctx).sentfor.v);
				        
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(166);
				match(T__16);
				setState(167);
				match(T__2);
				setState(168);
				((SentContext)_localctx).lcond = lcond();
				setState(169);
				match(T__3);
				setState(170);
				((SentContext)_localctx).blq = blq();

				            String buclemientras = myinfo.palres("buclemientras ").formatPalres();
				            ((SentContext)_localctx).v =  myinfo.addSentencia(buclemientras + " ( " + ((SentContext)_localctx).lcond.v + " ) " + ((SentContext)_localctx).blq.v);
				        
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 7);
				{
				setState(173);
				match(T__17);
				setState(174);
				((SentContext)_localctx).blq = blq();
				setState(175);
				match(T__18);
				setState(176);
				match(T__2);
				setState(177);
				((SentContext)_localctx).lcond = lcond();
				setState(178);
				match(T__3);

				            String bucle = myinfo.palres("bucle ").formatPalres();
				            String hasta = myinfo.palres("hasta ").formatPalres();
				            ((SentContext)_localctx).v =  myinfo.addSentencia(bucle + ((SentContext)_localctx).blq.v + hasta + " ( " + ((SentContext)_localctx).lcond.v + " ) ");
				        
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 8);
				{
				setState(181);
				((SentContext)_localctx).blq = blq();
				((SentContext)_localctx).v =  myinfo.addSentencia(((SentContext)_localctx).blq.v);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentforContext extends ParserRuleContext {
		public String v;
		public Token IDENTIFICADOR;
		public AsigContext asig;
		public ExpContext exp;
		public BlqContext blq;
		public TerminalNode IDENTIFICADOR() { return getToken(scriptsParser.IDENTIFICADOR, 0); }
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public SentforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterSentfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitSentfor(this);
		}
	}

	public final SentforContext sentfor() throws RecognitionException {
		SentforContext _localctx = new SentforContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sentfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			((SentforContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(187);
			((SentforContext)_localctx).asig = asig();
			setState(188);
			((SentforContext)_localctx).exp = exp();
			setState(189);
			match(T__3);
			setState(190);
			((SentforContext)_localctx).blq = blq();

			    ((SentforContext)_localctx).v =  (((SentforContext)_localctx).IDENTIFICADOR!=null?((SentforContext)_localctx).IDENTIFICADOR.getText():null) + ((SentforContext)_localctx).asig.v + ((SentforContext)_localctx).exp.v + " ) " + ((SentforContext)_localctx).blq.v;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sent2Context extends ParserRuleContext {
		public String v;
		public Sent3Context sent3;
		public AsigContext asig;
		public ExpContext exp;
		public Sent3Context sent3() {
			return getRuleContext(Sent3Context.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Sent2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterSent2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitSent2(this);
		}
	}

	public final Sent2Context sent2() throws RecognitionException {
		Sent2Context _localctx = new Sent2Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_sent2);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(T__2);
				setState(194);
				((Sent2Context)_localctx).sent3 = sent3();
				((Sent2Context)_localctx).v =  " ( " + ((Sent2Context)_localctx).sent3.v;
				}
				break;
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				((Sent2Context)_localctx).asig = asig();
				setState(198);
				((Sent2Context)_localctx).exp = exp();
				setState(199);
				match(T__10);
				((Sent2Context)_localctx).v =  ((Sent2Context)_localctx).asig.v + ((Sent2Context)_localctx).exp.v + " ; ";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sent3Context extends ParserRuleContext {
		public String v;
		public LidContext lid;
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public Sent3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterSent3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitSent3(this);
		}
	}

	public final Sent3Context sent3() throws RecognitionException {
		Sent3Context _localctx = new Sent3Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_sent3);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				((Sent3Context)_localctx).lid = lid();
				setState(205);
				match(T__3);
				setState(206);
				match(T__10);
				((Sent3Context)_localctx).v =  ((Sent3Context)_localctx).lid.v + " ) " + " ; ";
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(T__3);
				setState(210);
				match(T__10);
				((Sent3Context)_localctx).v =  " ) " + " ; ";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LcondContext extends ParserRuleContext {
		public String v;
		public OplContext opl;
		public LcondContext lcond;
		public Lcond2Context lcond2;
		public CondContext cond;
		public OplContext opl() {
			return getRuleContext(OplContext.class,0);
		}
		public LcondContext lcond() {
			return getRuleContext(LcondContext.class,0);
		}
		public Lcond2Context lcond2() {
			return getRuleContext(Lcond2Context.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public LcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterLcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitLcond(this);
		}
	}

	public final LcondContext lcond() throws RecognitionException {
		LcondContext _localctx = new LcondContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lcond);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				((LcondContext)_localctx).opl = opl();
				setState(215);
				((LcondContext)_localctx).lcond = lcond();
				setState(216);
				((LcondContext)_localctx).lcond2 = lcond2();
				((LcondContext)_localctx).v =  ((LcondContext)_localctx).opl.v + ((LcondContext)_localctx).lcond.v + ((LcondContext)_localctx).lcond2.v;
				}
				break;
			case T__2:
			case T__20:
			case T__21:
			case IDENTIFICADOR:
			case CONSTENTERO:
			case CONSTREAL:
			case CONSTLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				((LcondContext)_localctx).cond = cond();
				setState(220);
				((LcondContext)_localctx).lcond2 = lcond2();
				((LcondContext)_localctx).v =  ((LcondContext)_localctx).cond.v + ((LcondContext)_localctx).lcond2.v;
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(T__19);
				setState(224);
				((LcondContext)_localctx).cond = cond();
				setState(225);
				((LcondContext)_localctx).lcond2 = lcond2();
				((LcondContext)_localctx).v =  myinfo.palres("no ").formatPalres() + ((LcondContext)_localctx).cond.v + ((LcondContext)_localctx).lcond2.v;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lcond2Context extends ParserRuleContext {
		public String v;
		public OplContext opl;
		public LcondContext lcond;
		public OplContext opl() {
			return getRuleContext(OplContext.class,0);
		}
		public LcondContext lcond() {
			return getRuleContext(LcondContext.class,0);
		}
		public Lcond2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcond2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterLcond2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitLcond2(this);
		}
	}

	public final Lcond2Context lcond2() throws RecognitionException {
		Lcond2Context _localctx = new Lcond2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_lcond2);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				((Lcond2Context)_localctx).opl = opl();
				setState(231);
				((Lcond2Context)_localctx).lcond = lcond();
				((Lcond2Context)_localctx).v =  ((Lcond2Context)_localctx).opl.v + ((Lcond2Context)_localctx).lcond.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((Lcond2Context)_localctx).v =  "";
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public String v;
		public ExpContext exp;
		public OprContext opr;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cond);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case IDENTIFICADOR:
			case CONSTENTERO:
			case CONSTREAL:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				((CondContext)_localctx).exp = exp();
				setState(238);
				((CondContext)_localctx).opr = opr();
				setState(239);
				((CondContext)_localctx).exp = exp();
				((CondContext)_localctx).v =  ((CondContext)_localctx).exp.v + ((CondContext)_localctx).opr.v + ((CondContext)_localctx).exp.v;
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(T__20);
				((CondContext)_localctx).v =  myinfo.palres("cierto ").formatPalres();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(T__21);
				((CondContext)_localctx).v =  myinfo.palres("falso ").formatPalres();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OplContext extends ParserRuleContext {
		public String v;
		public OplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterOpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitOpl(this);
		}
	}

	public final OplContext opl() throws RecognitionException {
		OplContext _localctx = new OplContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_opl);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(T__22);
				((OplContext)_localctx).v =  myinfo.palres("y ").formatPalres();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(T__23);
				((OplContext)_localctx).v =  myinfo.palres("o ").formatPalres();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OprContext extends ParserRuleContext {
		public String v;
		public OprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterOpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitOpr(this);
		}
	}

	public final OprContext opr() throws RecognitionException {
		OprContext _localctx = new OprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_opr);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(T__24);
				((OprContext)_localctx).v =  " == ";
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(T__25);
				((OprContext)_localctx).v =  " <> ";
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				match(T__26);
				((OprContext)_localctx).v =  " < ";
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				match(T__27);
				((OprContext)_localctx).v =  " > ";
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 5);
				{
				setState(262);
				match(T__28);
				((OprContext)_localctx).v =  " >= ";
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 6);
				{
				setState(264);
				match(T__29);
				((OprContext)_localctx).v =  " <= ";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LidContext extends ParserRuleContext {
		public String v;
		public Token IDENTIFICADOR;
		public Lid2Context lid2;
		public TerminalNode IDENTIFICADOR() { return getToken(scriptsParser.IDENTIFICADOR, 0); }
		public Lid2Context lid2() {
			return getRuleContext(Lid2Context.class,0);
		}
		public LidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterLid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitLid(this);
		}
	}

	public final LidContext lid() throws RecognitionException {
		LidContext _localctx = new LidContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_lid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			((LidContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(269);
			((LidContext)_localctx).lid2 = lid2();
			((LidContext)_localctx).v =  myinfo.identificadores((((LidContext)_localctx).IDENTIFICADOR!=null?((LidContext)_localctx).IDENTIFICADOR.getText():null)).formatIdentificadores() + ((LidContext)_localctx).lid2.v;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lid2Context extends ParserRuleContext {
		public String v;
		public LidContext lid;
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public Lid2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lid2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterLid2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitLid2(this);
		}
	}

	public final Lid2Context lid2() throws RecognitionException {
		Lid2Context _localctx = new Lid2Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_lid2);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(T__4);
				setState(273);
				((Lid2Context)_localctx).lid = lid();
				((Lid2Context)_localctx).v =  " , " + ((Lid2Context)_localctx).lid.v;
				}
				break;
			case T__3:
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				((Lid2Context)_localctx).v =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsigContext extends ParserRuleContext {
		public String v;
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitAsig(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_asig);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(T__30);
				((AsigContext)_localctx).v =  " = ";
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(T__31);
				((AsigContext)_localctx).v =  " += ";
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				match(T__32);
				((AsigContext)_localctx).v =  " -= ";
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				match(T__33);
				((AsigContext)_localctx).v =  " *= ";
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				match(T__34);
				((AsigContext)_localctx).v =  " /= ";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public String v;
		public FuncionContext funcion;
		public Exp2Context exp2;
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			((ExpContext)_localctx).funcion = funcion();
			setState(292);
			((ExpContext)_localctx).exp2 = exp2();
			((ExpContext)_localctx).v =  ((ExpContext)_localctx).funcion.v + ((ExpContext)_localctx).exp2.v;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp2Context extends ParserRuleContext {
		public String v;
		public OpContext op;
		public FuncionContext funcion;
		public Exp2Context exp2;
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public Exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitExp2(this);
		}
	}

	public final Exp2Context exp2() throws RecognitionException {
		Exp2Context _localctx = new Exp2Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_exp2);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
			case T__37:
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				((Exp2Context)_localctx).op = op();
				setState(296);
				((Exp2Context)_localctx).funcion = funcion();
				setState(297);
				((Exp2Context)_localctx).exp2 = exp2();
				((Exp2Context)_localctx).v =  ((Exp2Context)_localctx).op.v + ((Exp2Context)_localctx).funcion.v + ((Exp2Context)_localctx).exp2.v;
				}
				break;
			case T__3:
			case T__10:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				((Exp2Context)_localctx).v =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionContext extends ParserRuleContext {
		public String v;
		public Token IDENTIFICADOR;
		public Funcion2Context funcion2;
		public ExpContext exp;
		public Token CONSTENTERO;
		public Token CONSTREAL;
		public Token CONSTLIT;
		public TerminalNode IDENTIFICADOR() { return getToken(scriptsParser.IDENTIFICADOR, 0); }
		public Funcion2Context funcion2() {
			return getRuleContext(Funcion2Context.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CONSTENTERO() { return getToken(scriptsParser.CONSTENTERO, 0); }
		public TerminalNode CONSTREAL() { return getToken(scriptsParser.CONSTREAL, 0); }
		public TerminalNode CONSTLIT() { return getToken(scriptsParser.CONSTLIT, 0); }
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitFuncion(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_funcion);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				((FuncionContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(304);
				((FuncionContext)_localctx).funcion2 = funcion2();
				((FuncionContext)_localctx).v =  myinfo.identificadores((((FuncionContext)_localctx).IDENTIFICADOR!=null?((FuncionContext)_localctx).IDENTIFICADOR.getText():null)).formatIdentificadores() + ((FuncionContext)_localctx).funcion2.v;
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				match(T__2);
				setState(308);
				((FuncionContext)_localctx).exp = exp();
				setState(309);
				match(T__3);
				((FuncionContext)_localctx).v =  " ( " + ((FuncionContext)_localctx).exp.v + " ) ";
				}
				break;
			case CONSTENTERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				((FuncionContext)_localctx).CONSTENTERO = match(CONSTENTERO);
				((FuncionContext)_localctx).v =  myinfo.constante((((FuncionContext)_localctx).CONSTENTERO!=null?((FuncionContext)_localctx).CONSTENTERO.getText():null)).formatConstante();
				}
				break;
			case CONSTREAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(314);
				((FuncionContext)_localctx).CONSTREAL = match(CONSTREAL);
				((FuncionContext)_localctx).v =  myinfo.constante((((FuncionContext)_localctx).CONSTREAL!=null?((FuncionContext)_localctx).CONSTREAL.getText():null)).formatConstante();
				}
				break;
			case CONSTLIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(316);
				((FuncionContext)_localctx).CONSTLIT = match(CONSTLIT);
				((FuncionContext)_localctx).v =  myinfo.constante((((FuncionContext)_localctx).CONSTLIT!=null?((FuncionContext)_localctx).CONSTLIT.getText():null)).formatConstante();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Funcion2Context extends ParserRuleContext {
		public String v;
		public LidContext lid;
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public Funcion2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterFuncion2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitFuncion2(this);
		}
	}

	public final Funcion2Context funcion2() throws RecognitionException {
		Funcion2Context _localctx = new Funcion2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_funcion2);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(T__2);
				setState(321);
				((Funcion2Context)_localctx).lid = lid();
				setState(322);
				match(T__3);
				((Funcion2Context)_localctx).v =  " ( " + ((Funcion2Context)_localctx).lid.v + " ) \n";
				}
				break;
			case T__3:
			case T__10:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				((Funcion2Context)_localctx).v =  " ";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpContext extends ParserRuleContext {
		public String v;
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scriptsListener ) ((scriptsListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_op);
		try {
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(T__35);
				((OpContext)_localctx).v =  " + ";
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(T__36);
				((OpContext)_localctx).v =  " - ";
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				match(T__37);
				((OpContext)_localctx).v =  " * " ;
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				match(T__38);
				((OpContext)_localctx).v =  " / ";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0155\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\5\3D\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4O\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6_\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bl\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tt\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u0084"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u00bb\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00cd\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00d7\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e7\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00ee\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f9"+
		"\n\23\3\24\3\24\3\24\3\24\5\24\u00ff\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u010d\n\25\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0118\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u0124\n\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u0130\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0141\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u0149\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0153"+
		"\n\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668\2\2\2\u0161\2:\3\2\2\2\4C\3\2\2\2\6N\3\2\2\2\bP\3\2\2\2\n^\3\2"+
		"\2\2\f`\3\2\2\2\16k\3\2\2\2\20s\3\2\2\2\22u\3\2\2\2\24z\3\2\2\2\26\u0083"+
		"\3\2\2\2\30\u00ba\3\2\2\2\32\u00bc\3\2\2\2\34\u00cc\3\2\2\2\36\u00d6\3"+
		"\2\2\2 \u00e6\3\2\2\2\"\u00ed\3\2\2\2$\u00f8\3\2\2\2&\u00fe\3\2\2\2(\u010c"+
		"\3\2\2\2*\u010e\3\2\2\2,\u0117\3\2\2\2.\u0123\3\2\2\2\60\u0125\3\2\2\2"+
		"\62\u012f\3\2\2\2\64\u0140\3\2\2\2\66\u0148\3\2\2\28\u0152\3\2\2\2:;\5"+
		"\6\4\2;<\5\4\3\2<=\b\2\1\2=\3\3\2\2\2>?\5\6\4\2?@\5\4\3\2@A\b\3\1\2AD"+
		"\3\2\2\2BD\b\3\1\2C>\3\2\2\2CB\3\2\2\2D\5\3\2\2\2EF\7\3\2\2FG\5\20\t\2"+
		"GH\5\b\5\2HI\b\4\1\2IO\3\2\2\2JK\7\4\2\2KL\5\b\5\2LM\b\4\1\2MO\3\2\2\2"+
		"NE\3\2\2\2NJ\3\2\2\2O\7\3\2\2\2PQ\7*\2\2QR\7\5\2\2RS\5\n\6\2ST\b\5\1\2"+
		"T\t\3\2\2\2UV\5\f\7\2VW\7\6\2\2WX\5\22\n\2XY\b\6\1\2Y_\3\2\2\2Z[\7\6\2"+
		"\2[\\\5\22\n\2\\]\b\6\1\2]_\3\2\2\2^U\3\2\2\2^Z\3\2\2\2_\13\3\2\2\2`a"+
		"\5\20\t\2ab\7*\2\2bc\5\16\b\2cd\b\7\1\2d\r\3\2\2\2ef\7\7\2\2fg\5\20\t"+
		"\2gh\7*\2\2hi\b\b\1\2il\3\2\2\2jl\b\b\1\2ke\3\2\2\2kj\3\2\2\2l\17\3\2"+
		"\2\2mn\7\b\2\2nt\b\t\1\2op\7\t\2\2pt\b\t\1\2qr\7\n\2\2rt\b\t\1\2sm\3\2"+
		"\2\2so\3\2\2\2sq\3\2\2\2t\21\3\2\2\2uv\7\13\2\2vw\5\24\13\2wx\7\f\2\2"+
		"xy\b\n\1\2y\23\3\2\2\2z{\5\30\r\2{|\5\26\f\2|}\b\13\1\2}\25\3\2\2\2~\177"+
		"\5\30\r\2\177\u0080\5\26\f\2\u0080\u0081\b\f\1\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0084\b\f\1\2\u0083~\3\2\2\2\u0083\u0082\3\2\2\2\u0084\27\3\2\2\2\u0085"+
		"\u0086\5\20\t\2\u0086\u0087\5*\26\2\u0087\u0088\7\r\2\2\u0088\u0089\b"+
		"\r\1\2\u0089\u00bb\3\2\2\2\u008a\u008b\7*\2\2\u008b\u008c\5\34\17\2\u008c"+
		"\u008d\b\r\1\2\u008d\u00bb\3\2\2\2\u008e\u008f\7\16\2\2\u008f\u0090\5"+
		"\60\31\2\u0090\u0091\7\r\2\2\u0091\u0092\b\r\1\2\u0092\u00bb\3\2\2\2\u0093"+
		"\u0094\7\17\2\2\u0094\u0095\7\5\2\2\u0095\u0096\5 \21\2\u0096\u0097\7"+
		"\6\2\2\u0097\u0098\7\20\2\2\u0098\u0099\5\22\n\2\u0099\u009a\7\21\2\2"+
		"\u009a\u009b\5\22\n\2\u009b\u009c\b\r\1\2\u009c\u00bb\3\2\2\2\u009d\u009e"+
		"\7\22\2\2\u009e\u009f\7\5\2\2\u009f\u00a0\7*\2\2\u00a0\u00a1\5.\30\2\u00a1"+
		"\u00a2\5\60\31\2\u00a2\u00a3\7\r\2\2\u00a3\u00a4\5 \21\2\u00a4\u00a5\7"+
		"\r\2\2\u00a5\u00a6\5\32\16\2\u00a6\u00a7\b\r\1\2\u00a7\u00bb\3\2\2\2\u00a8"+
		"\u00a9\7\23\2\2\u00a9\u00aa\7\5\2\2\u00aa\u00ab\5 \21\2\u00ab\u00ac\7"+
		"\6\2\2\u00ac\u00ad\5\22\n\2\u00ad\u00ae\b\r\1\2\u00ae\u00bb\3\2\2\2\u00af"+
		"\u00b0\7\24\2\2\u00b0\u00b1\5\22\n\2\u00b1\u00b2\7\25\2\2\u00b2\u00b3"+
		"\7\5\2\2\u00b3\u00b4\5 \21\2\u00b4\u00b5\7\6\2\2\u00b5\u00b6\b\r\1\2\u00b6"+
		"\u00bb\3\2\2\2\u00b7\u00b8\5\22\n\2\u00b8\u00b9\b\r\1\2\u00b9\u00bb\3"+
		"\2\2\2\u00ba\u0085\3\2\2\2\u00ba\u008a\3\2\2\2\u00ba\u008e\3\2\2\2\u00ba"+
		"\u0093\3\2\2\2\u00ba\u009d\3\2\2\2\u00ba\u00a8\3\2\2\2\u00ba\u00af\3\2"+
		"\2\2\u00ba\u00b7\3\2\2\2\u00bb\31\3\2\2\2\u00bc\u00bd\7*\2\2\u00bd\u00be"+
		"\5.\30\2\u00be\u00bf\5\60\31\2\u00bf\u00c0\7\6\2\2\u00c0\u00c1\5\22\n"+
		"\2\u00c1\u00c2\b\16\1\2\u00c2\33\3\2\2\2\u00c3\u00c4\7\5\2\2\u00c4\u00c5"+
		"\5\36\20\2\u00c5\u00c6\b\17\1\2\u00c6\u00cd\3\2\2\2\u00c7\u00c8\5.\30"+
		"\2\u00c8\u00c9\5\60\31\2\u00c9\u00ca\7\r\2\2\u00ca\u00cb\b\17\1\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00c3\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cd\35\3\2\2"+
		"\2\u00ce\u00cf\5*\26\2\u00cf\u00d0\7\6\2\2\u00d0\u00d1\7\r\2\2\u00d1\u00d2"+
		"\b\20\1\2\u00d2\u00d7\3\2\2\2\u00d3\u00d4\7\6\2\2\u00d4\u00d5\7\r\2\2"+
		"\u00d5\u00d7\b\20\1\2\u00d6\u00ce\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d7\37"+
		"\3\2\2\2\u00d8\u00d9\5&\24\2\u00d9\u00da\5 \21\2\u00da\u00db\5\"\22\2"+
		"\u00db\u00dc\b\21\1\2\u00dc\u00e7\3\2\2\2\u00dd\u00de\5$\23\2\u00de\u00df"+
		"\5\"\22\2\u00df\u00e0\b\21\1\2\u00e0\u00e7\3\2\2\2\u00e1\u00e2\7\26\2"+
		"\2\u00e2\u00e3\5$\23\2\u00e3\u00e4\5\"\22\2\u00e4\u00e5\b\21\1\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00d8\3\2\2\2\u00e6\u00dd\3\2\2\2\u00e6\u00e1\3\2"+
		"\2\2\u00e7!\3\2\2\2\u00e8\u00e9\5&\24\2\u00e9\u00ea\5 \21\2\u00ea\u00eb"+
		"\b\22\1\2\u00eb\u00ee\3\2\2\2\u00ec\u00ee\b\22\1\2\u00ed\u00e8\3\2\2\2"+
		"\u00ed\u00ec\3\2\2\2\u00ee#\3\2\2\2\u00ef\u00f0\5\60\31\2\u00f0\u00f1"+
		"\5(\25\2\u00f1\u00f2\5\60\31\2\u00f2\u00f3\b\23\1\2\u00f3\u00f9\3\2\2"+
		"\2\u00f4\u00f5\7\27\2\2\u00f5\u00f9\b\23\1\2\u00f6\u00f7\7\30\2\2\u00f7"+
		"\u00f9\b\23\1\2\u00f8\u00ef\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f8\u00f6\3"+
		"\2\2\2\u00f9%\3\2\2\2\u00fa\u00fb\7\31\2\2\u00fb\u00ff\b\24\1\2\u00fc"+
		"\u00fd\7\32\2\2\u00fd\u00ff\b\24\1\2\u00fe\u00fa\3\2\2\2\u00fe\u00fc\3"+
		"\2\2\2\u00ff\'\3\2\2\2\u0100\u0101\7\33\2\2\u0101\u010d\b\25\1\2\u0102"+
		"\u0103\7\34\2\2\u0103\u010d\b\25\1\2\u0104\u0105\7\35\2\2\u0105\u010d"+
		"\b\25\1\2\u0106\u0107\7\36\2\2\u0107\u010d\b\25\1\2\u0108\u0109\7\37\2"+
		"\2\u0109\u010d\b\25\1\2\u010a\u010b\7 \2\2\u010b\u010d\b\25\1\2\u010c"+
		"\u0100\3\2\2\2\u010c\u0102\3\2\2\2\u010c\u0104\3\2\2\2\u010c\u0106\3\2"+
		"\2\2\u010c\u0108\3\2\2\2\u010c\u010a\3\2\2\2\u010d)\3\2\2\2\u010e\u010f"+
		"\7*\2\2\u010f\u0110\5,\27\2\u0110\u0111\b\26\1\2\u0111+\3\2\2\2\u0112"+
		"\u0113\7\7\2\2\u0113\u0114\5*\26\2\u0114\u0115\b\27\1\2\u0115\u0118\3"+
		"\2\2\2\u0116\u0118\b\27\1\2\u0117\u0112\3\2\2\2\u0117\u0116\3\2\2\2\u0118"+
		"-\3\2\2\2\u0119\u011a\7!\2\2\u011a\u0124\b\30\1\2\u011b\u011c\7\"\2\2"+
		"\u011c\u0124\b\30\1\2\u011d\u011e\7#\2\2\u011e\u0124\b\30\1\2\u011f\u0120"+
		"\7$\2\2\u0120\u0124\b\30\1\2\u0121\u0122\7%\2\2\u0122\u0124\b\30\1\2\u0123"+
		"\u0119\3\2\2\2\u0123\u011b\3\2\2\2\u0123\u011d\3\2\2\2\u0123\u011f\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0124/\3\2\2\2\u0125\u0126\5\64\33\2\u0126\u0127"+
		"\5\62\32\2\u0127\u0128\b\31\1\2\u0128\61\3\2\2\2\u0129\u012a\58\35\2\u012a"+
		"\u012b\5\64\33\2\u012b\u012c\5\62\32\2\u012c\u012d\b\32\1\2\u012d\u0130"+
		"\3\2\2\2\u012e\u0130\b\32\1\2\u012f\u0129\3\2\2\2\u012f\u012e\3\2\2\2"+
		"\u0130\63\3\2\2\2\u0131\u0132\7*\2\2\u0132\u0133\5\66\34\2\u0133\u0134"+
		"\b\33\1\2\u0134\u0141\3\2\2\2\u0135\u0136\7\5\2\2\u0136\u0137\5\60\31"+
		"\2\u0137\u0138\7\6\2\2\u0138\u0139\b\33\1\2\u0139\u0141\3\2\2\2\u013a"+
		"\u013b\7+\2\2\u013b\u0141\b\33\1\2\u013c\u013d\7,\2\2\u013d\u0141\b\33"+
		"\1\2\u013e\u013f\7-\2\2\u013f\u0141\b\33\1\2\u0140\u0131\3\2\2\2\u0140"+
		"\u0135\3\2\2\2\u0140\u013a\3\2\2\2\u0140\u013c\3\2\2\2\u0140\u013e\3\2"+
		"\2\2\u0141\65\3\2\2\2\u0142\u0143\7\5\2\2\u0143\u0144\5*\26\2\u0144\u0145"+
		"\7\6\2\2\u0145\u0146\b\34\1\2\u0146\u0149\3\2\2\2\u0147\u0149\b\34\1\2"+
		"\u0148\u0142\3\2\2\2\u0148\u0147\3\2\2\2\u0149\67\3\2\2\2\u014a\u014b"+
		"\7&\2\2\u014b\u0153\b\35\1\2\u014c\u014d\7\'\2\2\u014d\u0153\b\35\1\2"+
		"\u014e\u014f\7(\2\2\u014f\u0153\b\35\1\2\u0150\u0151\7)\2\2\u0151\u0153"+
		"\b\35\1\2\u0152\u014a\3\2\2\2\u0152\u014c\3\2\2\2\u0152\u014e\3\2\2\2"+
		"\u0152\u0150\3\2\2\2\u01539\3\2\2\2\26CN^ks\u0083\u00ba\u00cc\u00d6\u00e6"+
		"\u00ed\u00f8\u00fe\u010c\u0117\u0123\u012f\u0140\u0148\u0152";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}