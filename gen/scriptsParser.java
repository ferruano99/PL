// Generated from C:/Users/ferna/Desktop/Universidad/3/2cuatri/PL/PracticaObligatoria/src\scripts.g4 by ANTLR 4.9.1
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
		T__17=18, T__18=19, T__19=20, IDENTIFICADOR=21, CONSTENTERO=22, CONSTREAL=23, 
		CONSTLIT=24, COMENTARIOLINEA=25, COMENTARIOMULTI=26, WS=27;
	public static final int
		RULE_program = 0, RULE_program2 = 1, RULE_part = 2, RULE_restpart = 3, 
		RULE_restpart2 = 4, RULE_listparam = 5, RULE_listparam2 = 6, RULE_type = 7, 
		RULE_blq = 8, RULE_sentlist = 9, RULE_sentlist2 = 10, RULE_sent = 11, 
		RULE_lid = 12, RULE_lid2 = 13, RULE_asig = 14, RULE_funcion = 15, RULE_funcion2 = 16, 
		RULE_exp = 17, RULE_exp2 = 18, RULE_op = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "program2", "part", "restpart", "restpart2", "listparam", 
			"listparam2", "type", "blq", "sentlist", "sentlist2", "sent", "lid", 
			"lid2", "asig", "funcion", "funcion2", "exp", "exp2", "op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'funcion'", "'procedimiento'", "'('", "')'", "','", "'entero'", 
			"'real'", "'caracter'", "'inicio'", "'fin'", "';'", "'return'", "'='", 
			"'+='", "'-='", "'/='", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "IDENTIFICADOR", 
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
	public String getGrammarFileName() { return "ANTLR/scripts.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public scriptsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scriptsVisitor ) return ((scriptsVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			part();
			setState(41);
			program2();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scriptsVisitor ) return ((scriptsVisitor<? extends T>)visitor).visitProgram2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Program2Context program2() throws RecognitionException {
		Program2Context _localctx = new Program2Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_program2);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				part();
				setState(44);
				program2();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scriptsVisitor ) return ((scriptsVisitor<? extends T>)visitor).visitPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_part);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(T__0);
				setState(50);
				type();
				setState(51);
				restpart();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(T__1);
				setState(54);
				restpart();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scriptsVisitor ) return ((scriptsVisitor<? extends T>)visitor).visitRestpart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestpartContext restpart() throws RecognitionException {
		RestpartContext _localctx = new RestpartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_restpart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(IDENTIFICADOR);
			setState(58);
			match(T__2);
			setState(59);
			restpart2();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scriptsVisitor ) return ((scriptsVisitor<? extends T>)visitor).visitRestpart2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Restpart2Context restpart2() throws RecognitionException {
		Restpart2Context _localctx = new Restpart2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_restpart2);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				listparam();
				setState(62);
				match(T__3);
				setState(63);
				blq();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(T__3);
				setState(66);
				blq();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scriptsVisitor ) return ((scriptsVisitor<? extends T>)visitor).visitListparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListparamContext listparam() throws RecognitionException {
		ListparamContext _localctx = new ListparamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			type();
			setState(70);
			match(IDENTIFICADOR);
			setState(71);
			listparam2();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scriptsVisitor ) return ((scriptsVisitor<? extends T>)visitor).visitListparam2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Listparam2Context listparam2() throws RecognitionException {
		Listparam2Context _localctx = new Listparam2Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_listparam2);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(T__4);
				setState(74);
				type();
				setState(75);
				match(IDENTIFICADOR);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scriptsVisitor ) return ((scriptsVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scriptsVisitor ) return ((scriptsVisitor<? extends T>)visitor).visitBlq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlqContext blq() throws RecognitionException {
		BlqContext _localctx = new BlqContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__8);
			setState(83);
			sent();
			setState(84);
			match(T__9);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scriptsVisitor ) return ((scriptsVisitor<? extends T>)visitor).visitSentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			sent();
			setState(87);
			sentlist2();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scriptsVisitor ) return ((scriptsVisitor<? extends T>)visitor).visitSentlist2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentlist2Context sentlist2() throws RecognitionException {
		Sentlist2Context _localctx = new Sentlist2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_sentlist2);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
			case T__11:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				sent();
				setState(90);
				sentlist2();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(scriptsParser.IDENTIFICADOR, 0); }
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scriptsVisitor ) return ((scriptsVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sent);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				type();
				setState(96);
				lid();
				setState(97);
				match(T__10);
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(IDENTIFICADOR);
				setState(100);
				asig();
				setState(101);
				exp();
				setState(102);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(T__11);
				setState(105);
				exp();
				setState(106);
				match(T__10);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scriptsVisitor ) return ((scriptsVisitor<? extends T>)visitor).visitLid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LidContext lid() throws RecognitionException {
		LidContext _localctx = new LidContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_lid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(IDENTIFICADOR);
			setState(111);
			lid2();
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
		public Lid2Context lid2() {
			return getRuleContext(Lid2Context.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scriptsVisitor ) return ((scriptsVisitor<? extends T>)visitor).visitLid2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lid2Context lid2() throws RecognitionException {
		Lid2Context _localctx = new Lid2Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_lid2);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(T__4);
				setState(114);
				lid2();
				}
				break;
			case T__3:
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scriptsVisitor ) return ((scriptsVisitor<? extends T>)visitor).visitAsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_asig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scriptsVisitor ) return ((scriptsVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funcion);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(IDENTIFICADOR);
				setState(121);
				funcion2();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(T__2);
				setState(123);
				exp();
				setState(124);
				match(T__3);
				}
				break;
			case CONSTENTERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(CONSTENTERO);
				}
				break;
			case CONSTREAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				match(CONSTREAL);
				}
				break;
			case CONSTLIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				match(CONSTLIT);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scriptsVisitor ) return ((scriptsVisitor<? extends T>)visitor).visitFuncion2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcion2Context funcion2() throws RecognitionException {
		Funcion2Context _localctx = new Funcion2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_funcion2);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(T__2);
				setState(132);
				lid();
				setState(133);
				match(T__3);
				}
				break;
			case T__3:
			case T__10:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scriptsVisitor ) return ((scriptsVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			funcion();
			setState(139);
			exp2();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scriptsVisitor ) return ((scriptsVisitor<? extends T>)visitor).visitExp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp2Context exp2() throws RecognitionException {
		Exp2Context _localctx = new Exp2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_exp2);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				op();
				setState(142);
				funcion();
				setState(143);
				exp2();
				}
				break;
			case T__3:
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scriptsVisitor ) return ((scriptsVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u0099\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\62\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4:\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6F\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bQ\n\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f`\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\ro\n\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\5\17w\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u0084\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u008b\n\22\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\5\24\u0095\n\24\3\25\3\25\3\25\2\2\26\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\5\3\2\b\n\3\2\17\22\3\2\23"+
		"\26\2\u0092\2*\3\2\2\2\4\61\3\2\2\2\69\3\2\2\2\b;\3\2\2\2\nE\3\2\2\2\f"+
		"G\3\2\2\2\16P\3\2\2\2\20R\3\2\2\2\22T\3\2\2\2\24X\3\2\2\2\26_\3\2\2\2"+
		"\30n\3\2\2\2\32p\3\2\2\2\34v\3\2\2\2\36x\3\2\2\2 \u0083\3\2\2\2\"\u008a"+
		"\3\2\2\2$\u008c\3\2\2\2&\u0094\3\2\2\2(\u0096\3\2\2\2*+\5\6\4\2+,\5\4"+
		"\3\2,\3\3\2\2\2-.\5\6\4\2./\5\4\3\2/\62\3\2\2\2\60\62\3\2\2\2\61-\3\2"+
		"\2\2\61\60\3\2\2\2\62\5\3\2\2\2\63\64\7\3\2\2\64\65\5\20\t\2\65\66\5\b"+
		"\5\2\66:\3\2\2\2\678\7\4\2\28:\5\b\5\29\63\3\2\2\29\67\3\2\2\2:\7\3\2"+
		"\2\2;<\7\27\2\2<=\7\5\2\2=>\5\n\6\2>\t\3\2\2\2?@\5\f\7\2@A\7\6\2\2AB\5"+
		"\22\n\2BF\3\2\2\2CD\7\6\2\2DF\5\22\n\2E?\3\2\2\2EC\3\2\2\2F\13\3\2\2\2"+
		"GH\5\20\t\2HI\7\27\2\2IJ\5\16\b\2J\r\3\2\2\2KL\7\7\2\2LM\5\20\t\2MN\7"+
		"\27\2\2NQ\3\2\2\2OQ\3\2\2\2PK\3\2\2\2PO\3\2\2\2Q\17\3\2\2\2RS\t\2\2\2"+
		"S\21\3\2\2\2TU\7\13\2\2UV\5\30\r\2VW\7\f\2\2W\23\3\2\2\2XY\5\30\r\2YZ"+
		"\5\26\f\2Z\25\3\2\2\2[\\\5\30\r\2\\]\5\26\f\2]`\3\2\2\2^`\3\2\2\2_[\3"+
		"\2\2\2_^\3\2\2\2`\27\3\2\2\2ab\5\20\t\2bc\5\32\16\2cd\7\r\2\2do\3\2\2"+
		"\2ef\7\27\2\2fg\5\36\20\2gh\5$\23\2hi\7\r\2\2io\3\2\2\2jk\7\16\2\2kl\5"+
		"$\23\2lm\7\r\2\2mo\3\2\2\2na\3\2\2\2ne\3\2\2\2nj\3\2\2\2o\31\3\2\2\2p"+
		"q\7\27\2\2qr\5\34\17\2r\33\3\2\2\2st\7\7\2\2tw\5\34\17\2uw\3\2\2\2vs\3"+
		"\2\2\2vu\3\2\2\2w\35\3\2\2\2xy\t\3\2\2y\37\3\2\2\2z{\7\27\2\2{\u0084\5"+
		"\"\22\2|}\7\5\2\2}~\5$\23\2~\177\7\6\2\2\177\u0084\3\2\2\2\u0080\u0084"+
		"\7\30\2\2\u0081\u0084\7\31\2\2\u0082\u0084\7\32\2\2\u0083z\3\2\2\2\u0083"+
		"|\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2"+
		"\u0084!\3\2\2\2\u0085\u0086\7\5\2\2\u0086\u0087\5\32\16\2\u0087\u0088"+
		"\7\6\2\2\u0088\u008b\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0085\3\2\2\2\u008a"+
		"\u0089\3\2\2\2\u008b#\3\2\2\2\u008c\u008d\5 \21\2\u008d\u008e\5&\24\2"+
		"\u008e%\3\2\2\2\u008f\u0090\5(\25\2\u0090\u0091\5 \21\2\u0091\u0092\5"+
		"&\24\2\u0092\u0095\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u008f\3\2\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\'\3\2\2\2\u0096\u0097\t\4\2\2\u0097)\3\2\2\2\f\61"+
		"9EP_nv\u0083\u008a\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}