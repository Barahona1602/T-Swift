// Generated from c:\Users\pbara\OneDrive\Escritorio\T-Swift\server\SwiftLexer.g4 by ANTLR 4.9.2
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
		NOT=41, OR=42, AND=43, IG=44, MAY_IG=45, MEN_IG=46, MAYOR=47, MENOR=48, 
		MUL=49, DIV=50, ADD=51, SUB=52, MOD=53, PARIZQ=54, PARDER=55, LLAVEIZQ=56, 
		LLAVEDER=57, WHITESPACE=58, COMMENT=59, LINE_COMMENT=60;
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
			"MEN_IG", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "PARIZQ", 
			"PARDER", "LLAVEIZQ", "LLAVEDER", "WHITESPACE", "COMMENT", "LINE_COMMENT", 
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
			"'&&'", "'='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", 
			"'%'", "'('", "')'", "'{'", "'}'"
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
			"OR", "AND", "IG", "MAY_IG", "MEN_IG", "MAYOR", "MENOR", "MUL", "DIV", 
			"ADD", "SUB", "MOD", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "WHITESPACE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u01ba\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$"+
		"\3$\3$\3$\3$\3$\3%\6%\u0150\n%\r%\16%\u0151\3%\3%\6%\u0156\n%\r%\16%\u0157"+
		"\5%\u015a\n%\3&\3&\7&\u015e\n&\f&\16&\u0161\13&\3&\3&\3\'\3\'\7\'\u0167"+
		"\n\'\f\'\16\'\u016a\13\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-"+
		"\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\6;\u0199\n;\r;\16"+
		";\u019a\3;\3;\3<\3<\3<\3<\7<\u01a3\n<\f<\16<\u01a6\13<\3<\3<\3<\3<\3<"+
		"\3=\3=\3=\3=\7=\u01b1\n=\f=\16=\u01b4\13=\3=\3=\3>\3>\3>\3\u01a4\2?\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9"+
		"q:s;u<w=y>{\2\3\2\t\3\2\62;\3\2$$\4\2C\\c|\6\2\62;C\\aac|\6\2\13\f\17"+
		"\17\"\"^^\4\2\f\f\17\17\6\2\13\f\17\17$$^^\2\u01c0\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3}\3\2\2\2\5\u0081\3\2"+
		"\2\2\7\u0087\3\2\2\2\t\u008c\3\2\2\2\13\u0093\3\2\2\2\r\u009d\3\2\2\2"+
		"\17\u00a1\3\2\2\2\21\u00a5\3\2\2\2\23\u00aa\3\2\2\2\25\u00af\3\2\2\2\27"+
		"\u00b5\3\2\2\2\31\u00bb\3\2\2\2\33\u00be\3\2\2\2\35\u00c3\3\2\2\2\37\u00c9"+
		"\3\2\2\2!\u00cd\3\2\2\2#\u00d0\3\2\2\2%\u00d7\3\2\2\2\'\u00dc\3\2\2\2"+
		")\u00e4\3\2\2\2+\u00ea\3\2\2\2-\u00f1\3\2\2\2/\u00fa\3\2\2\2\61\u0100"+
		"\3\2\2\2\63\u0105\3\2\2\2\65\u0109\3\2\2\2\67\u0110\3\2\2\29\u0119\3\2"+
		"\2\2;\u011e\3\2\2\2=\u0124\3\2\2\2?\u012b\3\2\2\2A\u0136\3\2\2\2C\u013d"+
		"\3\2\2\2E\u0140\3\2\2\2G\u0148\3\2\2\2I\u014f\3\2\2\2K\u015b\3\2\2\2M"+
		"\u0164\3\2\2\2O\u016b\3\2\2\2Q\u016e\3\2\2\2S\u0171\3\2\2\2U\u0173\3\2"+
		"\2\2W\u0176\3\2\2\2Y\u0179\3\2\2\2[\u017b\3\2\2\2]\u017e\3\2\2\2_\u0181"+
		"\3\2\2\2a\u0183\3\2\2\2c\u0185\3\2\2\2e\u0187\3\2\2\2g\u0189\3\2\2\2i"+
		"\u018b\3\2\2\2k\u018d\3\2\2\2m\u018f\3\2\2\2o\u0191\3\2\2\2q\u0193\3\2"+
		"\2\2s\u0195\3\2\2\2u\u0198\3\2\2\2w\u019e\3\2\2\2y\u01ac\3\2\2\2{\u01b7"+
		"\3\2\2\2}~\7K\2\2~\177\7p\2\2\177\u0080\7v\2\2\u0080\4\3\2\2\2\u0081\u0082"+
		"\7H\2\2\u0082\u0083\7n\2\2\u0083\u0084\7q\2\2\u0084\u0085\7c\2\2\u0085"+
		"\u0086\7v\2\2\u0086\6\3\2\2\2\u0087\u0088\7D\2\2\u0088\u0089\7q\2\2\u0089"+
		"\u008a\7q\2\2\u008a\u008b\7n\2\2\u008b\b\3\2\2\2\u008c\u008d\7U\2\2\u008d"+
		"\u008e\7v\2\2\u008e\u008f\7t\2\2\u008f\u0090\7k\2\2\u0090\u0091\7p\2\2"+
		"\u0091\u0092\7i\2\2\u0092\n\3\2\2\2\u0093\u0094\7E\2\2\u0094\u0095\7j"+
		"\2\2\u0095\u0096\7c\2\2\u0096\u0097\7t\2\2\u0097\u0098\7c\2\2\u0098\u0099"+
		"\7e\2\2\u0099\u009a\7v\2\2\u009a\u009b\7g\2\2\u009b\u009c\7t\2\2\u009c"+
		"\f\3\2\2\2\u009d\u009e\7x\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7t\2\2\u00a0"+
		"\16\3\2\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7v\2\2\u00a4"+
		"\20\3\2\2\2\u00a5\u00a6\7x\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7k\2\2\u00a8"+
		"\u00a9\7f\2\2\u00a9\22\3\2\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7t\2\2\u00ac"+
		"\u00ad\7w\2\2\u00ad\u00ae\7g\2\2\u00ae\24\3\2\2\2\u00af\u00b0\7h\2\2\u00b0"+
		"\u00b1\7c\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b4\7g\2\2"+
		"\u00b4\26\3\2\2\2\u00b5\u00b6\7r\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7"+
		"k\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7v\2\2\u00ba\30\3\2\2\2\u00bb\u00bc"+
		"\7k\2\2\u00bc\u00bd\7h\2\2\u00bd\32\3\2\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0"+
		"\7n\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7g\2\2\u00c2\34\3\2\2\2\u00c3\u00c4"+
		"\7y\2\2\u00c4\u00c5\7j\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7n\2\2\u00c7"+
		"\u00c8\7g\2\2\u00c8\36\3\2\2\2\u00c9\u00ca\7h\2\2\u00ca\u00cb\7q\2\2\u00cb"+
		"\u00cc\7t\2\2\u00cc \3\2\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7p\2\2\u00cf"+
		"\"\3\2\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2\7y\2\2\u00d2\u00d3\7k\2\2\u00d3"+
		"\u00d4\7v\2\2\u00d4\u00d5\7e\2\2\u00d5\u00d6\7j\2\2\u00d6$\3\2\2\2\u00d7"+
		"\u00d8\7e\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7g\2\2"+
		"\u00db&\3\2\2\2\u00dc\u00dd\7f\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7h\2"+
		"\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7w\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3"+
		"\7v\2\2\u00e3(\3\2\2\2\u00e4\u00e5\7d\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7"+
		"\7g\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7m\2\2\u00e9*\3\2\2\2\u00ea\u00eb"+
		"\7t\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7w\2\2\u00ee"+
		"\u00ef\7t\2\2\u00ef\u00f0\7p\2\2\u00f0,\3\2\2\2\u00f1\u00f2\7e\2\2\u00f2"+
		"\u00f3\7q\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7k\2\2"+
		"\u00f6\u00f7\7p\2\2\u00f7\u00f8\7w\2\2\u00f8\u00f9\7g\2\2\u00f9.\3\2\2"+
		"\2\u00fa\u00fb\7i\2\2\u00fb\u00fc\7w\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe"+
		"\7t\2\2\u00fe\u00ff\7f\2\2\u00ff\60\3\2\2\2\u0100\u0101\7h\2\2\u0101\u0102"+
		"\7w\2\2\u0102\u0103\7p\2\2\u0103\u0104\7e\2\2\u0104\62\3\2\2\2\u0105\u0106"+
		"\7p\2\2\u0106\u0107\7k\2\2\u0107\u0108\7n\2\2\u0108\64\3\2\2\2\u0109\u010a"+
		"\7u\2\2\u010a\u010b\7v\2\2\u010b\u010c\7t\2\2\u010c\u010d\7w\2\2\u010d"+
		"\u010e\7e\2\2\u010e\u010f\7v\2\2\u010f\66\3\2\2\2\u0110\u0111\7o\2\2\u0111"+
		"\u0112\7w\2\2\u0112\u0113\7v\2\2\u0113\u0114\7c\2\2\u0114\u0115\7v\2\2"+
		"\u0115\u0116\7k\2\2\u0116\u0117\7p\2\2\u0117\u0118\7i\2\2\u01188\3\2\2"+
		"\2\u0119\u011a\7u\2\2\u011a\u011b\7g\2\2\u011b\u011c\7n\2\2\u011c\u011d"+
		"\7h\2\2\u011d:\3\2\2\2\u011e\u011f\7k\2\2\u011f\u0120\7p\2\2\u0120\u0121"+
		"\7q\2\2\u0121\u0122\7w\2\2\u0122\u0123\7v\2\2\u0123<\3\2\2\2\u0124\u0125"+
		"\7c\2\2\u0125\u0126\7r\2\2\u0126\u0127\7r\2\2\u0127\u0128\7g\2\2\u0128"+
		"\u0129\7p\2\2\u0129\u012a\7f\2\2\u012a>\3\2\2\2\u012b\u012c\7t\2\2\u012c"+
		"\u012d\7g\2\2\u012d\u012e\7o\2\2\u012e\u012f\7q\2\2\u012f\u0130\7x\2\2"+
		"\u0130\u0131\7g\2\2\u0131\u0132\7N\2\2\u0132\u0133\7c\2\2\u0133\u0134"+
		"\7u\2\2\u0134\u0135\7v\2\2\u0135@\3\2\2\2\u0136\u0137\7t\2\2\u0137\u0138"+
		"\7g\2\2\u0138\u0139\7o\2\2\u0139\u013a\7q\2\2\u013a\u013b\7x\2\2\u013b"+
		"\u013c\7g\2\2\u013cB\3\2\2\2\u013d\u013e\7c\2\2\u013e\u013f\7v\2\2\u013f"+
		"D\3\2\2\2\u0140\u0141\7k\2\2\u0141\u0142\7u\2\2\u0142\u0143\7G\2\2\u0143"+
		"\u0144\7o\2\2\u0144\u0145\7r\2\2\u0145\u0146\7v\2\2\u0146\u0147\7{\2\2"+
		"\u0147F\3\2\2\2\u0148\u0149\7e\2\2\u0149\u014a\7q\2\2\u014a\u014b\7w\2"+
		"\2\u014b\u014c\7p\2\2\u014c\u014d\7v\2\2\u014dH\3\2\2\2\u014e\u0150\t"+
		"\2\2\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0159\3\2\2\2\u0153\u0155\7\60\2\2\u0154\u0156\t"+
		"\2\2\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0153\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015aJ\3\2\2\2\u015b\u015f\7$\2\2\u015c\u015e\n\3\2\2\u015d\u015c"+
		"\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\7$\2\2\u0163L\3\2\2\2\u0164"+
		"\u0168\t\4\2\2\u0165\u0167\t\5\2\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2"+
		"\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169N\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016b\u016c\7#\2\2\u016c\u016d\7?\2\2\u016dP\3\2\2\2\u016e\u016f"+
		"\7?\2\2\u016f\u0170\7?\2\2\u0170R\3\2\2\2\u0171\u0172\7#\2\2\u0172T\3"+
		"\2\2\2\u0173\u0174\7~\2\2\u0174\u0175\7~\2\2\u0175V\3\2\2\2\u0176\u0177"+
		"\7(\2\2\u0177\u0178\7(\2\2\u0178X\3\2\2\2\u0179\u017a\7?\2\2\u017aZ\3"+
		"\2\2\2\u017b\u017c\7@\2\2\u017c\u017d\7?\2\2\u017d\\\3\2\2\2\u017e\u017f"+
		"\7>\2\2\u017f\u0180\7?\2\2\u0180^\3\2\2\2\u0181\u0182\7@\2\2\u0182`\3"+
		"\2\2\2\u0183\u0184\7>\2\2\u0184b\3\2\2\2\u0185\u0186\7,\2\2\u0186d\3\2"+
		"\2\2\u0187\u0188\7\61\2\2\u0188f\3\2\2\2\u0189\u018a\7-\2\2\u018ah\3\2"+
		"\2\2\u018b\u018c\7/\2\2\u018cj\3\2\2\2\u018d\u018e\7\'\2\2\u018el\3\2"+
		"\2\2\u018f\u0190\7*\2\2\u0190n\3\2\2\2\u0191\u0192\7+\2\2\u0192p\3\2\2"+
		"\2\u0193\u0194\7}\2\2\u0194r\3\2\2\2\u0195\u0196\7\177\2\2\u0196t\3\2"+
		"\2\2\u0197\u0199\t\6\2\2\u0198\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\b;"+
		"\2\2\u019dv\3\2\2\2\u019e\u019f\7\61\2\2\u019f\u01a0\7,\2\2\u01a0\u01a4"+
		"\3\2\2\2\u01a1\u01a3\13\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2"+
		"\u01a4\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a4"+
		"\3\2\2\2\u01a7\u01a8\7,\2\2\u01a8\u01a9\7\61\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\u01ab\b<\2\2\u01abx\3\2\2\2\u01ac\u01ad\7\61\2\2\u01ad\u01ae\7\61\2\2"+
		"\u01ae\u01b2\3\2\2\2\u01af\u01b1\n\7\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b4"+
		"\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b5\u01b6\b=\2\2\u01b6z\3\2\2\2\u01b7\u01b8\7^\2\2\u01b8"+
		"\u01b9\t\b\2\2\u01b9|\3\2\2\2\13\2\u0151\u0157\u0159\u015f\u0168\u019a"+
		"\u01a4\u01b2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}