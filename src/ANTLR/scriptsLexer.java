// Generated from scripts.g4 by ANTLR 4.9.1

package ANTLR;

import Java.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class scriptsLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "IDENTIFICADOR", 
			"CONSTENTERO", "CONSTREAL", "CONSTLIT", "COMENTARIOLINEA", "COMENTARIOMULTI", 
			"WS", "HEXENTERO", "DECENTERO", "DECREAL", "HEXREAL", "COMILLASIMPLE", 
			"COMILLADOBLE"
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
		public void notifyListeners(LexerNoViableAltException e) {
			String text = _input.getText(Interval.of(_tokenStartCharIndex, _input.index()));
			String msg = "Error al reconocer este token : '"+ getErrorDisplay(text) + "'";

			ANTLRErrorListener listener = getErrorListenerDispatch();
			listener.syntaxError(this, null, _tokenStartLine, _tokenStartCharPositionInLine, msg, e);
		}


	public scriptsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "scripts.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u019d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&"+
		"\3&\3\'\3\'\3(\3(\3)\5)\u012a\n)\3)\7)\u012d\n)\f)\16)\u0130\13)\3*\3"+
		"*\5*\u0134\n*\3+\3+\5+\u0138\n+\3,\3,\5,\u013c\n,\3-\3-\3-\3-\7-\u0142"+
		"\n-\f-\16-\u0145\13-\3.\3.\3.\3.\7.\u014b\n.\f.\16.\u014e\13.\3.\3.\3"+
		".\3/\6/\u0154\n/\r/\16/\u0155\3/\3/\3\60\3\60\5\60\u015c\n\60\3\60\6\60"+
		"\u015f\n\60\r\60\16\60\u0160\3\61\5\61\u0164\n\61\3\61\6\61\u0167\n\61"+
		"\r\61\16\61\u0168\3\62\5\62\u016c\n\62\3\62\6\62\u016f\n\62\r\62\16\62"+
		"\u0170\3\62\3\62\6\62\u0175\n\62\r\62\16\62\u0176\3\63\3\63\5\63\u017b"+
		"\n\63\3\63\6\63\u017e\n\63\r\63\16\63\u017f\3\63\3\63\6\63\u0184\n\63"+
		"\r\63\16\63\u0185\3\64\3\64\3\64\3\64\7\64\u018c\n\64\f\64\16\64\u018f"+
		"\13\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0197\n\65\f\65\16\65\u019a"+
		"\13\65\3\65\3\65\3\u014c\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\2"+
		"a\2c\2e\2g\2i\2\3\2\13\4\2aac|\6\2\62;C\\aac|\3\2\f\f\5\2\13\f\17\17\""+
		"\"\4\2--//\4\2\62;CH\3\2\62;\3\2))\3\2$$\2\u01ab\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3k\3\2\2\2\5s\3\2\2\2\7\u0081\3\2\2\2"+
		"\t\u0083\3\2\2\2\13\u0085\3\2\2\2\r\u0087\3\2\2\2\17\u008e\3\2\2\2\21"+
		"\u0093\3\2\2\2\23\u009c\3\2\2\2\25\u00a3\3\2\2\2\27\u00a7\3\2\2\2\31\u00a9"+
		"\3\2\2\2\33\u00b0\3\2\2\2\35\u00bc\3\2\2\2\37\u00c5\3\2\2\2!\u00ca\3\2"+
		"\2\2#\u00d4\3\2\2\2%\u00e2\3\2\2\2\'\u00e8\3\2\2\2)\u00ee\3\2\2\2+\u00f1"+
		"\3\2\2\2-\u00f8\3\2\2\2/\u00fe\3\2\2\2\61\u0100\3\2\2\2\63\u0102\3\2\2"+
		"\2\65\u0105\3\2\2\2\67\u0108\3\2\2\29\u010a\3\2\2\2;\u010c\3\2\2\2=\u010f"+
		"\3\2\2\2?\u0112\3\2\2\2A\u0114\3\2\2\2C\u0117\3\2\2\2E\u011a\3\2\2\2G"+
		"\u011d\3\2\2\2I\u0120\3\2\2\2K\u0122\3\2\2\2M\u0124\3\2\2\2O\u0126\3\2"+
		"\2\2Q\u0129\3\2\2\2S\u0133\3\2\2\2U\u0137\3\2\2\2W\u013b\3\2\2\2Y\u013d"+
		"\3\2\2\2[\u0146\3\2\2\2]\u0153\3\2\2\2_\u0159\3\2\2\2a\u0163\3\2\2\2c"+
		"\u016b\3\2\2\2e\u0178\3\2\2\2g\u0187\3\2\2\2i\u0192\3\2\2\2kl\7h\2\2l"+
		"m\7w\2\2mn\7p\2\2no\7e\2\2op\7k\2\2pq\7q\2\2qr\7p\2\2r\4\3\2\2\2st\7r"+
		"\2\2tu\7t\2\2uv\7q\2\2vw\7e\2\2wx\7g\2\2xy\7f\2\2yz\7k\2\2z{\7o\2\2{|"+
		"\7k\2\2|}\7g\2\2}~\7p\2\2~\177\7v\2\2\177\u0080\7q\2\2\u0080\6\3\2\2\2"+
		"\u0081\u0082\7*\2\2\u0082\b\3\2\2\2\u0083\u0084\7+\2\2\u0084\n\3\2\2\2"+
		"\u0085\u0086\7.\2\2\u0086\f\3\2\2\2\u0087\u0088\7g\2\2\u0088\u0089\7p"+
		"\2\2\u0089\u008a\7v\2\2\u008a\u008b\7g\2\2\u008b\u008c\7t\2\2\u008c\u008d"+
		"\7q\2\2\u008d\16\3\2\2\2\u008e\u008f\7t\2\2\u008f\u0090\7g\2\2\u0090\u0091"+
		"\7c\2\2\u0091\u0092\7n\2\2\u0092\20\3\2\2\2\u0093\u0094\7e\2\2\u0094\u0095"+
		"\7c\2\2\u0095\u0096\7t\2\2\u0096\u0097\7c\2\2\u0097\u0098\7e\2\2\u0098"+
		"\u0099\7v\2\2\u0099\u009a\7g\2\2\u009a\u009b\7t\2\2\u009b\22\3\2\2\2\u009c"+
		"\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7e\2\2"+
		"\u00a0\u00a1\7k\2\2\u00a1\u00a2\7q\2\2\u00a2\24\3\2\2\2\u00a3\u00a4\7"+
		"h\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7p\2\2\u00a6\26\3\2\2\2\u00a7\u00a8"+
		"\7=\2\2\u00a8\30\3\2\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac"+
		"\7v\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7p\2\2\u00af"+
		"\32\3\2\2\2\u00b0\u00b1\7d\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7h\2\2\u00b3"+
		"\u00b4\7w\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7c\2\2"+
		"\u00b7\u00b8\7e\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb"+
		"\7p\2\2\u00bb\34\3\2\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7p\2\2\u00be\u00bf"+
		"\7v\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7e\2\2\u00c2"+
		"\u00c3\7g\2\2\u00c3\u00c4\7u\2\2\u00c4\36\3\2\2\2\u00c5\u00c6\7u\2\2\u00c6"+
		"\u00c7\7k\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7q\2\2\u00c9 \3\2\2\2\u00ca"+
		"\u00cb\7d\2\2\u00cb\u00cc\7w\2\2\u00cc\u00cd\7e\2\2\u00cd\u00ce\7n\2\2"+
		"\u00ce\u00cf\7g\2\2\u00cf\u00d0\7r\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2"+
		"\7t\2\2\u00d2\u00d3\7c\2\2\u00d3\"\3\2\2\2\u00d4\u00d5\7d\2\2\u00d5\u00d6"+
		"\7w\2\2\u00d6\u00d7\7e\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9\7g\2\2\u00d9"+
		"\u00da\7o\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7p\2\2"+
		"\u00dd\u00de\7v\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1"+
		"\7u\2\2\u00e1$\3\2\2\2\u00e2\u00e3\7d\2\2\u00e3\u00e4\7w\2\2\u00e4\u00e5"+
		"\7e\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7g\2\2\u00e7&\3\2\2\2\u00e8\u00e9"+
		"\7j\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec\7v\2\2\u00ec"+
		"\u00ed\7c\2\2\u00ed(\3\2\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7q\2\2\u00f0"+
		"*\3\2\2\2\u00f1\u00f2\7e\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7g\2\2\u00f4"+
		"\u00f5\7t\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7q\2\2\u00f7,\3\2\2\2\u00f8"+
		"\u00f9\7h\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7u\2\2"+
		"\u00fc\u00fd\7q\2\2\u00fd.\3\2\2\2\u00fe\u00ff\7{\2\2\u00ff\60\3\2\2\2"+
		"\u0100\u0101\7q\2\2\u0101\62\3\2\2\2\u0102\u0103\7?\2\2\u0103\u0104\7"+
		"?\2\2\u0104\64\3\2\2\2\u0105\u0106\7>\2\2\u0106\u0107\7@\2\2\u0107\66"+
		"\3\2\2\2\u0108\u0109\7>\2\2\u01098\3\2\2\2\u010a\u010b\7@\2\2\u010b:\3"+
		"\2\2\2\u010c\u010d\7@\2\2\u010d\u010e\7?\2\2\u010e<\3\2\2\2\u010f\u0110"+
		"\7>\2\2\u0110\u0111\7?\2\2\u0111>\3\2\2\2\u0112\u0113\7?\2\2\u0113@\3"+
		"\2\2\2\u0114\u0115\7-\2\2\u0115\u0116\7?\2\2\u0116B\3\2\2\2\u0117\u0118"+
		"\7/\2\2\u0118\u0119\7?\2\2\u0119D\3\2\2\2\u011a\u011b\7,\2\2\u011b\u011c"+
		"\7?\2\2\u011cF\3\2\2\2\u011d\u011e\7\61\2\2\u011e\u011f\7?\2\2\u011fH"+
		"\3\2\2\2\u0120\u0121\7-\2\2\u0121J\3\2\2\2\u0122\u0123\7/\2\2\u0123L\3"+
		"\2\2\2\u0124\u0125\7,\2\2\u0125N\3\2\2\2\u0126\u0127\7\61\2\2\u0127P\3"+
		"\2\2\2\u0128\u012a\t\2\2\2\u0129\u0128\3\2\2\2\u012a\u012e\3\2\2\2\u012b"+
		"\u012d\t\3\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012fR\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0134"+
		"\5_\60\2\u0132\u0134\5a\61\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134"+
		"T\3\2\2\2\u0135\u0138\5e\63\2\u0136\u0138\5c\62\2\u0137\u0135\3\2\2\2"+
		"\u0137\u0136\3\2\2\2\u0138V\3\2\2\2\u0139\u013c\5g\64\2\u013a\u013c\5"+
		"i\65\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013cX\3\2\2\2\u013d\u013e"+
		"\7\'\2\2\u013e\u013f\7\'\2\2\u013f\u0143\3\2\2\2\u0140\u0142\n\4\2\2\u0141"+
		"\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144Z\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\7\'\2\2\u0147\u0148"+
		"\7/\2\2\u0148\u014c\3\2\2\2\u0149\u014b\13\2\2\2\u014a\u0149\3\2\2\2\u014b"+
		"\u014e\3\2\2\2\u014c\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014f\3\2"+
		"\2\2\u014e\u014c\3\2\2\2\u014f\u0150\7/\2\2\u0150\u0151\7\'\2\2\u0151"+
		"\\\3\2\2\2\u0152\u0154\t\5\2\2\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2"+
		"\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158"+
		"\b/\2\2\u0158^\3\2\2\2\u0159\u015b\7&\2\2\u015a\u015c\t\6\2\2\u015b\u015a"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015f\t\7\2\2\u015e"+
		"\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161`\3\2\2\2\u0162\u0164\t\6\2\2\u0163\u0162\3\2\2\2\u0163\u0164"+
		"\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0167\t\b\2\2\u0166\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169b\3\2\2\2"+
		"\u016a\u016c\t\6\2\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e"+
		"\3\2\2\2\u016d\u016f\t\b\2\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\7\60"+
		"\2\2\u0173\u0175\t\b\2\2\u0174\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177d\3\2\2\2\u0178\u017a\7&\2\2\u0179"+
		"\u017b\t\6\2\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2"+
		"\2\2\u017c\u017e\t\7\2\2\u017d\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\7\60"+
		"\2\2\u0182\u0184\t\7\2\2\u0183\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186f\3\2\2\2\u0187\u018d\7)\2\2\u0188"+
		"\u018c\n\t\2\2\u0189\u018a\7)\2\2\u018a\u018c\7)\2\2\u018b\u0188\3\2\2"+
		"\2\u018b\u0189\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e"+
		"\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\7)\2\2\u0191"+
		"h\3\2\2\2\u0192\u0198\7$\2\2\u0193\u0197\n\n\2\2\u0194\u0195\7$\2\2\u0195"+
		"\u0197\7$\2\2\u0196\u0193\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u019a\3\2"+
		"\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019b\u019c\7$\2\2\u019cj\3\2\2\2\35\2\u0129\u012c\u012e"+
		"\u0133\u0137\u013b\u0143\u014c\u0155\u015b\u015e\u0160\u0163\u0168\u016b"+
		"\u0170\u0176\u017a\u017d\u017f\u0183\u0185\u018b\u018d\u0196\u0198\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}