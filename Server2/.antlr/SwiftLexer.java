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
		PUNTO=64, COMILLA=65, WHITESPACE=66, COMMENT=67, LINE_COMMENT=68;
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
			"CORDER", "COMA", "PUNTO", "COMILLA", "WHITESPACE", "COMMENT", "LINE_COMMENT", 
			"ESC_SEQ"
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
			"','", "'.'", "'\"'"
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
			"D_PTS", "CORIZQ", "CORDER", "COMA", "PUNTO", "COMILLA", "WHITESPACE", 
			"COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2F\u01dc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\6"+
		"%\u0160\n%\r%\16%\u0161\3%\3%\6%\u0166\n%\r%\16%\u0167\5%\u016a\n%\3&"+
		"\3&\7&\u016e\n&\f&\16&\u0171\13&\3&\3&\3\'\3\'\7\'\u0177\n\'\f\'\16\'"+
		"\u017a\13\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3.\3"+
		"/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3"+
		"\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3"+
		">\3?\3?\3@\3@\3A\3A\3B\3B\3C\6C\u01bb\nC\rC\16C\u01bc\3C\3C\3D\3D\3D\3"+
		"D\7D\u01c5\nD\fD\16D\u01c8\13D\3D\3D\3D\3D\3D\3E\3E\3E\3E\7E\u01d3\nE"+
		"\fE\16E\u01d6\13E\3E\3E\3F\3F\3F\3\u01c6\2G\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008b\2\3\2\t\3\2\62;\3\2$$\4\2C\\c|\6\2"+
		"\62;C\\aac|\6\2\13\f\17\17\"\"^^\4\2\f\f\17\17\t\2\"#%%--/\60<<BB]_\2"+
		"\u01e2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2"+
		"\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\3\u008d\3\2\2\2\5"+
		"\u0091\3\2\2\2\7\u0097\3\2\2\2\t\u009c\3\2\2\2\13\u00a3\3\2\2\2\r\u00ad"+
		"\3\2\2\2\17\u00b1\3\2\2\2\21\u00b5\3\2\2\2\23\u00ba\3\2\2\2\25\u00bf\3"+
		"\2\2\2\27\u00c5\3\2\2\2\31\u00cb\3\2\2\2\33\u00ce\3\2\2\2\35\u00d3\3\2"+
		"\2\2\37\u00d9\3\2\2\2!\u00dd\3\2\2\2#\u00e0\3\2\2\2%\u00e7\3\2\2\2\'\u00ec"+
		"\3\2\2\2)\u00f4\3\2\2\2+\u00fa\3\2\2\2-\u0101\3\2\2\2/\u010a\3\2\2\2\61"+
		"\u0110\3\2\2\2\63\u0115\3\2\2\2\65\u0119\3\2\2\2\67\u0120\3\2\2\29\u0129"+
		"\3\2\2\2;\u012e\3\2\2\2=\u0134\3\2\2\2?\u013b\3\2\2\2A\u0146\3\2\2\2C"+
		"\u014d\3\2\2\2E\u0150\3\2\2\2G\u0158\3\2\2\2I\u015f\3\2\2\2K\u016b\3\2"+
		"\2\2M\u0174\3\2\2\2O\u017b\3\2\2\2Q\u017e\3\2\2\2S\u0181\3\2\2\2U\u0183"+
		"\3\2\2\2W\u0186\3\2\2\2Y\u0189\3\2\2\2[\u018b\3\2\2\2]\u018e\3\2\2\2_"+
		"\u0191\3\2\2\2a\u0194\3\2\2\2c\u0197\3\2\2\2e\u0199\3\2\2\2g\u019b\3\2"+
		"\2\2i\u019d\3\2\2\2k\u019f\3\2\2\2m\u01a1\3\2\2\2o\u01a3\3\2\2\2q\u01a5"+
		"\3\2\2\2s\u01a7\3\2\2\2u\u01a9\3\2\2\2w\u01ab\3\2\2\2y\u01ad\3\2\2\2{"+
		"\u01af\3\2\2\2}\u01b1\3\2\2\2\177\u01b3\3\2\2\2\u0081\u01b5\3\2\2\2\u0083"+
		"\u01b7\3\2\2\2\u0085\u01ba\3\2\2\2\u0087\u01c0\3\2\2\2\u0089\u01ce\3\2"+
		"\2\2\u008b\u01d9\3\2\2\2\u008d\u008e\7K\2\2\u008e\u008f\7p\2\2\u008f\u0090"+
		"\7v\2\2\u0090\4\3\2\2\2\u0091\u0092\7H\2\2\u0092\u0093\7n\2\2\u0093\u0094"+
		"\7q\2\2\u0094\u0095\7c\2\2\u0095\u0096\7v\2\2\u0096\6\3\2\2\2\u0097\u0098"+
		"\7D\2\2\u0098\u0099\7q\2\2\u0099\u009a\7q\2\2\u009a\u009b\7n\2\2\u009b"+
		"\b\3\2\2\2\u009c\u009d\7U\2\2\u009d\u009e\7v\2\2\u009e\u009f\7t\2\2\u009f"+
		"\u00a0\7k\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7i\2\2\u00a2\n\3\2\2\2\u00a3"+
		"\u00a4\7E\2\2\u00a4\u00a5\7j\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7t\2\2"+
		"\u00a7\u00a8\7c\2\2\u00a8\u00a9\7e\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab"+
		"\7g\2\2\u00ab\u00ac\7t\2\2\u00ac\f\3\2\2\2\u00ad\u00ae\7x\2\2\u00ae\u00af"+
		"\7c\2\2\u00af\u00b0\7t\2\2\u00b0\16\3\2\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3"+
		"\7g\2\2\u00b3\u00b4\7v\2\2\u00b4\20\3\2\2\2\u00b5\u00b6\7x\2\2\u00b6\u00b7"+
		"\7q\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7f\2\2\u00b9\22\3\2\2\2\u00ba\u00bb"+
		"\7v\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be\7g\2\2\u00be"+
		"\24\3\2\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7n\2\2\u00c2"+
		"\u00c3\7u\2\2\u00c3\u00c4\7g\2\2\u00c4\26\3\2\2\2\u00c5\u00c6\7r\2\2\u00c6"+
		"\u00c7\7t\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7v\2\2"+
		"\u00ca\30\3\2\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7h\2\2\u00cd\32\3\2\2"+
		"\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2"+
		"\7g\2\2\u00d2\34\3\2\2\2\u00d3\u00d4\7y\2\2\u00d4\u00d5\7j\2\2\u00d5\u00d6"+
		"\7k\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7g\2\2\u00d8\36\3\2\2\2\u00d9\u00da"+
		"\7h\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7t\2\2\u00dc \3\2\2\2\u00dd\u00de"+
		"\7k\2\2\u00de\u00df\7p\2\2\u00df\"\3\2\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2"+
		"\7y\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7e\2\2\u00e5"+
		"\u00e6\7j\2\2\u00e6$\3\2\2\2\u00e7\u00e8\7e\2\2\u00e8\u00e9\7c\2\2\u00e9"+
		"\u00ea\7u\2\2\u00ea\u00eb\7g\2\2\u00eb&\3\2\2\2\u00ec\u00ed\7f\2\2\u00ed"+
		"\u00ee\7g\2\2\u00ee\u00ef\7h\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7w\2\2"+
		"\u00f1\u00f2\7n\2\2\u00f2\u00f3\7v\2\2\u00f3(\3\2\2\2\u00f4\u00f5\7d\2"+
		"\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9"+
		"\7m\2\2\u00f9*\3\2\2\2\u00fa\u00fb\7t\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd"+
		"\7v\2\2\u00fd\u00fe\7w\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7p\2\2\u0100"+
		",\3\2\2\2\u0101\u0102\7e\2\2\u0102\u0103\7q\2\2\u0103\u0104\7p\2\2\u0104"+
		"\u0105\7v\2\2\u0105\u0106\7k\2\2\u0106\u0107\7p\2\2\u0107\u0108\7w\2\2"+
		"\u0108\u0109\7g\2\2\u0109.\3\2\2\2\u010a\u010b\7i\2\2\u010b\u010c\7w\2"+
		"\2\u010c\u010d\7c\2\2\u010d\u010e\7t\2\2\u010e\u010f\7f\2\2\u010f\60\3"+
		"\2\2\2\u0110\u0111\7h\2\2\u0111\u0112\7w\2\2\u0112\u0113\7p\2\2\u0113"+
		"\u0114\7e\2\2\u0114\62\3\2\2\2\u0115\u0116\7p\2\2\u0116\u0117\7k\2\2\u0117"+
		"\u0118\7n\2\2\u0118\64\3\2\2\2\u0119\u011a\7u\2\2\u011a\u011b\7v\2\2\u011b"+
		"\u011c\7t\2\2\u011c\u011d\7w\2\2\u011d\u011e\7e\2\2\u011e\u011f\7v\2\2"+
		"\u011f\66\3\2\2\2\u0120\u0121\7o\2\2\u0121\u0122\7w\2\2\u0122\u0123\7"+
		"v\2\2\u0123\u0124\7c\2\2\u0124\u0125\7v\2\2\u0125\u0126\7k\2\2\u0126\u0127"+
		"\7p\2\2\u0127\u0128\7i\2\2\u01288\3\2\2\2\u0129\u012a\7u\2\2\u012a\u012b"+
		"\7g\2\2\u012b\u012c\7n\2\2\u012c\u012d\7h\2\2\u012d:\3\2\2\2\u012e\u012f"+
		"\7k\2\2\u012f\u0130\7p\2\2\u0130\u0131\7q\2\2\u0131\u0132\7w\2\2\u0132"+
		"\u0133\7v\2\2\u0133<\3\2\2\2\u0134\u0135\7c\2\2\u0135\u0136\7r\2\2\u0136"+
		"\u0137\7r\2\2\u0137\u0138\7g\2\2\u0138\u0139\7p\2\2\u0139\u013a\7f\2\2"+
		"\u013a>\3\2\2\2\u013b\u013c\7t\2\2\u013c\u013d\7g\2\2\u013d\u013e\7o\2"+
		"\2\u013e\u013f\7q\2\2\u013f\u0140\7x\2\2\u0140\u0141\7g\2\2\u0141\u0142"+
		"\7N\2\2\u0142\u0143\7c\2\2\u0143\u0144\7u\2\2\u0144\u0145\7v\2\2\u0145"+
		"@\3\2\2\2\u0146\u0147\7t\2\2\u0147\u0148\7g\2\2\u0148\u0149\7o\2\2\u0149"+
		"\u014a\7q\2\2\u014a\u014b\7x\2\2\u014b\u014c\7g\2\2\u014cB\3\2\2\2\u014d"+
		"\u014e\7c\2\2\u014e\u014f\7v\2\2\u014fD\3\2\2\2\u0150\u0151\7k\2\2\u0151"+
		"\u0152\7u\2\2\u0152\u0153\7G\2\2\u0153\u0154\7o\2\2\u0154\u0155\7r\2\2"+
		"\u0155\u0156\7v\2\2\u0156\u0157\7{\2\2\u0157F\3\2\2\2\u0158\u0159\7e\2"+
		"\2\u0159\u015a\7q\2\2\u015a\u015b\7w\2\2\u015b\u015c\7p\2\2\u015c\u015d"+
		"\7v\2\2\u015dH\3\2\2\2\u015e\u0160\t\2\2\2\u015f\u015e\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0169\3\2\2\2\u0163"+
		"\u0165\7\60\2\2\u0164\u0166\t\2\2\2\u0165\u0164\3\2\2\2\u0166\u0167\3"+
		"\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169"+
		"\u0163\3\2\2\2\u0169\u016a\3\2\2\2\u016aJ\3\2\2\2\u016b\u016f\7$\2\2\u016c"+
		"\u016e\n\3\2\2\u016d\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2"+
		"\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172"+
		"\u0173\7$\2\2\u0173L\3\2\2\2\u0174\u0178\t\4\2\2\u0175\u0177\t\5\2\2\u0176"+
		"\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2"+
		"\2\2\u0179N\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\7#\2\2\u017c\u017d"+
		"\7?\2\2\u017dP\3\2\2\2\u017e\u017f\7?\2\2\u017f\u0180\7?\2\2\u0180R\3"+
		"\2\2\2\u0181\u0182\7#\2\2\u0182T\3\2\2\2\u0183\u0184\7~\2\2\u0184\u0185"+
		"\7~\2\2\u0185V\3\2\2\2\u0186\u0187\7(\2\2\u0187\u0188\7(\2\2\u0188X\3"+
		"\2\2\2\u0189\u018a\7?\2\2\u018aZ\3\2\2\2\u018b\u018c\7@\2\2\u018c\u018d"+
		"\7?\2\2\u018d\\\3\2\2\2\u018e\u018f\7>\2\2\u018f\u0190\7?\2\2\u0190^\3"+
		"\2\2\2\u0191\u0192\7-\2\2\u0192\u0193\7?\2\2\u0193`\3\2\2\2\u0194\u0195"+
		"\7/\2\2\u0195\u0196\7?\2\2\u0196b\3\2\2\2\u0197\u0198\7@\2\2\u0198d\3"+
		"\2\2\2\u0199\u019a\7>\2\2\u019af\3\2\2\2\u019b\u019c\7,\2\2\u019ch\3\2"+
		"\2\2\u019d\u019e\7\61\2\2\u019ej\3\2\2\2\u019f\u01a0\7-\2\2\u01a0l\3\2"+
		"\2\2\u01a1\u01a2\7/\2\2\u01a2n\3\2\2\2\u01a3\u01a4\7\'\2\2\u01a4p\3\2"+
		"\2\2\u01a5\u01a6\7*\2\2\u01a6r\3\2\2\2\u01a7\u01a8\7+\2\2\u01a8t\3\2\2"+
		"\2\u01a9\u01aa\7}\2\2\u01aav\3\2\2\2\u01ab\u01ac\7\177\2\2\u01acx\3\2"+
		"\2\2\u01ad\u01ae\7<\2\2\u01aez\3\2\2\2\u01af\u01b0\7]\2\2\u01b0|\3\2\2"+
		"\2\u01b1\u01b2\7_\2\2\u01b2~\3\2\2\2\u01b3\u01b4\7.\2\2\u01b4\u0080\3"+
		"\2\2\2\u01b5\u01b6\7\60\2\2\u01b6\u0082\3\2\2\2\u01b7\u01b8\7$\2\2\u01b8"+
		"\u0084\3\2\2\2\u01b9\u01bb\t\6\2\2\u01ba\u01b9\3\2\2\2\u01bb\u01bc\3\2"+
		"\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01bf\bC\2\2\u01bf\u0086\3\2\2\2\u01c0\u01c1\7\61\2\2\u01c1\u01c2\7,"+
		"\2\2\u01c2\u01c6\3\2\2\2\u01c3\u01c5\13\2\2\2\u01c4\u01c3\3\2\2\2\u01c5"+
		"\u01c8\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c9\3\2"+
		"\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\7,\2\2\u01ca\u01cb\7\61\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01cc\u01cd\bD\2\2\u01cd\u0088\3\2\2\2\u01ce\u01cf\7\61"+
		"\2\2\u01cf\u01d0\7\61\2\2\u01d0\u01d4\3\2\2\2\u01d1\u01d3\n\7\2\2\u01d2"+
		"\u01d1\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2"+
		"\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01d8\bE\2\2\u01d8"+
		"\u008a\3\2\2\2\u01d9\u01da\7^\2\2\u01da\u01db\t\b\2\2\u01db\u008c\3\2"+
		"\2\2\13\2\u0161\u0167\u0169\u016f\u0178\u01bc\u01c6\u01d4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}