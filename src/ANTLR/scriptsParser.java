// Generated from scripts.g4 by ANTLR 4.9.1

package ANTLR;


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
		T__17=18, T__18=19, T__19=20, T__20=21, IDENTIFICADOR=22, CONSTENTERO=23, 
		CONSTREAL=24, CONSTLIT=25, COMENTARIOLINEA=26, COMENTARIOMULTI=27, WS=28;
	public static final int
		RULE_program = 0, RULE_program2 = 1, RULE_part = 2, RULE_restpart = 3, 
		RULE_restpart2 = 4, RULE_listparam = 5, RULE_listparam2 = 6, RULE_type = 7, 
		RULE_blq = 8, RULE_sentlist = 9, RULE_sentlist2 = 10, RULE_sent = 11, 
		RULE_sent2 = 12, RULE_sent3 = 13, RULE_lid = 14, RULE_lid2 = 15, RULE_asig = 16, 
		RULE_exp = 17, RULE_exp2 = 18, RULE_funcion = 19, RULE_funcion2 = 20, 
		RULE_op = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "program2", "part", "restpart", "restpart2", "listparam", 
			"listparam2", "type", "blq", "sentlist", "sentlist2", "sent", "sent2", 
			"sent3", "lid", "lid2", "asig", "exp", "exp2", "funcion", "funcion2", 
			"op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'funcion'", "'procedimiento'", "'('", "')'", "','", "'entero'", 
			"'real'", "'caracter'", "'inicio'", "'fin'", "';'", "'return'", "'='", 
			"'+='", "'-='", "'*='", "'/='", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "IDENTIFICADOR", 
			"CONSTENTERO", "CONSTREAL", "CONSTLIT", "COMENTARIOLINEA", "COMENTARIOMULTI", 
			"WS"
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
			setState(44);
			((ProgramContext)_localctx).part = part();
			setState(45);
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
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				((Program2Context)_localctx).part = part();
				setState(49);
				((Program2Context)_localctx).program2 = program2();
				((Program2Context)_localctx).v =  ((Program2Context)_localctx).part.v + ((Program2Context)_localctx).program2.v;
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				((Program2Context)_localctx).v =  "";
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
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(T__0);
				setState(56);
				((PartContext)_localctx).type = type();
				setState(57);
				((PartContext)_localctx).restpart = restpart();
				((PartContext)_localctx).v =  "funcion " + ((PartContext)_localctx).type.v + ((PartContext)_localctx).restpart.v;myinfo.newDec(_localctx.v);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(T__1);
				setState(61);
				((PartContext)_localctx).restpart = restpart();
				((PartContext)_localctx).v =  "procedimiento" + ((PartContext)_localctx).restpart.v;myinfo.newDec(_localctx.v);
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
		public String v;
		public Token IDENTIFICADOR;
		public Restpart2Context restpart2;
		public TerminalNode IDENTIFICADOR() { return getToken(scriptsParser.IDENTIFICADOR, 0); }
		public Restpart2Context restpart2() {
			return getRuleContext(Restpart2Context.class,0);
		}
		public RestpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final RestpartContext restpart() throws RecognitionException {
		RestpartContext _localctx = new RestpartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_restpart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			((RestpartContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(67);
			match(T__2);
			setState(68);
			((RestpartContext)_localctx).restpart2 = restpart2();
			((RestpartContext)_localctx).v =  (((RestpartContext)_localctx).IDENTIFICADOR!=null?((RestpartContext)_localctx).IDENTIFICADOR.getText():null) + "(" + ((RestpartContext)_localctx).restpart2.v;
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
		public String v;
		public ListparamContext listparam;
		public BlqContext blq;
		public ListparamContext listparam() {
			return getRuleContext(ListparamContext.class,0);
		}
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public Restpart2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Restpart2Context restpart2() throws RecognitionException {
		Restpart2Context _localctx = new Restpart2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_restpart2);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				((Restpart2Context)_localctx).listparam = listparam();
				setState(72);
				match(T__3);
				setState(73);
				((Restpart2Context)_localctx).blq = blq();
				((Restpart2Context)_localctx).v =  ((Restpart2Context)_localctx).listparam.v + ")" + ((Restpart2Context)_localctx).blq.v;
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(T__3);
				setState(77);
				((Restpart2Context)_localctx).blq = blq();
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
		public String v;
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
			setState(82);
			((ListparamContext)_localctx).type = type();
			setState(83);
			((ListparamContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(84);
			((ListparamContext)_localctx).listparam2 = listparam2();
			((ListparamContext)_localctx).v =  ((ListparamContext)_localctx).type.v + (((ListparamContext)_localctx).IDENTIFICADOR!=null?((ListparamContext)_localctx).IDENTIFICADOR.getText():null) + ((ListparamContext)_localctx).listparam2.v;
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
		public String v;
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
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(T__4);
				setState(88);
				((Listparam2Context)_localctx).type = type();
				setState(89);
				((Listparam2Context)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				((Listparam2Context)_localctx).v =  "," + ((Listparam2Context)_localctx).type.v + (((Listparam2Context)_localctx).IDENTIFICADOR!=null?((Listparam2Context)_localctx).IDENTIFICADOR.getText():null);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				((Listparam2Context)_localctx).v =  "";
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
		public String v;
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
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(T__5);
				((TypeContext)_localctx).v =  "entero";
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(T__6);
				((TypeContext)_localctx).v =  "real";
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(T__7);
				((TypeContext)_localctx).v =  "caracter";
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
			setState(103);
			match(T__8);
			setState(104);
			((BlqContext)_localctx).sentlist = sentlist();
			setState(105);
			match(T__9);
			((BlqContext)_localctx).v =  "inicio" + ((BlqContext)_localctx).sentlist.v + "fin";
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
			setState(108);
			((SentlistContext)_localctx).sent = sent();
			setState(109);
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
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
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
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
			case T__11:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				((Sentlist2Context)_localctx).sent = sent();
				((Sentlist2Context)_localctx).v =  ((Sentlist2Context)_localctx).sent.v;
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
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				((SentContext)_localctx).type = type();
				setState(119);
				((SentContext)_localctx).lid = lid();
				setState(120);
				match(T__10);
				((SentContext)_localctx).v =  ((SentContext)_localctx).type.v + ((SentContext)_localctx).lid.v + ";";
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				((SentContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(124);
				((SentContext)_localctx).sent2 = sent2();
				((SentContext)_localctx).v =  (((SentContext)_localctx).IDENTIFICADOR!=null?((SentContext)_localctx).IDENTIFICADOR.getText():null) + ((SentContext)_localctx).sent2.v;
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				match(T__11);
				setState(128);
				((SentContext)_localctx).exp = exp();
				setState(129);
				match(T__10);
				((SentContext)_localctx).v =  "return" + ((SentContext)_localctx).exp.v + ";";
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
		enterRule(_localctx, 24, RULE_sent2);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(T__2);
				setState(135);
				((Sent2Context)_localctx).sent3 = sent3();
				((Sent2Context)_localctx).v =  "(" + ((Sent2Context)_localctx).sent3.v;
				}
				break;
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				((Sent2Context)_localctx).asig = asig();
				setState(139);
				((Sent2Context)_localctx).exp = exp();
				setState(140);
				match(T__10);
				((Sent2Context)_localctx).v =  ((Sent2Context)_localctx).asig.v + ((Sent2Context)_localctx).exp.v;
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
		enterRule(_localctx, 26, RULE_sent3);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				((Sent3Context)_localctx).lid = lid();
				setState(146);
				match(T__3);
				setState(147);
				match(T__10);
				((Sent3Context)_localctx).v =  ((Sent3Context)_localctx).lid.v + ")" + ";";
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(T__3);
				setState(151);
				match(T__10);
				((Sent3Context)_localctx).v =  ")" + ";";
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
		enterRule(_localctx, 28, RULE_lid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			((LidContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(156);
			((LidContext)_localctx).lid2 = lid2();
			((LidContext)_localctx).v =  (((LidContext)_localctx).IDENTIFICADOR!=null?((LidContext)_localctx).IDENTIFICADOR.getText():null) + ((LidContext)_localctx).lid2.v;
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
		enterRule(_localctx, 30, RULE_lid2);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(T__4);
				setState(160);
				((Lid2Context)_localctx).lid = lid();
				((Lid2Context)_localctx).v =  "," + ((Lid2Context)_localctx).lid.v;
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
		enterRule(_localctx, 32, RULE_asig);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(T__12);
				((AsigContext)_localctx).v =  "=";
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(T__13);
				((AsigContext)_localctx).v =  "+=";
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(T__14);
				((AsigContext)_localctx).v =  "-=";
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(T__15);
				((AsigContext)_localctx).v =  "*=";
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				match(T__16);
				((AsigContext)_localctx).v =  "/=";
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
		enterRule(_localctx, 34, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			((ExpContext)_localctx).funcion = funcion();
			setState(179);
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
		enterRule(_localctx, 36, RULE_exp2);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				((Exp2Context)_localctx).op = op();
				setState(183);
				((Exp2Context)_localctx).funcion = funcion();
				setState(184);
				((Exp2Context)_localctx).exp2 = exp2();
				((Exp2Context)_localctx).v =  ((Exp2Context)_localctx).op.v + ((Exp2Context)_localctx).funcion.v + ((Exp2Context)_localctx).exp2.v;
				}
				break;
			case T__3:
			case T__10:
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
		enterRule(_localctx, 38, RULE_funcion);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				((FuncionContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(191);
				((FuncionContext)_localctx).funcion2 = funcion2();
				((FuncionContext)_localctx).v =  (((FuncionContext)_localctx).IDENTIFICADOR!=null?((FuncionContext)_localctx).IDENTIFICADOR.getText():null) + ((FuncionContext)_localctx).funcion2.v;
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(T__2);
				setState(195);
				((FuncionContext)_localctx).exp = exp();
				setState(196);
				match(T__3);
				((FuncionContext)_localctx).v =  "(" + ((FuncionContext)_localctx).exp.v + ")";
				}
				break;
			case CONSTENTERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				((FuncionContext)_localctx).CONSTENTERO = match(CONSTENTERO);
				((FuncionContext)_localctx).v =  (((FuncionContext)_localctx).CONSTENTERO!=null?((FuncionContext)_localctx).CONSTENTERO.getText():null);
				}
				break;
			case CONSTREAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				((FuncionContext)_localctx).CONSTREAL = match(CONSTREAL);
				((FuncionContext)_localctx).v =  (((FuncionContext)_localctx).CONSTREAL!=null?((FuncionContext)_localctx).CONSTREAL.getText():null);
				}
				break;
			case CONSTLIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				((FuncionContext)_localctx).CONSTLIT = match(CONSTLIT);
				((FuncionContext)_localctx).v =  (((FuncionContext)_localctx).CONSTLIT!=null?((FuncionContext)_localctx).CONSTLIT.getText():null);
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
		enterRule(_localctx, 40, RULE_funcion2);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(T__2);
				setState(208);
				((Funcion2Context)_localctx).lid = lid();
				setState(209);
				match(T__3);
				((Funcion2Context)_localctx).v =  "(" + ((Funcion2Context)_localctx).lid.v + ")\n";
				}
				break;
			case T__3:
			case T__10:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
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
		enterRule(_localctx, 42, RULE_op);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(T__17);
				((OpContext)_localctx).v =  "+";
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(T__18);
				((OpContext)_localctx).v =  "-";
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(T__19);
				((OpContext)_localctx).v =  "*";
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				match(T__20);
				((OpContext)_localctx).v =  "/";
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00e4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\5\38\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4C\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6S\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b`\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\th\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\5\fw\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u0087\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0092\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u009c\n\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00a7\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00b3\n\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00bf\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00d0\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u00d8\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u00e2\n\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,\2\2\2\u00e6\2.\3\2\2\2\4\67\3\2\2\2\6B\3\2\2\2\bD\3\2\2\2\nR\3\2"+
		"\2\2\fT\3\2\2\2\16_\3\2\2\2\20g\3\2\2\2\22i\3\2\2\2\24n\3\2\2\2\26v\3"+
		"\2\2\2\30\u0086\3\2\2\2\32\u0091\3\2\2\2\34\u009b\3\2\2\2\36\u009d\3\2"+
		"\2\2 \u00a6\3\2\2\2\"\u00b2\3\2\2\2$\u00b4\3\2\2\2&\u00be\3\2\2\2(\u00cf"+
		"\3\2\2\2*\u00d7\3\2\2\2,\u00e1\3\2\2\2./\5\6\4\2/\60\5\4\3\2\60\61\b\2"+
		"\1\2\61\3\3\2\2\2\62\63\5\6\4\2\63\64\5\4\3\2\64\65\b\3\1\2\658\3\2\2"+
		"\2\668\b\3\1\2\67\62\3\2\2\2\67\66\3\2\2\28\5\3\2\2\29:\7\3\2\2:;\5\20"+
		"\t\2;<\5\b\5\2<=\b\4\1\2=C\3\2\2\2>?\7\4\2\2?@\5\b\5\2@A\b\4\1\2AC\3\2"+
		"\2\2B9\3\2\2\2B>\3\2\2\2C\7\3\2\2\2DE\7\30\2\2EF\7\5\2\2FG\5\n\6\2GH\b"+
		"\5\1\2H\t\3\2\2\2IJ\5\f\7\2JK\7\6\2\2KL\5\22\n\2LM\b\6\1\2MS\3\2\2\2N"+
		"O\7\6\2\2OP\5\22\n\2PQ\b\6\1\2QS\3\2\2\2RI\3\2\2\2RN\3\2\2\2S\13\3\2\2"+
		"\2TU\5\20\t\2UV\7\30\2\2VW\5\16\b\2WX\b\7\1\2X\r\3\2\2\2YZ\7\7\2\2Z[\5"+
		"\20\t\2[\\\7\30\2\2\\]\b\b\1\2]`\3\2\2\2^`\b\b\1\2_Y\3\2\2\2_^\3\2\2\2"+
		"`\17\3\2\2\2ab\7\b\2\2bh\b\t\1\2cd\7\t\2\2dh\b\t\1\2ef\7\n\2\2fh\b\t\1"+
		"\2ga\3\2\2\2gc\3\2\2\2ge\3\2\2\2h\21\3\2\2\2ij\7\13\2\2jk\5\24\13\2kl"+
		"\7\f\2\2lm\b\n\1\2m\23\3\2\2\2no\5\30\r\2op\5\26\f\2pq\b\13\1\2q\25\3"+
		"\2\2\2rs\5\30\r\2st\b\f\1\2tw\3\2\2\2uw\b\f\1\2vr\3\2\2\2vu\3\2\2\2w\27"+
		"\3\2\2\2xy\5\20\t\2yz\5\36\20\2z{\7\r\2\2{|\b\r\1\2|\u0087\3\2\2\2}~\7"+
		"\30\2\2~\177\5\32\16\2\177\u0080\b\r\1\2\u0080\u0087\3\2\2\2\u0081\u0082"+
		"\7\16\2\2\u0082\u0083\5$\23\2\u0083\u0084\7\r\2\2\u0084\u0085\b\r\1\2"+
		"\u0085\u0087\3\2\2\2\u0086x\3\2\2\2\u0086}\3\2\2\2\u0086\u0081\3\2\2\2"+
		"\u0087\31\3\2\2\2\u0088\u0089\7\5\2\2\u0089\u008a\5\34\17\2\u008a\u008b"+
		"\b\16\1\2\u008b\u0092\3\2\2\2\u008c\u008d\5\"\22\2\u008d\u008e\5$\23\2"+
		"\u008e\u008f\7\r\2\2\u008f\u0090\b\16\1\2\u0090\u0092\3\2\2\2\u0091\u0088"+
		"\3\2\2\2\u0091\u008c\3\2\2\2\u0092\33\3\2\2\2\u0093\u0094\5\36\20\2\u0094"+
		"\u0095\7\6\2\2\u0095\u0096\7\r\2\2\u0096\u0097\b\17\1\2\u0097\u009c\3"+
		"\2\2\2\u0098\u0099\7\6\2\2\u0099\u009a\7\r\2\2\u009a\u009c\b\17\1\2\u009b"+
		"\u0093\3\2\2\2\u009b\u0098\3\2\2\2\u009c\35\3\2\2\2\u009d\u009e\7\30\2"+
		"\2\u009e\u009f\5 \21\2\u009f\u00a0\b\20\1\2\u00a0\37\3\2\2\2\u00a1\u00a2"+
		"\7\7\2\2\u00a2\u00a3\5\36\20\2\u00a3\u00a4\b\21\1\2\u00a4\u00a7\3\2\2"+
		"\2\u00a5\u00a7\b\21\1\2\u00a6\u00a1\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"!\3\2\2\2\u00a8\u00a9\7\17\2\2\u00a9\u00b3\b\22\1\2\u00aa\u00ab\7\20\2"+
		"\2\u00ab\u00b3\b\22\1\2\u00ac\u00ad\7\21\2\2\u00ad\u00b3\b\22\1\2\u00ae"+
		"\u00af\7\22\2\2\u00af\u00b3\b\22\1\2\u00b0\u00b1\7\23\2\2\u00b1\u00b3"+
		"\b\22\1\2\u00b2\u00a8\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b2\u00ac\3\2\2\2"+
		"\u00b2\u00ae\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3#\3\2\2\2\u00b4\u00b5\5"+
		"(\25\2\u00b5\u00b6\5&\24\2\u00b6\u00b7\b\23\1\2\u00b7%\3\2\2\2\u00b8\u00b9"+
		"\5,\27\2\u00b9\u00ba\5(\25\2\u00ba\u00bb\5&\24\2\u00bb\u00bc\b\24\1\2"+
		"\u00bc\u00bf\3\2\2\2\u00bd\u00bf\b\24\1\2\u00be\u00b8\3\2\2\2\u00be\u00bd"+
		"\3\2\2\2\u00bf\'\3\2\2\2\u00c0\u00c1\7\30\2\2\u00c1\u00c2\5*\26\2\u00c2"+
		"\u00c3\b\25\1\2\u00c3\u00d0\3\2\2\2\u00c4\u00c5\7\5\2\2\u00c5\u00c6\5"+
		"$\23\2\u00c6\u00c7\7\6\2\2\u00c7\u00c8\b\25\1\2\u00c8\u00d0\3\2\2\2\u00c9"+
		"\u00ca\7\31\2\2\u00ca\u00d0\b\25\1\2\u00cb\u00cc\7\32\2\2\u00cc\u00d0"+
		"\b\25\1\2\u00cd\u00ce\7\33\2\2\u00ce\u00d0\b\25\1\2\u00cf\u00c0\3\2\2"+
		"\2\u00cf\u00c4\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00cb\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00d0)\3\2\2\2\u00d1\u00d2\7\5\2\2\u00d2\u00d3\5\36\20\2\u00d3"+
		"\u00d4\7\6\2\2\u00d4\u00d5\b\26\1\2\u00d5\u00d8\3\2\2\2\u00d6\u00d8\b"+
		"\26\1\2\u00d7\u00d1\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8+\3\2\2\2\u00d9\u00da"+
		"\7\24\2\2\u00da\u00e2\b\27\1\2\u00db\u00dc\7\25\2\2\u00dc\u00e2\b\27\1"+
		"\2\u00dd\u00de\7\26\2\2\u00de\u00e2\b\27\1\2\u00df\u00e0\7\27\2\2\u00e0"+
		"\u00e2\b\27\1\2\u00e1\u00d9\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1\u00dd\3"+
		"\2\2\2\u00e1\u00df\3\2\2\2\u00e2-\3\2\2\2\21\67BR_gv\u0086\u0091\u009b"+
		"\u00a6\u00b2\u00be\u00cf\u00d7\u00e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}