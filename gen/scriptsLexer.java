// Generated from C:/Users/ferna/Desktop/Universidad/3/2cuatri/PL/PracticaObligatoria/src\scripts.g4 by ANTLR 4.9.1
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
		T__17=18, T__18=19, T__19=20, IDENTIFICADOR=21, CONSTENTERO=22, CONSTREAL=23, 
		CONSTLIT=24, COMENTARIOLINEA=25, COMENTARIOMULTI=26, WS=27;
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
			"T__17", "T__18", "T__19", "IDENTIFICADOR", "CONSTENTERO", "CONSTREAL", 
			"CONSTLIT", "COMENTARIOLINEA", "COMENTARIOMULTI", "WS", "HEXENTERO", 
			"DECENTERO", "DECREAL", "HEXREAL", "COMILLASIMPLE", "COMILLADOBLE"
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


	public scriptsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ANTLR/scripts.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u0112\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\5\26\u009f\n\26\3\26\7\26"+
		"\u00a2\n\26\f\26\16\26\u00a5\13\26\3\27\3\27\5\27\u00a9\n\27\3\30\3\30"+
		"\5\30\u00ad\n\30\3\31\3\31\5\31\u00b1\n\31\3\32\3\32\3\32\3\32\7\32\u00b7"+
		"\n\32\f\32\16\32\u00ba\13\32\3\33\3\33\3\33\3\33\7\33\u00c0\n\33\f\33"+
		"\16\33\u00c3\13\33\3\33\3\33\3\33\3\34\6\34\u00c9\n\34\r\34\16\34\u00ca"+
		"\3\34\3\34\3\35\3\35\5\35\u00d1\n\35\3\35\6\35\u00d4\n\35\r\35\16\35\u00d5"+
		"\3\36\5\36\u00d9\n\36\3\36\6\36\u00dc\n\36\r\36\16\36\u00dd\3\37\5\37"+
		"\u00e1\n\37\3\37\6\37\u00e4\n\37\r\37\16\37\u00e5\3\37\3\37\6\37\u00ea"+
		"\n\37\r\37\16\37\u00eb\3 \3 \5 \u00f0\n \3 \6 \u00f3\n \r \16 \u00f4\3"+
		" \3 \6 \u00f9\n \r \16 \u00fa\3!\3!\3!\3!\7!\u0101\n!\f!\16!\u0104\13"+
		"!\3!\3!\3\"\3\"\3\"\3\"\7\"\u010c\n\"\f\"\16\"\u010f\13\"\3\"\3\"\3\u00c1"+
		"\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\2"+
		";\2=\2?\2A\2C\2\3\2\13\4\2aac|\6\2\62;C\\aac|\3\2\f\f\5\2\13\f\17\17\""+
		"\"\4\2--//\4\2\62;CH\3\2\62;\3\2))\3\2$$\2\u0120\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\3E\3\2\2\2\5M\3\2\2\2\7[\3\2\2\2\t]\3"+
		"\2\2\2\13_\3\2\2\2\ra\3\2\2\2\17h\3\2\2\2\21m\3\2\2\2\23v\3\2\2\2\25}"+
		"\3\2\2\2\27\u0081\3\2\2\2\31\u0083\3\2\2\2\33\u008a\3\2\2\2\35\u008c\3"+
		"\2\2\2\37\u008f\3\2\2\2!\u0092\3\2\2\2#\u0095\3\2\2\2%\u0097\3\2\2\2\'"+
		"\u0099\3\2\2\2)\u009b\3\2\2\2+\u009e\3\2\2\2-\u00a8\3\2\2\2/\u00ac\3\2"+
		"\2\2\61\u00b0\3\2\2\2\63\u00b2\3\2\2\2\65\u00bb\3\2\2\2\67\u00c8\3\2\2"+
		"\29\u00ce\3\2\2\2;\u00d8\3\2\2\2=\u00e0\3\2\2\2?\u00ed\3\2\2\2A\u00fc"+
		"\3\2\2\2C\u0107\3\2\2\2EF\7h\2\2FG\7w\2\2GH\7p\2\2HI\7e\2\2IJ\7k\2\2J"+
		"K\7q\2\2KL\7p\2\2L\4\3\2\2\2MN\7r\2\2NO\7t\2\2OP\7q\2\2PQ\7e\2\2QR\7g"+
		"\2\2RS\7f\2\2ST\7k\2\2TU\7o\2\2UV\7k\2\2VW\7g\2\2WX\7p\2\2XY\7v\2\2YZ"+
		"\7q\2\2Z\6\3\2\2\2[\\\7*\2\2\\\b\3\2\2\2]^\7+\2\2^\n\3\2\2\2_`\7.\2\2"+
		"`\f\3\2\2\2ab\7g\2\2bc\7p\2\2cd\7v\2\2de\7g\2\2ef\7t\2\2fg\7q\2\2g\16"+
		"\3\2\2\2hi\7t\2\2ij\7g\2\2jk\7c\2\2kl\7n\2\2l\20\3\2\2\2mn\7e\2\2no\7"+
		"c\2\2op\7t\2\2pq\7c\2\2qr\7e\2\2rs\7v\2\2st\7g\2\2tu\7t\2\2u\22\3\2\2"+
		"\2vw\7k\2\2wx\7p\2\2xy\7k\2\2yz\7e\2\2z{\7k\2\2{|\7q\2\2|\24\3\2\2\2}"+
		"~\7h\2\2~\177\7k\2\2\177\u0080\7p\2\2\u0080\26\3\2\2\2\u0081\u0082\7="+
		"\2\2\u0082\30\3\2\2\2\u0083\u0084\7t\2\2\u0084\u0085\7g\2\2\u0085\u0086"+
		"\7v\2\2\u0086\u0087\7w\2\2\u0087\u0088\7t\2\2\u0088\u0089\7p\2\2\u0089"+
		"\32\3\2\2\2\u008a\u008b\7?\2\2\u008b\34\3\2\2\2\u008c\u008d\7-\2\2\u008d"+
		"\u008e\7?\2\2\u008e\36\3\2\2\2\u008f\u0090\7/\2\2\u0090\u0091\7?\2\2\u0091"+
		" \3\2\2\2\u0092\u0093\7\61\2\2\u0093\u0094\7?\2\2\u0094\"\3\2\2\2\u0095"+
		"\u0096\7-\2\2\u0096$\3\2\2\2\u0097\u0098\7/\2\2\u0098&\3\2\2\2\u0099\u009a"+
		"\7,\2\2\u009a(\3\2\2\2\u009b\u009c\7\61\2\2\u009c*\3\2\2\2\u009d\u009f"+
		"\t\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a3\3\2\2\2\u00a0\u00a2\t\3\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4,\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\59\35\2\u00a7\u00a9"+
		"\5;\36\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9.\3\2\2\2\u00aa"+
		"\u00ad\5? \2\u00ab\u00ad\5=\37\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2"+
		"\2\u00ad\60\3\2\2\2\u00ae\u00b1\5A!\2\u00af\u00b1\5C\"\2\u00b0\u00ae\3"+
		"\2\2\2\u00b0\u00af\3\2\2\2\u00b1\62\3\2\2\2\u00b2\u00b3\7\'\2\2\u00b3"+
		"\u00b4\7\'\2\2\u00b4\u00b8\3\2\2\2\u00b5\u00b7\n\4\2\2\u00b6\u00b5\3\2"+
		"\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\64\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7\'\2\2\u00bc\u00bd\7/\2\2"+
		"\u00bd\u00c1\3\2\2\2\u00be\u00c0\13\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00c5\7/\2\2\u00c5\u00c6\7\'\2\2\u00c6\66\3\2\2\2"+
		"\u00c7\u00c9\t\5\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\b\34\2\2"+
		"\u00cd8\3\2\2\2\u00ce\u00d0\7&\2\2\u00cf\u00d1\t\6\2\2\u00d0\u00cf\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d4\t\7\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6:\3\2\2\2\u00d7\u00d9\t\6\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00dc\t\b\2\2\u00db\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de<\3\2\2\2"+
		"\u00df\u00e1\t\6\2\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3"+
		"\3\2\2\2\u00e2\u00e4\t\b\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\7\60"+
		"\2\2\u00e8\u00ea\t\b\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec>\3\2\2\2\u00ed\u00ef\7&\2\2\u00ee"+
		"\u00f0\t\6\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2"+
		"\2\2\u00f1\u00f3\t\7\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\7\60"+
		"\2\2\u00f7\u00f9\t\7\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb@\3\2\2\2\u00fc\u0102\7)\2\2\u00fd"+
		"\u0101\n\t\2\2\u00fe\u00ff\7)\2\2\u00ff\u0101\7)\2\2\u0100\u00fd\3\2\2"+
		"\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7)\2\2\u0106"+
		"B\3\2\2\2\u0107\u010d\7$\2\2\u0108\u010c\n\n\2\2\u0109\u010a\7$\2\2\u010a"+
		"\u010c\7$\2\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2"+
		"\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0111\7$\2\2\u0111D\3\2\2\2\35\2\u009e\u00a1\u00a3"+
		"\u00a8\u00ac\u00b0\u00b8\u00c1\u00ca\u00d0\u00d3\u00d5\u00d8\u00dd\u00e0"+
		"\u00e5\u00eb\u00ef\u00f2\u00f4\u00f8\u00fa\u0100\u0102\u010b\u010d\3\b"+
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