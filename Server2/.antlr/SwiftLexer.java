// Generated from c:\Users\pbara\OneDrive\Escritorio\T-Swift\Server2\SwiftLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SwiftLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, BOOL=3, STR=4, CHAR=5, VAR=6, LET=7, VOID=8, TRU=9, FAL=10, 
		PRINT=11, IF=12, ELSE=13, WHILE=14, FOR=15, IN=16, SWITCH=17, CASE=18, 
		DEFAULT=19, BREAK=20, RETURN=21, CONTINUE=22, GUARD=23, FUNC=24, NIL=25, 
		STRUCT=26, MUTATING=27, SELF=28, INOUT=29, APPEND=30, REMOVELAST=31, REMOVE=32, 
		AT=33, ISEMPTY=34, COUNT=35, NUMBER=36, STRING=37, ID=38, DIF=39, IG_IG=40, 
		NOT=41, OR=42, AND=43, IG=44, MAY_IG=45, MEN_IG=46, SUM_IG=47, SUB_IG=48, 
		MAYOR=49, MENOR=50, MUL=51, DIV=52, ADD=53, SUB=54, MOD=55, PARIZQ=56, 
		PARDER=57, LLAVEIZQ=58, LLAVEDER=59, D_PTS=60, CORIZQ=61, CORDER=62, COMA=63, 
		PUNTO=64, WHITESPACE=65, COMMENT=66, LINE_COMMENT=67;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "FLOAT", "BOOL", "STR", "CHAR", "VAR", "LET", "VOID", "TRU", "FAL", 
			"PRINT", "IF", "ELSE", "WHILE", "FOR", "IN", "SWITCH", "CASE", "DEFAULT", 
			"BREAK", "RETURN", "CONTINUE", "GUARD", "FUNC", "NIL", "STRUCT", "MUTATING", 
			"SELF", "INOUT", "APPEND", "REMOVELAST", "REMOVE", "AT", "ISEMPTY", "COUNT", 
			"NUMBER", "STRING", "ID", "DIF", "IG_IG", "NOT", "OR", "AND", "IG", "MAY_IG", 
			"MEN_IG", "SUM_IG", "SUB_IG", "MAYOR", "MENOR", "MUL", "DIV", "ADD", 
			"SUB", "MOD", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "D_PTS", "CORIZQ", 
			"CORDER", "COMA", "PUNTO", "WHITESPACE", "COMMENT", "LINE_COMMENT", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Int'", "'Float'", "'Bool'", "'String'", "'Character'", "'var'", 
			"'let'", "'void'", "'true'", "'false'", "'print'", "'if'", "'else'", 
			"'while'", "'for'", "'in'", "'switch'", "'case'", "'default'", "'break'", 
			"'return'", "'continue'", "'guard'", "'func'", "'nil'", "'struct'", "'mutating'", 
			"'self'", "'inout'", "'append'", "'removeLast'", "'remove'", "'at'", 
			"'isEmpty'", "'count'", null, null, null, "'!='", "'=='", "'!'", "'||'", 
			"'&&'", "'='", "'>='", "'<='", "'+='", "'-='", "'>'", "'<'", "'*'", "'/'", 
			"'+'", "'-'", "'%'", "'('", "')'", "'{'", "'}'", "':'", "'['", "']'", 
			"','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "BOOL", "STR", "CHAR", "VAR", "LET", "VOID", "TRU", 
			"FAL", "PRINT", "IF", "ELSE", "WHILE", "FOR", "IN", "SWITCH", "CASE", 
			"DEFAULT", "BREAK", "RETURN", "CONTINUE", "GUARD", "FUNC", "NIL", "STRUCT", 
			"MUTATING", "SELF", "INOUT", "APPEND", "REMOVELAST", "REMOVE", "AT", 
			"ISEMPTY", "COUNT", "NUMBER", "STRING", "ID", "DIF", "IG_IG", "NOT", 
			"OR", "AND", "IG", "MAY_IG", "MEN_IG", "SUM_IG", "SUB_IG", "MAYOR", "MENOR", 
			"MUL", "DIV", "ADD", "SUB", "MOD", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", 
			"D_PTS", "CORIZQ", "CORDER", "COMA", "PUNTO", "WHITESPACE", "COMMENT", 
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


	public SwiftLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SwiftLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2E\u01d8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\6%\u015e"+
		"\n%\r%\16%\u015f\3%\3%\6%\u0164\n%\r%\16%\u0165\5%\u0168\n%\3&\3&\7&\u016c"+
		"\n&\f&\16&\u016f\13&\3&\3&\3\'\3\'\7\'\u0175\n\'\f\'\16\'\u0178\13\'\3"+
		"(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@"+
		"\3A\3A\3B\6B\u01b7\nB\rB\16B\u01b8\3B\3B\3C\3C\3C\3C\7C\u01c1\nC\fC\16"+
		"C\u01c4\13C\3C\3C\3C\3C\3C\3D\3D\3D\3D\7D\u01cf\nD\fD\16D\u01d2\13D\3"+
		"D\3D\3E\3E\3E\3\u01c2\2F\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089\2\3\2\t\3\2\62;\3\2$$\4\2C\\c|\6\2\62;C\\aac|\6\2\13\f\17\17\""+
		"\"^^\4\2\f\f\17\17\t\2\"#%%--/\60<<BB]_\2\u01de\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\3\u008b\3\2\2\2\5\u008f\3\2\2\2\7\u0095\3\2\2\2\t\u009a\3\2\2\2"+
		"\13\u00a1\3\2\2\2\r\u00ab\3\2\2\2\17\u00af\3\2\2\2\21\u00b3\3\2\2\2\23"+
		"\u00b8\3\2\2\2\25\u00bd\3\2\2\2\27\u00c3\3\2\2\2\31\u00c9\3\2\2\2\33\u00cc"+
		"\3\2\2\2\35\u00d1\3\2\2\2\37\u00d7\3\2\2\2!\u00db\3\2\2\2#\u00de\3\2\2"+
		"\2%\u00e5\3\2\2\2\'\u00ea\3\2\2\2)\u00f2\3\2\2\2+\u00f8\3\2\2\2-\u00ff"+
		"\3\2\2\2/\u0108\3\2\2\2\61\u010e\3\2\2\2\63\u0113\3\2\2\2\65\u0117\3\2"+
		"\2\2\67\u011e\3\2\2\29\u0127\3\2\2\2;\u012c\3\2\2\2=\u0132\3\2\2\2?\u0139"+
		"\3\2\2\2A\u0144\3\2\2\2C\u014b\3\2\2\2E\u014e\3\2\2\2G\u0156\3\2\2\2I"+
		"\u015d\3\2\2\2K\u0169\3\2\2\2M\u0172\3\2\2\2O\u0179\3\2\2\2Q\u017c\3\2"+
		"\2\2S\u017f\3\2\2\2U\u0181\3\2\2\2W\u0184\3\2\2\2Y\u0187\3\2\2\2[\u0189"+
		"\3\2\2\2]\u018c\3\2\2\2_\u018f\3\2\2\2a\u0192\3\2\2\2c\u0195\3\2\2\2e"+
		"\u0197\3\2\2\2g\u0199\3\2\2\2i\u019b\3\2\2\2k\u019d\3\2\2\2m\u019f\3\2"+
		"\2\2o\u01a1\3\2\2\2q\u01a3\3\2\2\2s\u01a5\3\2\2\2u\u01a7\3\2\2\2w\u01a9"+
		"\3\2\2\2y\u01ab\3\2\2\2{\u01ad\3\2\2\2}\u01af\3\2\2\2\177\u01b1\3\2\2"+
		"\2\u0081\u01b3\3\2\2\2\u0083\u01b6\3\2\2\2\u0085\u01bc\3\2\2\2\u0087\u01ca"+
		"\3\2\2\2\u0089\u01d5\3\2\2\2\u008b\u008c\7K\2\2\u008c\u008d\7p\2\2\u008d"+
		"\u008e\7v\2\2\u008e\4\3\2\2\2\u008f\u0090\7H\2\2\u0090\u0091\7n\2\2\u0091"+
		"\u0092\7q\2\2\u0092\u0093\7c\2\2\u0093\u0094\7v\2\2\u0094\6\3\2\2\2\u0095"+
		"\u0096\7D\2\2\u0096\u0097\7q\2\2\u0097\u0098\7q\2\2\u0098\u0099\7n\2\2"+
		"\u0099\b\3\2\2\2\u009a\u009b\7U\2\2\u009b\u009c\7v\2\2\u009c\u009d\7t"+
		"\2\2\u009d\u009e\7k\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7i\2\2\u00a0\n"+
		"\3\2\2\2\u00a1\u00a2\7E\2\2\u00a2\u00a3\7j\2\2\u00a3\u00a4\7c\2\2\u00a4"+
		"\u00a5\7t\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7e\2\2\u00a7\u00a8\7v\2\2"+
		"\u00a8\u00a9\7g\2\2\u00a9\u00aa\7t\2\2\u00aa\f\3\2\2\2\u00ab\u00ac\7x"+
		"\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7t\2\2\u00ae\16\3\2\2\2\u00af\u00b0"+
		"\7n\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7v\2\2\u00b2\20\3\2\2\2\u00b3\u00b4"+
		"\7x\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7f\2\2\u00b7"+
		"\22\3\2\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7w\2\2\u00bb"+
		"\u00bc\7g\2\2\u00bc\24\3\2\2\2\u00bd\u00be\7h\2\2\u00be\u00bf\7c\2\2\u00bf"+
		"\u00c0\7n\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7g\2\2\u00c2\26\3\2\2\2\u00c3"+
		"\u00c4\7r\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7p\2\2"+
		"\u00c7\u00c8\7v\2\2\u00c8\30\3\2\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7"+
		"h\2\2\u00cb\32\3\2\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf"+
		"\7u\2\2\u00cf\u00d0\7g\2\2\u00d0\34\3\2\2\2\u00d1\u00d2\7y\2\2\u00d2\u00d3"+
		"\7j\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7g\2\2\u00d6"+
		"\36\3\2\2\2\u00d7\u00d8\7h\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7t\2\2\u00da"+
		" \3\2\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7p\2\2\u00dd\"\3\2\2\2\u00de"+
		"\u00df\7u\2\2\u00df\u00e0\7y\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7v\2\2"+
		"\u00e2\u00e3\7e\2\2\u00e3\u00e4\7j\2\2\u00e4$\3\2\2\2\u00e5\u00e6\7e\2"+
		"\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7g\2\2\u00e9&\3\2"+
		"\2\2\u00ea\u00eb\7f\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7h\2\2\u00ed\u00ee"+
		"\7c\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f0\7n\2\2\u00f0\u00f1\7v\2\2\u00f1"+
		"(\3\2\2\2\u00f2\u00f3\7d\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7g\2\2\u00f5"+
		"\u00f6\7c\2\2\u00f6\u00f7\7m\2\2\u00f7*\3\2\2\2\u00f8\u00f9\7t\2\2\u00f9"+
		"\u00fa\7g\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7w\2\2\u00fc\u00fd\7t\2\2"+
		"\u00fd\u00fe\7p\2\2\u00fe,\3\2\2\2\u00ff\u0100\7e\2\2\u0100\u0101\7q\2"+
		"\2\u0101\u0102\7p\2\2\u0102\u0103\7v\2\2\u0103\u0104\7k\2\2\u0104\u0105"+
		"\7p\2\2\u0105\u0106\7w\2\2\u0106\u0107\7g\2\2\u0107.\3\2\2\2\u0108\u0109"+
		"\7i\2\2\u0109\u010a\7w\2\2\u010a\u010b\7c\2\2\u010b\u010c\7t\2\2\u010c"+
		"\u010d\7f\2\2\u010d\60\3\2\2\2\u010e\u010f\7h\2\2\u010f\u0110\7w\2\2\u0110"+
		"\u0111\7p\2\2\u0111\u0112\7e\2\2\u0112\62\3\2\2\2\u0113\u0114\7p\2\2\u0114"+
		"\u0115\7k\2\2\u0115\u0116\7n\2\2\u0116\64\3\2\2\2\u0117\u0118\7u\2\2\u0118"+
		"\u0119\7v\2\2\u0119\u011a\7t\2\2\u011a\u011b\7w\2\2\u011b\u011c\7e\2\2"+
		"\u011c\u011d\7v\2\2\u011d\66\3\2\2\2\u011e\u011f\7o\2\2\u011f\u0120\7"+
		"w\2\2\u0120\u0121\7v\2\2\u0121\u0122\7c\2\2\u0122\u0123\7v\2\2\u0123\u0124"+
		"\7k\2\2\u0124\u0125\7p\2\2\u0125\u0126\7i\2\2\u01268\3\2\2\2\u0127\u0128"+
		"\7u\2\2\u0128\u0129\7g\2\2\u0129\u012a\7n\2\2\u012a\u012b\7h\2\2\u012b"+
		":\3\2\2\2\u012c\u012d\7k\2\2\u012d\u012e\7p\2\2\u012e\u012f\7q\2\2\u012f"+
		"\u0130\7w\2\2\u0130\u0131\7v\2\2\u0131<\3\2\2\2\u0132\u0133\7c\2\2\u0133"+
		"\u0134\7r\2\2\u0134\u0135\7r\2\2\u0135\u0136\7g\2\2\u0136\u0137\7p\2\2"+
		"\u0137\u0138\7f\2\2\u0138>\3\2\2\2\u0139\u013a\7t\2\2\u013a\u013b\7g\2"+
		"\2\u013b\u013c\7o\2\2\u013c\u013d\7q\2\2\u013d\u013e\7x\2\2\u013e\u013f"+
		"\7g\2\2\u013f\u0140\7N\2\2\u0140\u0141\7c\2\2\u0141\u0142\7u\2\2\u0142"+
		"\u0143\7v\2\2\u0143@\3\2\2\2\u0144\u0145\7t\2\2\u0145\u0146\7g\2\2\u0146"+
		"\u0147\7o\2\2\u0147\u0148\7q\2\2\u0148\u0149\7x\2\2\u0149\u014a\7g\2\2"+
		"\u014aB\3\2\2\2\u014b\u014c\7c\2\2\u014c\u014d\7v\2\2\u014dD\3\2\2\2\u014e"+
		"\u014f\7k\2\2\u014f\u0150\7u\2\2\u0150\u0151\7G\2\2\u0151\u0152\7o\2\2"+
		"\u0152\u0153\7r\2\2\u0153\u0154\7v\2\2\u0154\u0155\7{\2\2\u0155F\3\2\2"+
		"\2\u0156\u0157\7e\2\2\u0157\u0158\7q\2\2\u0158\u0159\7w\2\2\u0159\u015a"+
		"\7p\2\2\u015a\u015b\7v\2\2\u015bH\3\2\2\2\u015c\u015e\t\2\2\2\u015d\u015c"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u0167\3\2\2\2\u0161\u0163\7\60\2\2\u0162\u0164\t\2\2\2\u0163\u0162\3"+
		"\2\2\2\u0164\u0165\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0168\3\2\2\2\u0167\u0161\3\2\2\2\u0167\u0168\3\2\2\2\u0168J\3\2\2\2"+
		"\u0169\u016d\7$\2\2\u016a\u016c\n\3\2\2\u016b\u016a\3\2\2\2\u016c\u016f"+
		"\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u0170\u0171\7$\2\2\u0171L\3\2\2\2\u0172\u0176\t\4\2\2\u0173"+
		"\u0175\t\5\2\2\u0174\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2"+
		"\2\2\u0176\u0177\3\2\2\2\u0177N\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a"+
		"\7#\2\2\u017a\u017b\7?\2\2\u017bP\3\2\2\2\u017c\u017d\7?\2\2\u017d\u017e"+
		"\7?\2\2\u017eR\3\2\2\2\u017f\u0180\7#\2\2\u0180T\3\2\2\2\u0181\u0182\7"+
		"~\2\2\u0182\u0183\7~\2\2\u0183V\3\2\2\2\u0184\u0185\7(\2\2\u0185\u0186"+
		"\7(\2\2\u0186X\3\2\2\2\u0187\u0188\7?\2\2\u0188Z\3\2\2\2\u0189\u018a\7"+
		"@\2\2\u018a\u018b\7?\2\2\u018b\\\3\2\2\2\u018c\u018d\7>\2\2\u018d\u018e"+
		"\7?\2\2\u018e^\3\2\2\2\u018f\u0190\7-\2\2\u0190\u0191\7?\2\2\u0191`\3"+
		"\2\2\2\u0192\u0193\7/\2\2\u0193\u0194\7?\2\2\u0194b\3\2\2\2\u0195\u0196"+
		"\7@\2\2\u0196d\3\2\2\2\u0197\u0198\7>\2\2\u0198f\3\2\2\2\u0199\u019a\7"+
		",\2\2\u019ah\3\2\2\2\u019b\u019c\7\61\2\2\u019cj\3\2\2\2\u019d\u019e\7"+
		"-\2\2\u019el\3\2\2\2\u019f\u01a0\7/\2\2\u01a0n\3\2\2\2\u01a1\u01a2\7\'"+
		"\2\2\u01a2p\3\2\2\2\u01a3\u01a4\7*\2\2\u01a4r\3\2\2\2\u01a5\u01a6\7+\2"+
		"\2\u01a6t\3\2\2\2\u01a7\u01a8\7}\2\2\u01a8v\3\2\2\2\u01a9\u01aa\7\177"+
		"\2\2\u01aax\3\2\2\2\u01ab\u01ac\7<\2\2\u01acz\3\2\2\2\u01ad\u01ae\7]\2"+
		"\2\u01ae|\3\2\2\2\u01af\u01b0\7_\2\2\u01b0~\3\2\2\2\u01b1\u01b2\7.\2\2"+
		"\u01b2\u0080\3\2\2\2\u01b3\u01b4\7\60\2\2\u01b4\u0082\3\2\2\2\u01b5\u01b7"+
		"\t\6\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\bB\2\2\u01bb\u0084\3\2"+
		"\2\2\u01bc\u01bd\7\61\2\2\u01bd\u01be\7,\2\2\u01be\u01c2\3\2\2\2\u01bf"+
		"\u01c1\13\2\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c3\3"+
		"\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5"+
		"\u01c6\7,\2\2\u01c6\u01c7\7\61\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\bC"+
		"\2\2\u01c9\u0086\3\2\2\2\u01ca\u01cb\7\61\2\2\u01cb\u01cc\7\61\2\2\u01cc"+
		"\u01d0\3\2\2\2\u01cd\u01cf\n\7\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d2\3\2"+
		"\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2"+
		"\u01d0\3\2\2\2\u01d3\u01d4\bD\2\2\u01d4\u0088\3\2\2\2\u01d5\u01d6\7^\2"+
		"\2\u01d6\u01d7\t\b\2\2\u01d7\u008a\3\2\2\2\13\2\u015f\u0165\u0167\u016d"+
		"\u0176\u01b8\u01c2\u01d0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}