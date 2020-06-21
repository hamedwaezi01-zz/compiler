// Generated from G:/Programming/compiler/proj/phase2/grammar\MiniJava.g4 by ANTLR 4.8
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, AND=23, LT=24, PLUS=25, 
		MINUS=26, TIMES=27, POWER=28, NOT=29, LSB=30, RSB=31, DOTLENGTH=32, LP=33, 
		RP=34, RETURN=35, EQ=36, Final=37, BooleanLiteral=38, IntegerLiteral=39, 
		NullLiteral=40, Identifier=41, String=42, Override=43, WS=44, MULTILINE_COMMENT=45, 
		LINE_COMMENT=46;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "AND", "LT", "PLUS", "MINUS", 
			"TIMES", "POWER", "NOT", "LSB", "RSB", "DOTLENGTH", "LP", "RP", "RETURN", 
			"EQ", "Final", "BooleanLiteral", "IntegerLiteral", "NullLiteral", "Identifier", 
			"String", "Override", "JavaLetter", "JavaLetterOrDigit", "DecimalIntegerLiteral", 
			"IntegertypeSuffix", "DecimalNumeral", "Digits", "Digit", "NonZeroDigit", 
			"DigitsAndUnderscores", "DigitOrUnderscore", "Underscores", "WS", "MULTILINE_COMMENT", 
			"LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "'public'", "'static'", "'void'", "'main'", 
			"'extends'", "'implements'", "','", "'interface'", "';'", "'boolean'", 
			"'int'", "'private'", "'if'", "'else'", "'while'", "'System.out.println'", 
			"'.'", "'new'", "'this'", "'&&'", "'<'", "'+'", "'-'", "'*'", "'**'", 
			"'!'", "'['", "']'", "'.length'", "'('", "')'", "'return'", "'='", "'final'", 
			null, null, "'null'", null, null, "'@Override'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "AND", 
			"LT", "PLUS", "MINUS", "TIMES", "POWER", "NOT", "LSB", "RSB", "DOTLENGTH", 
			"LP", "RP", "RETURN", "EQ", "Final", "BooleanLiteral", "IntegerLiteral", 
			"NullLiteral", "Identifier", "String", "Override", "WS", "MULTILINE_COMMENT", 
			"LINE_COMMENT"
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


	public MiniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u01a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\5\'\u0131\n\'\3(\3(\3)\3)\3)\3)\3)\3*\3*\7*\u013c"+
		"\n*\f*\16*\u013f\13*\3+\3+\7+\u0143\n+\f+\16+\u0146\13+\3+\3+\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3-\3-\3.\3.\3/\3/\5/\u015a\n/\3\60\3\60\3\61\3"+
		"\61\3\61\5\61\u0161\n\61\3\61\3\61\3\61\5\61\u0166\n\61\5\61\u0168\n\61"+
		"\3\62\3\62\5\62\u016c\n\62\3\62\5\62\u016f\n\62\3\63\3\63\5\63\u0173\n"+
		"\63\3\64\3\64\3\65\6\65\u0178\n\65\r\65\16\65\u0179\3\66\3\66\5\66\u017e"+
		"\n\66\3\67\6\67\u0181\n\67\r\67\16\67\u0182\38\68\u0186\n8\r8\168\u0187"+
		"\38\38\39\39\39\39\79\u0190\n9\f9\169\u0193\139\39\39\39\39\39\3:\3:\3"+
		":\3:\7:\u019e\n:\f:\16:\u01a1\13:\3:\3:\3:\3:\4\u0191\u019f\2;\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o.q/s\60\3\2\b"+
		"\3\2$$\6\2&&C\\aac|\7\2&&\62;C\\aac|\4\2NNnn\3\2\63;\5\2\13\f\17\17\""+
		"\"\2\u01aa\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2"+
		"\2\2\5{\3\2\2\2\7}\3\2\2\2\t\177\3\2\2\2\13\u0086\3\2\2\2\r\u008d\3\2"+
		"\2\2\17\u0092\3\2\2\2\21\u0097\3\2\2\2\23\u009f\3\2\2\2\25\u00aa\3\2\2"+
		"\2\27\u00ac\3\2\2\2\31\u00b6\3\2\2\2\33\u00b8\3\2\2\2\35\u00c0\3\2\2\2"+
		"\37\u00c4\3\2\2\2!\u00cc\3\2\2\2#\u00cf\3\2\2\2%\u00d4\3\2\2\2\'\u00da"+
		"\3\2\2\2)\u00ed\3\2\2\2+\u00ef\3\2\2\2-\u00f3\3\2\2\2/\u00f8\3\2\2\2\61"+
		"\u00fb\3\2\2\2\63\u00fd\3\2\2\2\65\u00ff\3\2\2\2\67\u0101\3\2\2\29\u0103"+
		"\3\2\2\2;\u0106\3\2\2\2=\u0108\3\2\2\2?\u010a\3\2\2\2A\u010c\3\2\2\2C"+
		"\u0114\3\2\2\2E\u0116\3\2\2\2G\u0118\3\2\2\2I\u011f\3\2\2\2K\u0121\3\2"+
		"\2\2M\u0130\3\2\2\2O\u0132\3\2\2\2Q\u0134\3\2\2\2S\u0139\3\2\2\2U\u0140"+
		"\3\2\2\2W\u0149\3\2\2\2Y\u0153\3\2\2\2[\u0155\3\2\2\2]\u0157\3\2\2\2_"+
		"\u015b\3\2\2\2a\u0167\3\2\2\2c\u0169\3\2\2\2e\u0172\3\2\2\2g\u0174\3\2"+
		"\2\2i\u0177\3\2\2\2k\u017d\3\2\2\2m\u0180\3\2\2\2o\u0185\3\2\2\2q\u018b"+
		"\3\2\2\2s\u0199\3\2\2\2uv\7e\2\2vw\7n\2\2wx\7c\2\2xy\7u\2\2yz\7u\2\2z"+
		"\4\3\2\2\2{|\7}\2\2|\6\3\2\2\2}~\7\177\2\2~\b\3\2\2\2\177\u0080\7r\2\2"+
		"\u0080\u0081\7w\2\2\u0081\u0082\7d\2\2\u0082\u0083\7n\2\2\u0083\u0084"+
		"\7k\2\2\u0084\u0085\7e\2\2\u0085\n\3\2\2\2\u0086\u0087\7u\2\2\u0087\u0088"+
		"\7v\2\2\u0088\u0089\7c\2\2\u0089\u008a\7v\2\2\u008a\u008b\7k\2\2\u008b"+
		"\u008c\7e\2\2\u008c\f\3\2\2\2\u008d\u008e\7x\2\2\u008e\u008f\7q\2\2\u008f"+
		"\u0090\7k\2\2\u0090\u0091\7f\2\2\u0091\16\3\2\2\2\u0092\u0093\7o\2\2\u0093"+
		"\u0094\7c\2\2\u0094\u0095\7k\2\2\u0095\u0096\7p\2\2\u0096\20\3\2\2\2\u0097"+
		"\u0098\7g\2\2\u0098\u0099\7z\2\2\u0099\u009a\7v\2\2\u009a\u009b\7g\2\2"+
		"\u009b\u009c\7p\2\2\u009c\u009d\7f\2\2\u009d\u009e\7u\2\2\u009e\22\3\2"+
		"\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7o\2\2\u00a1\u00a2\7r\2\2\u00a2\u00a3"+
		"\7n\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7o\2\2\u00a5\u00a6\7g\2\2\u00a6"+
		"\u00a7\7p\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7u\2\2\u00a9\24\3\2\2\2\u00aa"+
		"\u00ab\7.\2\2\u00ab\26\3\2\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\u00af\7v\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7h\2\2"+
		"\u00b2\u00b3\7c\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7g\2\2\u00b5\30\3\2"+
		"\2\2\u00b6\u00b7\7=\2\2\u00b7\32\3\2\2\2\u00b8\u00b9\7d\2\2\u00b9\u00ba"+
		"\7q\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7g\2\2\u00bd"+
		"\u00be\7c\2\2\u00be\u00bf\7p\2\2\u00bf\34\3\2\2\2\u00c0\u00c1\7k\2\2\u00c1"+
		"\u00c2\7p\2\2\u00c2\u00c3\7v\2\2\u00c3\36\3\2\2\2\u00c4\u00c5\7r\2\2\u00c5"+
		"\u00c6\7t\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7x\2\2\u00c8\u00c9\7c\2\2"+
		"\u00c9\u00ca\7v\2\2\u00ca\u00cb\7g\2\2\u00cb \3\2\2\2\u00cc\u00cd\7k\2"+
		"\2\u00cd\u00ce\7h\2\2\u00ce\"\3\2\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7"+
		"n\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7g\2\2\u00d3$\3\2\2\2\u00d4\u00d5"+
		"\7y\2\2\u00d5\u00d6\7j\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7n\2\2\u00d8"+
		"\u00d9\7g\2\2\u00d9&\3\2\2\2\u00da\u00db\7U\2\2\u00db\u00dc\7{\2\2\u00dc"+
		"\u00dd\7u\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7o\2\2"+
		"\u00e0\u00e1\7\60\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7w\2\2\u00e3\u00e4"+
		"\7v\2\2\u00e4\u00e5\7\60\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7t\2\2\u00e7"+
		"\u00e8\7k\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7n\2\2"+
		"\u00eb\u00ec\7p\2\2\u00ec(\3\2\2\2\u00ed\u00ee\7\60\2\2\u00ee*\3\2\2\2"+
		"\u00ef\u00f0\7p\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7y\2\2\u00f2,\3\2\2"+
		"\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7j\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7"+
		"\7u\2\2\u00f7.\3\2\2\2\u00f8\u00f9\7(\2\2\u00f9\u00fa\7(\2\2\u00fa\60"+
		"\3\2\2\2\u00fb\u00fc\7>\2\2\u00fc\62\3\2\2\2\u00fd\u00fe\7-\2\2\u00fe"+
		"\64\3\2\2\2\u00ff\u0100\7/\2\2\u0100\66\3\2\2\2\u0101\u0102\7,\2\2\u0102"+
		"8\3\2\2\2\u0103\u0104\7,\2\2\u0104\u0105\7,\2\2\u0105:\3\2\2\2\u0106\u0107"+
		"\7#\2\2\u0107<\3\2\2\2\u0108\u0109\7]\2\2\u0109>\3\2\2\2\u010a\u010b\7"+
		"_\2\2\u010b@\3\2\2\2\u010c\u010d\7\60\2\2\u010d\u010e\7n\2\2\u010e\u010f"+
		"\7g\2\2\u010f\u0110\7p\2\2\u0110\u0111\7i\2\2\u0111\u0112\7v\2\2\u0112"+
		"\u0113\7j\2\2\u0113B\3\2\2\2\u0114\u0115\7*\2\2\u0115D\3\2\2\2\u0116\u0117"+
		"\7+\2\2\u0117F\3\2\2\2\u0118\u0119\7t\2\2\u0119\u011a\7g\2\2\u011a\u011b"+
		"\7v\2\2\u011b\u011c\7w\2\2\u011c\u011d\7t\2\2\u011d\u011e\7p\2\2\u011e"+
		"H\3\2\2\2\u011f\u0120\7?\2\2\u0120J\3\2\2\2\u0121\u0122\7h\2\2\u0122\u0123"+
		"\7k\2\2\u0123\u0124\7p\2\2\u0124\u0125\7c\2\2\u0125\u0126\7n\2\2\u0126"+
		"L\3\2\2\2\u0127\u0128\7v\2\2\u0128\u0129\7t\2\2\u0129\u012a\7w\2\2\u012a"+
		"\u0131\7g\2\2\u012b\u012c\7h\2\2\u012c\u012d\7c\2\2\u012d\u012e\7n\2\2"+
		"\u012e\u012f\7u\2\2\u012f\u0131\7g\2\2\u0130\u0127\3\2\2\2\u0130\u012b"+
		"\3\2\2\2\u0131N\3\2\2\2\u0132\u0133\5]/\2\u0133P\3\2\2\2\u0134\u0135\7"+
		"p\2\2\u0135\u0136\7w\2\2\u0136\u0137\7n\2\2\u0137\u0138\7n\2\2\u0138R"+
		"\3\2\2\2\u0139\u013d\5Y-\2\u013a\u013c\5[.\2\u013b\u013a\3\2\2\2\u013c"+
		"\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013eT\3\2\2\2"+
		"\u013f\u013d\3\2\2\2\u0140\u0144\7$\2\2\u0141\u0143\n\2\2\2\u0142\u0141"+
		"\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7$\2\2\u0148V\3\2\2\2\u0149"+
		"\u014a\7B\2\2\u014a\u014b\7Q\2\2\u014b\u014c\7x\2\2\u014c\u014d\7g\2\2"+
		"\u014d\u014e\7t\2\2\u014e\u014f\7t\2\2\u014f\u0150\7k\2\2\u0150\u0151"+
		"\7f\2\2\u0151\u0152\7g\2\2\u0152X\3\2\2\2\u0153\u0154\t\3\2\2\u0154Z\3"+
		"\2\2\2\u0155\u0156\t\4\2\2\u0156\\\3\2\2\2\u0157\u0159\5a\61\2\u0158\u015a"+
		"\5_\60\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a^\3\2\2\2\u015b"+
		"\u015c\t\5\2\2\u015c`\3\2\2\2\u015d\u0168\7\62\2\2\u015e\u0165\5g\64\2"+
		"\u015f\u0161\5c\62\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0166"+
		"\3\2\2\2\u0162\u0163\5m\67\2\u0163\u0164\5c\62\2\u0164\u0166\3\2\2\2\u0165"+
		"\u0160\3\2\2\2\u0165\u0162\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u015d\3\2"+
		"\2\2\u0167\u015e\3\2\2\2\u0168b\3\2\2\2\u0169\u016e\5e\63\2\u016a\u016c"+
		"\5i\65\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016f\5e\63\2\u016e\u016b\3\2\2\2\u016e\u016f\3\2\2\2\u016fd\3\2\2\2"+
		"\u0170\u0173\7\62\2\2\u0171\u0173\5g\64\2\u0172\u0170\3\2\2\2\u0172\u0171"+
		"\3\2\2\2\u0173f\3\2\2\2\u0174\u0175\t\6\2\2\u0175h\3\2\2\2\u0176\u0178"+
		"\5k\66\2\u0177\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017aj\3\2\2\2\u017b\u017e\5e\63\2\u017c\u017e\7a\2\2\u017d"+
		"\u017b\3\2\2\2\u017d\u017c\3\2\2\2\u017el\3\2\2\2\u017f\u0181\7a\2\2\u0180"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183n\3\2\2\2\u0184\u0186\t\7\2\2\u0185\u0184\3\2\2\2\u0186\u0187"+
		"\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u018a\b8\2\2\u018ap\3\2\2\2\u018b\u018c\7\61\2\2\u018c\u018d\7,\2\2\u018d"+
		"\u0191\3\2\2\2\u018e\u0190\13\2\2\2\u018f\u018e\3\2\2\2\u0190\u0193\3"+
		"\2\2\2\u0191\u0192\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0194\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0194\u0195\7,\2\2\u0195\u0196\7\61\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u0198\b9\2\2\u0198r\3\2\2\2\u0199\u019a\7\61\2\2\u019a\u019b"+
		"\7\61\2\2\u019b\u019f\3\2\2\2\u019c\u019e\13\2\2\2\u019d\u019c\3\2\2\2"+
		"\u019e\u01a1\3\2\2\2\u019f\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a2"+
		"\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\7\f\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a5\b:\2\2\u01a5t\3\2\2\2\23\2\u0130\u013d\u0144\u0159\u0160\u0165"+
		"\u0167\u016b\u016e\u0172\u0179\u017d\u0182\u0187\u0191\u019f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}