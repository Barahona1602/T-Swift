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
		WHITESPACE=64, COMMENT=65, LINE_COMMENT=66;
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
			"CORDER", "COMA", "WHITESPACE", "COMMENT", "LINE_COMMENT", "ESC_SEQ"
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
			"','"
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
			"D_PTS", "CORIZQ", "CORDER", "COMA", "WHITESPACE", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2D\u01d4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\6%\u015c\n%\r"+
		"%\16%\u015d\3%\3%\6%\u0162\n%\r%\16%\u0163\5%\u0166\n%\3&\3&\7&\u016a"+
		"\n&\f&\16&\u016d\13&\3&\3&\3\'\3\'\7\'\u0173\n\'\f\'\16\'\u0176\13\'\3"+
		"(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@"+
		"\3A\6A\u01b3\nA\rA\16A\u01b4\3A\3A\3B\3B\3B\3B\7B\u01bd\nB\fB\16B\u01c0"+
		"\13B\3B\3B\3B\3B\3B\3C\3C\3C\3C\7C\u01cb\nC\fC\16C\u01ce\13C\3C\3C\3D"+
		"\3D\3D\3\u01be\2E\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087\2\3\2\t"+
		"\3\2\62;\3\2$$\4\2C\\c|\6\2\62;C\\aac|\6\2\13\f\17\17\"\"^^\4\2\f\f\17"+
		"\17\t\2\"#%%--/\60<<BB]_\2\u01da\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\3\u0089\3\2\2\2\5\u008d\3\2\2"+
		"\2\7\u0093\3\2\2\2\t\u0098\3\2\2\2\13\u009f\3\2\2\2\r\u00a9\3\2\2\2\17"+
		"\u00ad\3\2\2\2\21\u00b1\3\2\2\2\23\u00b6\3\2\2\2\25\u00bb\3\2\2\2\27\u00c1"+
		"\3\2\2\2\31\u00c7\3\2\2\2\33\u00ca\3\2\2\2\35\u00cf\3\2\2\2\37\u00d5\3"+
		"\2\2\2!\u00d9\3\2\2\2#\u00dc\3\2\2\2%\u00e3\3\2\2\2\'\u00e8\3\2\2\2)\u00f0"+
		"\3\2\2\2+\u00f6\3\2\2\2-\u00fd\3\2\2\2/\u0106\3\2\2\2\61\u010c\3\2\2\2"+
		"\63\u0111\3\2\2\2\65\u0115\3\2\2\2\67\u011c\3\2\2\29\u0125\3\2\2\2;\u012a"+
		"\3\2\2\2=\u0130\3\2\2\2?\u0137\3\2\2\2A\u0142\3\2\2\2C\u0149\3\2\2\2E"+
		"\u014c\3\2\2\2G\u0154\3\2\2\2I\u015b\3\2\2\2K\u0167\3\2\2\2M\u0170\3\2"+
		"\2\2O\u0177\3\2\2\2Q\u017a\3\2\2\2S\u017d\3\2\2\2U\u017f\3\2\2\2W\u0182"+
		"\3\2\2\2Y\u0185\3\2\2\2[\u0187\3\2\2\2]\u018a\3\2\2\2_\u018d\3\2\2\2a"+
		"\u0190\3\2\2\2c\u0193\3\2\2\2e\u0195\3\2\2\2g\u0197\3\2\2\2i\u0199\3\2"+
		"\2\2k\u019b\3\2\2\2m\u019d\3\2\2\2o\u019f\3\2\2\2q\u01a1\3\2\2\2s\u01a3"+
		"\3\2\2\2u\u01a5\3\2\2\2w\u01a7\3\2\2\2y\u01a9\3\2\2\2{\u01ab\3\2\2\2}"+
		"\u01ad\3\2\2\2\177\u01af\3\2\2\2\u0081\u01b2\3\2\2\2\u0083\u01b8\3\2\2"+
		"\2\u0085\u01c6\3\2\2\2\u0087\u01d1\3\2\2\2\u0089\u008a\7K\2\2\u008a\u008b"+
		"\7p\2\2\u008b\u008c\7v\2\2\u008c\4\3\2\2\2\u008d\u008e\7H\2\2\u008e\u008f"+
		"\7n\2\2\u008f\u0090\7q\2\2\u0090\u0091\7c\2\2\u0091\u0092\7v\2\2\u0092"+
		"\6\3\2\2\2\u0093\u0094\7D\2\2\u0094\u0095\7q\2\2\u0095\u0096\7q\2\2\u0096"+
		"\u0097\7n\2\2\u0097\b\3\2\2\2\u0098\u0099\7U\2\2\u0099\u009a\7v\2\2\u009a"+
		"\u009b\7t\2\2\u009b\u009c\7k\2\2\u009c\u009d\7p\2\2\u009d\u009e\7i\2\2"+
		"\u009e\n\3\2\2\2\u009f\u00a0\7E\2\2\u00a0\u00a1\7j\2\2\u00a1\u00a2\7c"+
		"\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6"+
		"\7v\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7t\2\2\u00a8\f\3\2\2\2\u00a9\u00aa"+
		"\7x\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7t\2\2\u00ac\16\3\2\2\2\u00ad\u00ae"+
		"\7n\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7v\2\2\u00b0\20\3\2\2\2\u00b1\u00b2"+
		"\7x\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7f\2\2\u00b5"+
		"\22\3\2\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7w\2\2\u00b9"+
		"\u00ba\7g\2\2\u00ba\24\3\2\2\2\u00bb\u00bc\7h\2\2\u00bc\u00bd\7c\2\2\u00bd"+
		"\u00be\7n\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7g\2\2\u00c0\26\3\2\2\2\u00c1"+
		"\u00c2\7r\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7p\2\2"+
		"\u00c5\u00c6\7v\2\2\u00c6\30\3\2\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7"+
		"h\2\2\u00c9\32\3\2\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd"+
		"\7u\2\2\u00cd\u00ce\7g\2\2\u00ce\34\3\2\2\2\u00cf\u00d0\7y\2\2\u00d0\u00d1"+
		"\7j\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7g\2\2\u00d4"+
		"\36\3\2\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7t\2\2\u00d8"+
		" \3\2\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7p\2\2\u00db\"\3\2\2\2\u00dc"+
		"\u00dd\7u\2\2\u00dd\u00de\7y\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7v\2\2"+
		"\u00e0\u00e1\7e\2\2\u00e1\u00e2\7j\2\2\u00e2$\3\2\2\2\u00e3\u00e4\7e\2"+
		"\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7g\2\2\u00e7&\3\2"+
		"\2\2\u00e8\u00e9\7f\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7h\2\2\u00eb\u00ec"+
		"\7c\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7v\2\2\u00ef"+
		"(\3\2\2\2\u00f0\u00f1\7d\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7g\2\2\u00f3"+
		"\u00f4\7c\2\2\u00f4\u00f5\7m\2\2\u00f5*\3\2\2\2\u00f6\u00f7\7t\2\2\u00f7"+
		"\u00f8\7g\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7w\2\2\u00fa\u00fb\7t\2\2"+
		"\u00fb\u00fc\7p\2\2\u00fc,\3\2\2\2\u00fd\u00fe\7e\2\2\u00fe\u00ff\7q\2"+
		"\2\u00ff\u0100\7p\2\2\u0100\u0101\7v\2\2\u0101\u0102\7k\2\2\u0102\u0103"+
		"\7p\2\2\u0103\u0104\7w\2\2\u0104\u0105\7g\2\2\u0105.\3\2\2\2\u0106\u0107"+
		"\7i\2\2\u0107\u0108\7w\2\2\u0108\u0109\7c\2\2\u0109\u010a\7t\2\2\u010a"+
		"\u010b\7f\2\2\u010b\60\3\2\2\2\u010c\u010d\7h\2\2\u010d\u010e\7w\2\2\u010e"+
		"\u010f\7p\2\2\u010f\u0110\7e\2\2\u0110\62\3\2\2\2\u0111\u0112\7p\2\2\u0112"+
		"\u0113\7k\2\2\u0113\u0114\7n\2\2\u0114\64\3\2\2\2\u0115\u0116\7u\2\2\u0116"+
		"\u0117\7v\2\2\u0117\u0118\7t\2\2\u0118\u0119\7w\2\2\u0119\u011a\7e\2\2"+
		"\u011a\u011b\7v\2\2\u011b\66\3\2\2\2\u011c\u011d\7o\2\2\u011d\u011e\7"+
		"w\2\2\u011e\u011f\7v\2\2\u011f\u0120\7c\2\2\u0120\u0121\7v\2\2\u0121\u0122"+
		"\7k\2\2\u0122\u0123\7p\2\2\u0123\u0124\7i\2\2\u01248\3\2\2\2\u0125\u0126"+
		"\7u\2\2\u0126\u0127\7g\2\2\u0127\u0128\7n\2\2\u0128\u0129\7h\2\2\u0129"+
		":\3\2\2\2\u012a\u012b\7k\2\2\u012b\u012c\7p\2\2\u012c\u012d\7q\2\2\u012d"+
		"\u012e\7w\2\2\u012e\u012f\7v\2\2\u012f<\3\2\2\2\u0130\u0131\7c\2\2\u0131"+
		"\u0132\7r\2\2\u0132\u0133\7r\2\2\u0133\u0134\7g\2\2\u0134\u0135\7p\2\2"+
		"\u0135\u0136\7f\2\2\u0136>\3\2\2\2\u0137\u0138\7t\2\2\u0138\u0139\7g\2"+
		"\2\u0139\u013a\7o\2\2\u013a\u013b\7q\2\2\u013b\u013c\7x\2\2\u013c\u013d"+
		"\7g\2\2\u013d\u013e\7N\2\2\u013e\u013f\7c\2\2\u013f\u0140\7u\2\2\u0140"+
		"\u0141\7v\2\2\u0141@\3\2\2\2\u0142\u0143\7t\2\2\u0143\u0144\7g\2\2\u0144"+
		"\u0145\7o\2\2\u0145\u0146\7q\2\2\u0146\u0147\7x\2\2\u0147\u0148\7g\2\2"+
		"\u0148B\3\2\2\2\u0149\u014a\7c\2\2\u014a\u014b\7v\2\2\u014bD\3\2\2\2\u014c"+
		"\u014d\7k\2\2\u014d\u014e\7u\2\2\u014e\u014f\7G\2\2\u014f\u0150\7o\2\2"+
		"\u0150\u0151\7r\2\2\u0151\u0152\7v\2\2\u0152\u0153\7{\2\2\u0153F\3\2\2"+
		"\2\u0154\u0155\7e\2\2\u0155\u0156\7q\2\2\u0156\u0157\7w\2\2\u0157\u0158"+
		"\7p\2\2\u0158\u0159\7v\2\2\u0159H\3\2\2\2\u015a\u015c\t\2\2\2\u015b\u015a"+
		"\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u0165\3\2\2\2\u015f\u0161\7\60\2\2\u0160\u0162\t\2\2\2\u0161\u0160\3"+
		"\2\2\2\u0162\u0163\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0166\3\2\2\2\u0165\u015f\3\2\2\2\u0165\u0166\3\2\2\2\u0166J\3\2\2\2"+
		"\u0167\u016b\7$\2\2\u0168\u016a\n\3\2\2\u0169\u0168\3\2\2\2\u016a\u016d"+
		"\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016e\u016f\7$\2\2\u016fL\3\2\2\2\u0170\u0174\t\4\2\2\u0171"+
		"\u0173\t\5\2\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2"+
		"\2\2\u0174\u0175\3\2\2\2\u0175N\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178"+
		"\7#\2\2\u0178\u0179\7?\2\2\u0179P\3\2\2\2\u017a\u017b\7?\2\2\u017b\u017c"+
		"\7?\2\2\u017cR\3\2\2\2\u017d\u017e\7#\2\2\u017eT\3\2\2\2\u017f\u0180\7"+
		"~\2\2\u0180\u0181\7~\2\2\u0181V\3\2\2\2\u0182\u0183\7(\2\2\u0183\u0184"+
		"\7(\2\2\u0184X\3\2\2\2\u0185\u0186\7?\2\2\u0186Z\3\2\2\2\u0187\u0188\7"+
		"@\2\2\u0188\u0189\7?\2\2\u0189\\\3\2\2\2\u018a\u018b\7>\2\2\u018b\u018c"+
		"\7?\2\2\u018c^\3\2\2\2\u018d\u018e\7-\2\2\u018e\u018f\7?\2\2\u018f`\3"+
		"\2\2\2\u0190\u0191\7/\2\2\u0191\u0192\7?\2\2\u0192b\3\2\2\2\u0193\u0194"+
		"\7@\2\2\u0194d\3\2\2\2\u0195\u0196\7>\2\2\u0196f\3\2\2\2\u0197\u0198\7"+
		",\2\2\u0198h\3\2\2\2\u0199\u019a\7\61\2\2\u019aj\3\2\2\2\u019b\u019c\7"+
		"-\2\2\u019cl\3\2\2\2\u019d\u019e\7/\2\2\u019en\3\2\2\2\u019f\u01a0\7\'"+
		"\2\2\u01a0p\3\2\2\2\u01a1\u01a2\7*\2\2\u01a2r\3\2\2\2\u01a3\u01a4\7+\2"+
		"\2\u01a4t\3\2\2\2\u01a5\u01a6\7}\2\2\u01a6v\3\2\2\2\u01a7\u01a8\7\177"+
		"\2\2\u01a8x\3\2\2\2\u01a9\u01aa\7<\2\2\u01aaz\3\2\2\2\u01ab\u01ac\7]\2"+
		"\2\u01ac|\3\2\2\2\u01ad\u01ae\7_\2\2\u01ae~\3\2\2\2\u01af\u01b0\7.\2\2"+
		"\u01b0\u0080\3\2\2\2\u01b1\u01b3\t\6\2\2\u01b2\u01b1\3\2\2\2\u01b3\u01b4"+
		"\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b7\bA\2\2\u01b7\u0082\3\2\2\2\u01b8\u01b9\7\61\2\2\u01b9\u01ba\7,"+
		"\2\2\u01ba\u01be\3\2\2\2\u01bb\u01bd\13\2\2\2\u01bc\u01bb\3\2\2\2\u01bd"+
		"\u01c0\3\2\2\2\u01be\u01bf\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c1\3\2"+
		"\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c2\7,\2\2\u01c2\u01c3\7\61\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c5\bB\2\2\u01c5\u0084\3\2\2\2\u01c6\u01c7\7\61"+
		"\2\2\u01c7\u01c8\7\61\2\2\u01c8\u01cc\3\2\2\2\u01c9\u01cb\n\7\2\2\u01ca"+
		"\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2"+
		"\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d0\bC\2\2\u01d0"+
		"\u0086\3\2\2\2\u01d1\u01d2\7^\2\2\u01d2\u01d3\t\b\2\2\u01d3\u0088\3\2"+
		"\2\2\13\2\u015d\u0163\u0165\u016b\u0174\u01b4\u01be\u01cc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}