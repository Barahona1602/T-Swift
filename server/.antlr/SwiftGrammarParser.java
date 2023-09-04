// Generated from c:\Users\pbara\OneDrive\Escritorio\T-Swift\server\SwiftGrammar.g4 by ANTLR 4.9.2

    import "Server2/interfaces"
    import "Server2/environment"
    import "Server2/expressions"
    import "Server2/instructions"
    import "strings"

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SwiftGrammarParser extends Parser {
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
		PUNTO=64, COMILLA=65, FLECHA=66, WHITESPACE=67, COMMENT=68, LINE_COMMENT=69;
	public static final int
		RULE_s = 0, RULE_block = 1, RULE_instruction = 2, RULE_printstmt = 3, 
		RULE_ifstmt = 4, RULE_whilestmt = 5, RULE_declarationstmt = 6, RULE_assignstmt = 7, 
		RULE_forstmt = 8, RULE_guardstmt = 9, RULE_breakstmt = 10, RULE_continuestmt = 11, 
		RULE_returnstmt = 12, RULE_fnArray = 13, RULE_types = 14, RULE_expr = 15, 
		RULE_listParams = 16, RULE_listAccessArray = 17, RULE_listArray = 18, 
		RULE_exprComa = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "block", "instruction", "printstmt", "ifstmt", "whilestmt", "declarationstmt", 
			"assignstmt", "forstmt", "guardstmt", "breakstmt", "continuestmt", "returnstmt", 
			"fnArray", "types", "expr", "listParams", "listAccessArray", "listArray", 
			"exprComa"
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
			"','", "'.'", "'\"'", "'->'"
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
			"D_PTS", "CORIZQ", "CORDER", "COMA", "PUNTO", "COMILLA", "FLECHA", "WHITESPACE", 
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

	@Override
	public String getGrammarFileName() { return "SwiftGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SwiftGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public []interface{} code;
		public BlockContext block;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SwiftGrammarParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			((SContext)_localctx).block = block();
			setState(41);
			match(EOF);
			   
			        _localctx.code = ((SContext)_localctx).block.blk
			    
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

	public static class BlockContext extends ParserRuleContext {
		public []interface{} blk;
		public InstructionContext instruction;
		public List<InstructionContext> ins = new ArrayList<InstructionContext>();
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);

		    _localctx.blk = []interface{}{}
		    var listInt []IInstructionContext
		  
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				((BlockContext)_localctx).instruction = instruction();
				((BlockContext)_localctx).ins.add(((BlockContext)_localctx).instruction);
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << LET) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << RETURN) | (1L << CONTINUE) | (1L << GUARD) | (1L << ID))) != 0) );

			        listInt = localctx.(*BlockContext).GetIns()
			        for _, e := range listInt {
			            _localctx.blk = append(_localctx.blk, e.GetInst())
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

	public static class InstructionContext extends ParserRuleContext {
		public interfaces.Instruction inst;
		public PrintstmtContext printstmt;
		public IfstmtContext ifstmt;
		public DeclarationstmtContext declarationstmt;
		public WhilestmtContext whilestmt;
		public AssignstmtContext assignstmt;
		public ForstmtContext forstmt;
		public GuardstmtContext guardstmt;
		public BreakstmtContext breakstmt;
		public ContinuestmtContext continuestmt;
		public FnArrayContext fnArray;
		public ReturnstmtContext returnstmt;
		public PrintstmtContext printstmt() {
			return getRuleContext(PrintstmtContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public DeclarationstmtContext declarationstmt() {
			return getRuleContext(DeclarationstmtContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public AssignstmtContext assignstmt() {
			return getRuleContext(AssignstmtContext.class,0);
		}
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
		}
		public GuardstmtContext guardstmt() {
			return getRuleContext(GuardstmtContext.class,0);
		}
		public BreakstmtContext breakstmt() {
			return getRuleContext(BreakstmtContext.class,0);
		}
		public ContinuestmtContext continuestmt() {
			return getRuleContext(ContinuestmtContext.class,0);
		}
		public FnArrayContext fnArray() {
			return getRuleContext(FnArrayContext.class,0);
		}
		public ReturnstmtContext returnstmt() {
			return getRuleContext(ReturnstmtContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				((InstructionContext)_localctx).printstmt = printstmt();
				 _localctx.inst = ((InstructionContext)_localctx).printstmt.prnt
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				((InstructionContext)_localctx).ifstmt = ifstmt();
				 _localctx.inst = ((InstructionContext)_localctx).ifstmt.ifinst 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				((InstructionContext)_localctx).declarationstmt = declarationstmt();
				 _localctx.inst = ((InstructionContext)_localctx).declarationstmt.dec 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				((InstructionContext)_localctx).whilestmt = whilestmt();
				 _localctx.inst = ((InstructionContext)_localctx).whilestmt.whl 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				((InstructionContext)_localctx).assignstmt = assignstmt();
				 _localctx.inst = ((InstructionContext)_localctx).assignstmt.asg 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				((InstructionContext)_localctx).forstmt = forstmt();
				 _localctx.inst = ((InstructionContext)_localctx).forstmt.fr 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				((InstructionContext)_localctx).guardstmt = guardstmt();
				 _localctx.inst = ((InstructionContext)_localctx).guardstmt.grd 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(72);
				((InstructionContext)_localctx).breakstmt = breakstmt();
				 _localctx.inst = ((InstructionContext)_localctx).breakstmt.brk 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(75);
				((InstructionContext)_localctx).continuestmt = continuestmt();
				 _localctx.inst = ((InstructionContext)_localctx).continuestmt.cnt 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(78);
				((InstructionContext)_localctx).fnArray = fnArray();
				 _localctx.inst = ((InstructionContext)_localctx).fnArray.p 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(81);
				((InstructionContext)_localctx).returnstmt = returnstmt();
				 _localctx.inst = ((InstructionContext)_localctx).returnstmt.ret 
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

	public static class PrintstmtContext extends ParserRuleContext {
		public interfaces.Instruction prnt;
		public Token PRINT;
		public ExprContext expr;
		public ExprComaContext exprComa;
		public TerminalNode PRINT() { return getToken(SwiftGrammarParser.PRINT, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public ExprComaContext exprComa() {
			return getRuleContext(ExprComaContext.class,0);
		}
		public PrintstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstmt; }
	}

	public final PrintstmtContext printstmt() throws RecognitionException {
		PrintstmtContext _localctx = new PrintstmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_printstmt);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				((PrintstmtContext)_localctx).PRINT = match(PRINT);
				setState(87);
				match(PARIZQ);
				setState(88);
				((PrintstmtContext)_localctx).expr = expr(0);
				setState(89);
				match(PARDER);
				 _localctx.prnt = instructions.NewPrint((((PrintstmtContext)_localctx).PRINT!=null?((PrintstmtContext)_localctx).PRINT.getLine():0),(((PrintstmtContext)_localctx).PRINT!=null?((PrintstmtContext)_localctx).PRINT.getCharPositionInLine():0),((PrintstmtContext)_localctx).expr.e)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				((PrintstmtContext)_localctx).PRINT = match(PRINT);
				setState(93);
				match(PARIZQ);
				setState(94);
				((PrintstmtContext)_localctx).exprComa = exprComa(0);
				setState(95);
				match(PARDER);
				 _localctx.prnt = instructions.NewPrint((((PrintstmtContext)_localctx).PRINT!=null?((PrintstmtContext)_localctx).PRINT.getLine():0),(((PrintstmtContext)_localctx).PRINT!=null?((PrintstmtContext)_localctx).PRINT.getCharPositionInLine():0),((PrintstmtContext)_localctx).exprComa.t)
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

	public static class IfstmtContext extends ParserRuleContext {
		public interfaces.Instruction ifinst;
		public Token IF;
		public ExprContext expr;
		public BlockContext block;
		public BlockContext e1;
		public BlockContext e2;
		public IfstmtContext ifstmt;
		public TerminalNode IF() { return getToken(SwiftGrammarParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> LLAVEIZQ() { return getTokens(SwiftGrammarParser.LLAVEIZQ); }
		public TerminalNode LLAVEIZQ(int i) {
			return getToken(SwiftGrammarParser.LLAVEIZQ, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> LLAVEDER() { return getTokens(SwiftGrammarParser.LLAVEDER); }
		public TerminalNode LLAVEDER(int i) {
			return getToken(SwiftGrammarParser.LLAVEDER, i);
		}
		public TerminalNode ELSE() { return getToken(SwiftGrammarParser.ELSE, 0); }
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifstmt);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(101);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(102);
				match(LLAVEIZQ);
				setState(103);
				((IfstmtContext)_localctx).block = block();
				setState(104);
				match(LLAVEDER);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).block.blk, nil) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(108);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(109);
				match(LLAVEIZQ);
				setState(110);
				((IfstmtContext)_localctx).e1 = block();
				setState(111);
				match(LLAVEDER);
				setState(112);
				match(ELSE);
				setState(113);
				match(LLAVEIZQ);
				setState(114);
				((IfstmtContext)_localctx).e2 = block();
				setState(115);
				match(LLAVEDER);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).e1.blk, ((IfstmtContext)_localctx).e2.blk) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(119);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(120);
				match(LLAVEIZQ);
				setState(121);
				((IfstmtContext)_localctx).block = block();
				setState(122);
				match(LLAVEDER);
				setState(123);
				match(ELSE);
				setState(124);
				((IfstmtContext)_localctx).ifstmt = ifstmt();
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).block.blk, []interface{}{((IfstmtContext)_localctx).ifstmt.ifinst}) 
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

	public static class WhilestmtContext extends ParserRuleContext {
		public interfaces.Instruction whl;
		public Token WHILE;
		public ExprContext expr;
		public BlockContext block;
		public TerminalNode WHILE() { return getToken(SwiftGrammarParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			((WhilestmtContext)_localctx).WHILE = match(WHILE);
			setState(130);
			((WhilestmtContext)_localctx).expr = expr(0);
			setState(131);
			match(LLAVEIZQ);
			setState(132);
			((WhilestmtContext)_localctx).block = block();
			setState(133);
			match(LLAVEDER);
			 _localctx.whl = instructions.NewWhile((((WhilestmtContext)_localctx).WHILE!=null?((WhilestmtContext)_localctx).WHILE.getLine():0), (((WhilestmtContext)_localctx).WHILE!=null?((WhilestmtContext)_localctx).WHILE.getCharPositionInLine():0), ((WhilestmtContext)_localctx).expr.e, ((WhilestmtContext)_localctx).block.blk) 
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

	public static class DeclarationstmtContext extends ParserRuleContext {
		public interfaces.Instruction dec;
		public Token VAR;
		public Token ID;
		public TypesContext types;
		public ExprContext expr;
		public Token LET;
		public TerminalNode VAR() { return getToken(SwiftGrammarParser.VAR, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode D_PTS() { return getToken(SwiftGrammarParser.D_PTS, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LET() { return getToken(SwiftGrammarParser.LET, 0); }
		public DeclarationstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationstmt; }
	}

	public final DeclarationstmtContext declarationstmt() throws RecognitionException {
		DeclarationstmtContext _localctx = new DeclarationstmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declarationstmt);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				((DeclarationstmtContext)_localctx).VAR = match(VAR);
				setState(137);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(138);
				match(D_PTS);
				setState(139);
				((DeclarationstmtContext)_localctx).types = types();
				setState(140);
				match(IG);
				setState(141);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				 _localctx.dec = instructions.NewDeclaration((((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getLine():0), (((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null), ((DeclarationstmtContext)_localctx).types.ty, ((DeclarationstmtContext)_localctx).expr.e, true) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				((DeclarationstmtContext)_localctx).VAR = match(VAR);
				setState(145);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(146);
				match(IG);
				setState(147);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				 _localctx.dec = instructions.NewDeclaration((((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getLine():0), (((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null), environment.UNKNOWN, ((DeclarationstmtContext)_localctx).expr.e, true) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				((DeclarationstmtContext)_localctx).VAR = match(VAR);
				setState(151);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(152);
				match(D_PTS);
				setState(153);
				((DeclarationstmtContext)_localctx).types = types();
				 _localctx.dec = instructions.NewDeclaration((((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getLine():0), (((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null), ((DeclarationstmtContext)_localctx).types.ty, nil, true) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				((DeclarationstmtContext)_localctx).LET = match(LET);
				setState(157);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(158);
				match(D_PTS);
				setState(159);
				((DeclarationstmtContext)_localctx).types = types();
				setState(160);
				match(IG);
				setState(161);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				 _localctx.dec = instructions.NewDeclaration((((DeclarationstmtContext)_localctx).LET!=null?((DeclarationstmtContext)_localctx).LET.getLine():0), (((DeclarationstmtContext)_localctx).LET!=null?((DeclarationstmtContext)_localctx).LET.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null), ((DeclarationstmtContext)_localctx).types.ty, ((DeclarationstmtContext)_localctx).expr.e, false) 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				((DeclarationstmtContext)_localctx).LET = match(LET);
				setState(165);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(166);
				match(D_PTS);
				setState(167);
				((DeclarationstmtContext)_localctx).types = types();
				 _localctx.dec = instructions.NewDeclaration((((DeclarationstmtContext)_localctx).LET!=null?((DeclarationstmtContext)_localctx).LET.getLine():0), (((DeclarationstmtContext)_localctx).LET!=null?((DeclarationstmtContext)_localctx).LET.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null), ((DeclarationstmtContext)_localctx).types.ty, nil, false) 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				((DeclarationstmtContext)_localctx).LET = match(LET);
				setState(171);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(172);
				match(IG);
				setState(173);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				 _localctx.dec = instructions.NewDeclaration((((DeclarationstmtContext)_localctx).LET!=null?((DeclarationstmtContext)_localctx).LET.getLine():0), (((DeclarationstmtContext)_localctx).LET!=null?((DeclarationstmtContext)_localctx).LET.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null), environment.UNKNOWN, ((DeclarationstmtContext)_localctx).expr.e, false) 
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

	public static class AssignstmtContext extends ParserRuleContext {
		public interfaces.Instruction asg;
		public Token ID;
		public Token op;
		public ExprContext expr;
		public ListAccessArrayContext listAccessArray;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public TerminalNode SUB_IG() { return getToken(SwiftGrammarParser.SUB_IG, 0); }
		public TerminalNode SUM_IG() { return getToken(SwiftGrammarParser.SUM_IG, 0); }
		public ListAccessArrayContext listAccessArray() {
			return getRuleContext(ListAccessArrayContext.class,0);
		}
		public AssignstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignstmt; }
	}

	public final AssignstmtContext assignstmt() throws RecognitionException {
		AssignstmtContext _localctx = new AssignstmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignstmt);
		int _la;
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				((AssignstmtContext)_localctx).ID = match(ID);
				setState(179);
				((AssignstmtContext)_localctx).op = match(IG);
				setState(180);
				((AssignstmtContext)_localctx).expr = expr(0);
				 _localctx.asg = instructions.NewAssign((((AssignstmtContext)_localctx).ID!=null?((AssignstmtContext)_localctx).ID.getLine():0), (((AssignstmtContext)_localctx).ID!=null?((AssignstmtContext)_localctx).ID.getCharPositionInLine():0), (((AssignstmtContext)_localctx).ID!=null?((AssignstmtContext)_localctx).ID.getText():null), ((AssignstmtContext)_localctx).expr.e) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				((AssignstmtContext)_localctx).ID = match(ID);
				setState(184);
				((AssignstmtContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SUM_IG || _la==SUB_IG) ) {
					((AssignstmtContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(185);
				((AssignstmtContext)_localctx).expr = expr(0);
				 ((AssignstmtContext)_localctx).asg =  instructions.NewImplicitAssignment((((AssignstmtContext)_localctx).ID!=null?((AssignstmtContext)_localctx).ID.getLine():0), (((AssignstmtContext)_localctx).ID!=null?((AssignstmtContext)_localctx).ID.getCharPositionInLine():0), (((AssignstmtContext)_localctx).ID!=null?((AssignstmtContext)_localctx).ID.getText():null), (((AssignstmtContext)_localctx).op!=null?((AssignstmtContext)_localctx).op.getText():null), ((AssignstmtContext)_localctx).expr.e); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				((AssignstmtContext)_localctx).ID = match(ID);
				setState(189);
				((AssignstmtContext)_localctx).listAccessArray = listAccessArray(0);
				setState(190);
				match(IG);
				setState(191);
				((AssignstmtContext)_localctx).expr = expr(0);
				 _localctx.asg = instructions.NewArrayAssign((((AssignstmtContext)_localctx).ID!=null?((AssignstmtContext)_localctx).ID.getLine():0), (((AssignstmtContext)_localctx).ID!=null?((AssignstmtContext)_localctx).ID.getCharPositionInLine():0), (((AssignstmtContext)_localctx).ID!=null?((AssignstmtContext)_localctx).ID.getText():null), ((AssignstmtContext)_localctx).listAccessArray.l, ((AssignstmtContext)_localctx).expr.e) 
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

	public static class ForstmtContext extends ParserRuleContext {
		public interfaces.Instruction fr;
		public Token FOR;
		public Token ID;
		public ExprContext exp1;
		public ExprContext exp2;
		public BlockContext block;
		public ExprContext expr;
		public TerminalNode FOR() { return getToken(SwiftGrammarParser.FOR, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode IN() { return getToken(SwiftGrammarParser.IN, 0); }
		public List<TerminalNode> PUNTO() { return getTokens(SwiftGrammarParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(SwiftGrammarParser.PUNTO, i);
		}
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt; }
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forstmt);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				((ForstmtContext)_localctx).FOR = match(FOR);
				setState(197);
				((ForstmtContext)_localctx).ID = match(ID);
				setState(198);
				match(IN);
				setState(199);
				((ForstmtContext)_localctx).exp1 = expr(0);
				setState(200);
				match(PUNTO);
				setState(201);
				match(PUNTO);
				setState(202);
				match(PUNTO);
				setState(203);
				((ForstmtContext)_localctx).exp2 = expr(0);
				setState(204);
				match(LLAVEIZQ);
				setState(205);
				((ForstmtContext)_localctx).block = block();
				setState(206);
				match(LLAVEDER);
				 ((ForstmtContext)_localctx).fr =  instructions.NewForIn((((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getLine():0), (((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getCharPositionInLine():0), (((ForstmtContext)_localctx).ID!=null?((ForstmtContext)_localctx).ID.getText():null), ((ForstmtContext)_localctx).exp1.e, ((ForstmtContext)_localctx).exp2.e, ((ForstmtContext)_localctx).block.blk); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				((ForstmtContext)_localctx).FOR = match(FOR);
				setState(210);
				((ForstmtContext)_localctx).ID = match(ID);
				setState(211);
				match(IN);
				setState(212);
				((ForstmtContext)_localctx).expr = expr(0);
				setState(213);
				match(LLAVEIZQ);
				setState(214);
				((ForstmtContext)_localctx).block = block();
				setState(215);
				match(LLAVEDER);
				 ((ForstmtContext)_localctx).fr =  instructions.NewFor((((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getLine():0), (((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getCharPositionInLine():0), (((ForstmtContext)_localctx).ID!=null?((ForstmtContext)_localctx).ID.getText():null), ((ForstmtContext)_localctx).expr.e, ((ForstmtContext)_localctx).block.blk); 
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

	public static class GuardstmtContext extends ParserRuleContext {
		public interfaces.Instruction grd;
		public Token GUARD;
		public ExprContext expr;
		public BlockContext block;
		public TerminalNode GUARD() { return getToken(SwiftGrammarParser.GUARD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(SwiftGrammarParser.ELSE, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(SwiftGrammarParser.LLAVEIZQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(SwiftGrammarParser.LLAVEDER, 0); }
		public GuardstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardstmt; }
	}

	public final GuardstmtContext guardstmt() throws RecognitionException {
		GuardstmtContext _localctx = new GuardstmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_guardstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			((GuardstmtContext)_localctx).GUARD = match(GUARD);
			setState(221);
			((GuardstmtContext)_localctx).expr = expr(0);
			setState(222);
			match(ELSE);
			setState(223);
			match(LLAVEIZQ);
			setState(224);
			((GuardstmtContext)_localctx).block = block();
			setState(225);
			match(LLAVEDER);
			 _localctx.grd = instructions.NewGuard((((GuardstmtContext)_localctx).GUARD!=null?((GuardstmtContext)_localctx).GUARD.getLine():0), (((GuardstmtContext)_localctx).GUARD!=null?((GuardstmtContext)_localctx).GUARD.getCharPositionInLine():0), ((GuardstmtContext)_localctx).expr.e, ((GuardstmtContext)_localctx).block.blk) 
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

	public static class BreakstmtContext extends ParserRuleContext {
		public interfaces.Instruction brk;
		public Token BREAK;
		public TerminalNode BREAK() { return getToken(SwiftGrammarParser.BREAK, 0); }
		public BreakstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakstmt; }
	}

	public final BreakstmtContext breakstmt() throws RecognitionException {
		BreakstmtContext _localctx = new BreakstmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_breakstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			((BreakstmtContext)_localctx).BREAK = match(BREAK);
			 _localctx.brk = instructions.NewBreak((((BreakstmtContext)_localctx).BREAK!=null?((BreakstmtContext)_localctx).BREAK.getLine():0), (((BreakstmtContext)_localctx).BREAK!=null?((BreakstmtContext)_localctx).BREAK.getCharPositionInLine():0)) 
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

	public static class ContinuestmtContext extends ParserRuleContext {
		public interfaces.Instruction cnt;
		public Token CONTINUE;
		public TerminalNode CONTINUE() { return getToken(SwiftGrammarParser.CONTINUE, 0); }
		public ContinuestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continuestmt; }
	}

	public final ContinuestmtContext continuestmt() throws RecognitionException {
		ContinuestmtContext _localctx = new ContinuestmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_continuestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			((ContinuestmtContext)_localctx).CONTINUE = match(CONTINUE);
			 _localctx.cnt = instructions.NewContinue((((ContinuestmtContext)_localctx).CONTINUE!=null?((ContinuestmtContext)_localctx).CONTINUE.getLine():0), (((ContinuestmtContext)_localctx).CONTINUE!=null?((ContinuestmtContext)_localctx).CONTINUE.getCharPositionInLine():0)) 
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

	public static class ReturnstmtContext extends ParserRuleContext {
		public interfaces.Instruction ret;
		public Token RETURN;
		public ExprContext expr;
		public TerminalNode RETURN() { return getToken(SwiftGrammarParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstmt; }
	}

	public final ReturnstmtContext returnstmt() throws RecognitionException {
		ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnstmt);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				((ReturnstmtContext)_localctx).RETURN = match(RETURN);
				setState(235);
				((ReturnstmtContext)_localctx).expr = expr(0);
				 _localctx.ret = instructions.NewReturn((((ReturnstmtContext)_localctx).RETURN!=null?((ReturnstmtContext)_localctx).RETURN.getLine():0), (((ReturnstmtContext)_localctx).RETURN!=null?((ReturnstmtContext)_localctx).RETURN.getCharPositionInLine():0), ((ReturnstmtContext)_localctx).expr.e) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				((ReturnstmtContext)_localctx).RETURN = match(RETURN);
				 _localctx.ret = instructions.NewReturn((((ReturnstmtContext)_localctx).RETURN!=null?((ReturnstmtContext)_localctx).RETURN.getLine():0), (((ReturnstmtContext)_localctx).RETURN!=null?((ReturnstmtContext)_localctx).RETURN.getCharPositionInLine():0), nil) 
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

	public static class FnArrayContext extends ParserRuleContext {
		public interfaces.Instruction p;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode PUNTO() { return getToken(SwiftGrammarParser.PUNTO, 0); }
		public TerminalNode APPEND() { return getToken(SwiftGrammarParser.APPEND, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public TerminalNode REMOVE() { return getToken(SwiftGrammarParser.REMOVE, 0); }
		public TerminalNode AT() { return getToken(SwiftGrammarParser.AT, 0); }
		public TerminalNode D_PTS() { return getToken(SwiftGrammarParser.D_PTS, 0); }
		public TerminalNode REMOVELAST() { return getToken(SwiftGrammarParser.REMOVELAST, 0); }
		public FnArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnArray; }
	}

	public final FnArrayContext fnArray() throws RecognitionException {
		FnArrayContext _localctx = new FnArrayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fnArray);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				((FnArrayContext)_localctx).ID = match(ID);
				setState(243);
				match(PUNTO);
				setState(244);
				match(APPEND);
				setState(245);
				match(PARIZQ);
				setState(246);
				((FnArrayContext)_localctx).expr = expr(0);
				setState(247);
				match(PARDER);
				 _localctx.p = instructions.NewAppend((((FnArrayContext)_localctx).ID!=null?((FnArrayContext)_localctx).ID.getLine():0), (((FnArrayContext)_localctx).ID!=null?((FnArrayContext)_localctx).ID.getCharPositionInLine():0), (((FnArrayContext)_localctx).ID!=null?((FnArrayContext)_localctx).ID.getText():null), ((FnArrayContext)_localctx).expr.e) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				((FnArrayContext)_localctx).ID = match(ID);
				setState(251);
				match(PUNTO);
				setState(252);
				match(REMOVE);
				setState(253);
				match(PARIZQ);
				setState(254);
				match(AT);
				setState(255);
				match(D_PTS);
				setState(256);
				((FnArrayContext)_localctx).expr = expr(0);
				setState(257);
				match(PARDER);
				 _localctx.p = instructions.NewRemoveAt((((FnArrayContext)_localctx).ID!=null?((FnArrayContext)_localctx).ID.getLine():0), (((FnArrayContext)_localctx).ID!=null?((FnArrayContext)_localctx).ID.getCharPositionInLine():0), (((FnArrayContext)_localctx).ID!=null?((FnArrayContext)_localctx).ID.getText():null), ((FnArrayContext)_localctx).expr.e) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				((FnArrayContext)_localctx).ID = match(ID);
				setState(261);
				match(PUNTO);
				setState(262);
				match(REMOVELAST);
				setState(263);
				match(PARIZQ);
				setState(264);
				match(PARDER);
				 _localctx.p = instructions.NewRemoveLast((((FnArrayContext)_localctx).ID!=null?((FnArrayContext)_localctx).ID.getLine():0), (((FnArrayContext)_localctx).ID!=null?((FnArrayContext)_localctx).ID.getCharPositionInLine():0), (((FnArrayContext)_localctx).ID!=null?((FnArrayContext)_localctx).ID.getText():null)) 
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

	public static class TypesContext extends ParserRuleContext {
		public environment.TipoExpresion ty;
		public TerminalNode INT() { return getToken(SwiftGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SwiftGrammarParser.FLOAT, 0); }
		public TerminalNode STR() { return getToken(SwiftGrammarParser.STR, 0); }
		public TerminalNode BOOL() { return getToken(SwiftGrammarParser.BOOL, 0); }
		public TerminalNode CORIZQ() { return getToken(SwiftGrammarParser.CORIZQ, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(SwiftGrammarParser.CORDER, 0); }
		public List<TerminalNode> COMILLA() { return getTokens(SwiftGrammarParser.COMILLA); }
		public TerminalNode COMILLA(int i) {
			return getToken(SwiftGrammarParser.COMILLA, i);
		}
		public TerminalNode NIL() { return getToken(SwiftGrammarParser.NIL, 0); }
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_types);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(INT);
				 _localctx.ty = environment.INTEGER 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(FLOAT);
				 _localctx.ty = environment.FLOAT 
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				match(STR);
				 _localctx.ty = environment.STRING 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				match(BOOL);
				 _localctx.ty = environment.BOOLEAN 
				}
				break;
			case CORIZQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(276);
				match(CORIZQ);
				setState(277);
				types();
				setState(278);
				match(CORDER);
				 _localctx.ty = environment.ARRAY 
				}
				break;
			case COMILLA:
				enterOuterAlt(_localctx, 6);
				{
				setState(281);
				match(COMILLA);
				setState(282);
				match(STR);
				setState(283);
				match(COMILLA);
				 _localctx.ty = environment.STR 
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 7);
				{
				setState(285);
				match(NIL);
				 _localctx.ty = environment.NIL 
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

	public static class ExprContext extends ParserRuleContext {
		public interfaces.Expression e;
		public ExprContext left;
		public Token SUB;
		public ExprContext opDe;
		public ExprContext expr;
		public TypesContext types;
		public Token NOT;
		public ExprContext right;
		public Token CORIZQ;
		public ListArrayContext list;
		public ListParamsContext listParams;
		public Token NUMBER;
		public Token STRING;
		public Token TRU;
		public Token FAL;
		public Token ID;
		public Token NIL;
		public Token op;
		public TerminalNode SUB() { return getToken(SwiftGrammarParser.SUB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public TerminalNode NOT() { return getToken(SwiftGrammarParser.NOT, 0); }
		public TerminalNode CORIZQ() { return getToken(SwiftGrammarParser.CORIZQ, 0); }
		public TerminalNode CORDER() { return getToken(SwiftGrammarParser.CORDER, 0); }
		public ListArrayContext listArray() {
			return getRuleContext(ListArrayContext.class,0);
		}
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(SwiftGrammarParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(SwiftGrammarParser.STRING, 0); }
		public TerminalNode TRU() { return getToken(SwiftGrammarParser.TRU, 0); }
		public TerminalNode FAL() { return getToken(SwiftGrammarParser.FAL, 0); }
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode PUNTO() { return getToken(SwiftGrammarParser.PUNTO, 0); }
		public TerminalNode COUNT() { return getToken(SwiftGrammarParser.COUNT, 0); }
		public TerminalNode ISEMPTY() { return getToken(SwiftGrammarParser.ISEMPTY, 0); }
		public TerminalNode NIL() { return getToken(SwiftGrammarParser.NIL, 0); }
		public TerminalNode SUB_IG() { return getToken(SwiftGrammarParser.SUB_IG, 0); }
		public TerminalNode SUM_IG() { return getToken(SwiftGrammarParser.SUM_IG, 0); }
		public TerminalNode MUL() { return getToken(SwiftGrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SwiftGrammarParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SwiftGrammarParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(SwiftGrammarParser.ADD, 0); }
		public TerminalNode MAY_IG() { return getToken(SwiftGrammarParser.MAY_IG, 0); }
		public TerminalNode MAYOR() { return getToken(SwiftGrammarParser.MAYOR, 0); }
		public TerminalNode MEN_IG() { return getToken(SwiftGrammarParser.MEN_IG, 0); }
		public TerminalNode MENOR() { return getToken(SwiftGrammarParser.MENOR, 0); }
		public TerminalNode IG_IG() { return getToken(SwiftGrammarParser.IG_IG, 0); }
		public TerminalNode DIF() { return getToken(SwiftGrammarParser.DIF, 0); }
		public TerminalNode AND() { return getToken(SwiftGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(SwiftGrammarParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(290);
				((ExprContext)_localctx).SUB = match(SUB);
				setState(291);
				((ExprContext)_localctx).opDe = ((ExprContext)_localctx).expr = expr(22);
				_localctx.e = expressions.NewOperation((((ExprContext)_localctx).SUB!=null?((ExprContext)_localctx).SUB.getLine():0),(((ExprContext)_localctx).SUB!=null?((ExprContext)_localctx).SUB.getCharPositionInLine():0),((ExprContext)_localctx).opDe.e,"NEGACION",nil)
				}
				break;
			case 2:
				{
				setState(294);
				((ExprContext)_localctx).types = types();
				setState(295);
				match(PARIZQ);
				setState(296);
				((ExprContext)_localctx).expr = expr(0);
				setState(297);
				match(PARDER);
				 _localctx.e = expressions.NewCast((((ExprContext)_localctx).types!=null?(((ExprContext)_localctx).types.start):null).GetLine(), (((ExprContext)_localctx).types!=null?(((ExprContext)_localctx).types.start):null).GetColumn(), ((ExprContext)_localctx).types.ty, ((ExprContext)_localctx).expr.e) 
				}
				break;
			case 3:
				{
				setState(300);
				((ExprContext)_localctx).NOT = match(NOT);
				setState(301);
				((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(12);
				_localctx.e = expressions.NewOperation((((ExprContext)_localctx).NOT!=null?((ExprContext)_localctx).NOT.getLine():0), (((ExprContext)_localctx).NOT!=null?((ExprContext)_localctx).NOT.getCharPositionInLine():0), ((ExprContext)_localctx).right.e, (((ExprContext)_localctx).NOT!=null?((ExprContext)_localctx).NOT.getText():null) ,nil)
				}
				break;
			case 4:
				{
				setState(304);
				match(PARIZQ);
				setState(305);
				((ExprContext)_localctx).expr = expr(0);
				setState(306);
				match(PARDER);
				 _localctx.e = ((ExprContext)_localctx).expr.e 
				}
				break;
			case 5:
				{
				setState(309);
				((ExprContext)_localctx).CORIZQ = match(CORIZQ);
				setState(310);
				match(CORDER);
				 _localctx.e = expressions.NewArray((((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getLine():0), (((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getCharPositionInLine():0), nil) 
				}
				break;
			case 6:
				{
				setState(312);
				((ExprContext)_localctx).list = listArray(0);
				 _localctx.e = ((ExprContext)_localctx).list.p
				}
				break;
			case 7:
				{
				setState(315);
				((ExprContext)_localctx).CORIZQ = match(CORIZQ);
				setState(316);
				((ExprContext)_localctx).listParams = listParams(0);
				setState(317);
				match(CORDER);
				 _localctx.e = expressions.NewArray((((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getLine():0), (((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getCharPositionInLine():0), ((ExprContext)_localctx).listParams.l) 
				}
				break;
			case 8:
				{
				setState(320);
				((ExprContext)_localctx).NUMBER = match(NUMBER);

				        if (strings.Contains((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null),".")){
				            num,err := strconv.ParseFloat((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null), 64);
				            if err!= nil{
				                fmt.Println(err)
				            }
				            _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getLine():0),(((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getCharPositionInLine():0),num,environment.FLOAT)
				        }else{
				            num,err := strconv.Atoi((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null))
				            if err!= nil{
				                fmt.Println(err)
				            }
				            _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getLine():0),(((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getCharPositionInLine():0),num,environment.INTEGER)
				        }
				    
				}
				break;
			case 9:
				{
				setState(322);
				((ExprContext)_localctx).STRING = match(STRING);

				        str := (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getText():null)
				        _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getLine():0), (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getCharPositionInLine():0), str[1:len(str)-1],environment.STRING)
				    
				}
				break;
			case 10:
				{
				setState(324);
				((ExprContext)_localctx).TRU = match(TRU);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getLine():0), (((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getCharPositionInLine():0), true, environment.BOOLEAN) 
				}
				break;
			case 11:
				{
				setState(326);
				((ExprContext)_localctx).FAL = match(FAL);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getLine():0), (((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getCharPositionInLine():0), false, environment.BOOLEAN) 
				}
				break;
			case 12:
				{
				setState(328);
				((ExprContext)_localctx).ID = match(ID);
				setState(329);
				match(PUNTO);
				setState(330);
				match(COUNT);
				 _localctx.e = expressions.NewCount((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getCharPositionInLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) 
				}
				break;
			case 13:
				{
				setState(332);
				((ExprContext)_localctx).ID = match(ID);
				setState(333);
				match(PUNTO);
				setState(334);
				match(ISEMPTY);
				 _localctx.e = expressions.NewIsEmpty((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getCharPositionInLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) 
				}
				break;
			case 14:
				{
				setState(336);
				((ExprContext)_localctx).NIL = match(NIL);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).NIL!=null?((ExprContext)_localctx).NIL.getLine():0), (((ExprContext)_localctx).NIL!=null?((ExprContext)_localctx).NIL.getCharPositionInLine():0), "nil", environment.NIL) 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(380);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(340);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(341);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUM_IG || _la==SUB_IG) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(342);
						((ExprContext)_localctx).expr = expr(21);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getLine():0), (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getCharPositionInLine():0), nil, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).expr.e) 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(345);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(346);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(347);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(20);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(350);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(351);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(352);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(19);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(355);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(356);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MAY_IG || _la==MAYOR) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(357);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(18);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(360);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(361);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MEN_IG || _la==MENOR) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(362);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(17);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(365);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(366);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIF || _la==IG_IG) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(367);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(16);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(370);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(371);
						((ExprContext)_localctx).op = match(AND);
						setState(372);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(15);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(375);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(376);
						((ExprContext)_localctx).op = match(OR);
						setState(377);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(14);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					}
					} 
				}
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ListParamsContext extends ParserRuleContext {
		public []interface{} l;
		public ListParamsContext list;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public ListParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listParams; }
	}

	public final ListParamsContext listParams() throws RecognitionException {
		return listParams(0);
	}

	private ListParamsContext listParams(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListParamsContext _localctx = new ListParamsContext(_ctx, _parentState);
		ListParamsContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_listParams, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(386);
			((ListParamsContext)_localctx).expr = expr(0);

			            _localctx.l = []interface{}{}
			            _localctx.l = append(_localctx.l, ((ListParamsContext)_localctx).expr.e)
			        
			}
			_ctx.stop = _input.LT(-1);
			setState(396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParams);
					setState(389);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(390);
					match(COMA);
					setState(391);
					((ListParamsContext)_localctx).expr = expr(0);

					                                          var arr []interface{}
					                                          arr = append(((ListParamsContext)_localctx).list.l, ((ListParamsContext)_localctx).expr.e)
					                                          _localctx.l = arr
					                                      
					}
					} 
				}
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ListAccessArrayContext extends ParserRuleContext {
		public []interface{} l;
		public ListAccessArrayContext list;
		public ExprContext expr;
		public TerminalNode CORIZQ() { return getToken(SwiftGrammarParser.CORIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(SwiftGrammarParser.CORDER, 0); }
		public ListAccessArrayContext listAccessArray() {
			return getRuleContext(ListAccessArrayContext.class,0);
		}
		public ListAccessArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listAccessArray; }
	}

	public final ListAccessArrayContext listAccessArray() throws RecognitionException {
		return listAccessArray(0);
	}

	private ListAccessArrayContext listAccessArray(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListAccessArrayContext _localctx = new ListAccessArrayContext(_ctx, _parentState);
		ListAccessArrayContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_listAccessArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(400);
			match(CORIZQ);
			setState(401);
			((ListAccessArrayContext)_localctx).expr = expr(0);
			setState(402);
			match(CORDER);

			            _localctx.l = []interface{}{}
			            _localctx.l = append(_localctx.l, ((ListAccessArrayContext)_localctx).expr.e)
			        
			}
			_ctx.stop = _input.LT(-1);
			setState(413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListAccessArrayContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listAccessArray);
					setState(405);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(406);
					match(CORIZQ);
					setState(407);
					((ListAccessArrayContext)_localctx).expr = expr(0);
					setState(408);
					match(CORDER);

					                                          var arr []interface{}
					                                          arr = append(((ListAccessArrayContext)_localctx).list.l, ((ListAccessArrayContext)_localctx).expr.e)
					                                          _localctx.l = arr
					                                      
					}
					} 
				}
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ListArrayContext extends ParserRuleContext {
		public interfaces.Expression p;
		public ListArrayContext list;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public TerminalNode CORIZQ() { return getToken(SwiftGrammarParser.CORIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(SwiftGrammarParser.CORDER, 0); }
		public ListArrayContext listArray() {
			return getRuleContext(ListArrayContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public ListArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listArray; }
	}

	public final ListArrayContext listArray() throws RecognitionException {
		return listArray(0);
	}

	private ListArrayContext listArray(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListArrayContext _localctx = new ListArrayContext(_ctx, _parentState);
		ListArrayContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_listArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(417);
			((ListArrayContext)_localctx).ID = match(ID);
			 _localctx.p = expressions.NewCallVar((((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getCharPositionInLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))
			}
			_ctx.stop = _input.LT(-1);
			setState(436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(434);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ListArrayContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listArray);
						setState(420);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(421);
						match(CORIZQ);
						setState(422);
						((ListArrayContext)_localctx).expr = expr(0);
						setState(423);
						match(CORDER);
						 _localctx.p = expressions.NewArrayAccess((((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetLine(), (((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetColumn(), ((ListArrayContext)_localctx).list.p, ((ListArrayContext)_localctx).expr.e) 
						}
						break;
					case 2:
						{
						_localctx = new ListArrayContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listArray);
						setState(426);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(427);
						types();
						setState(428);
						match(IG);
						setState(429);
						match(CORIZQ);
						setState(430);
						((ListArrayContext)_localctx).expr = expr(0);
						setState(431);
						match(CORDER);
						 _localctx.p = expressions.NewArrayAccess((((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetLine(), (((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetColumn(), ((ListArrayContext)_localctx).list.p, ((ListArrayContext)_localctx).expr.e) 
						}
						break;
					}
					} 
				}
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprComaContext extends ParserRuleContext {
		public interfaces.Expression t;
		public ExprComaContext left;
		public ExprContext expr;
		public Token op;
		public ExprContext right;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprComaContext exprComa() {
			return getRuleContext(ExprComaContext.class,0);
		}
		public TerminalNode COMA() { return getToken(SwiftGrammarParser.COMA, 0); }
		public ExprComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprComa; }
	}

	public final ExprComaContext exprComa() throws RecognitionException {
		return exprComa(0);
	}

	private ExprComaContext exprComa(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprComaContext _localctx = new ExprComaContext(_ctx, _parentState);
		ExprComaContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_exprComa, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(440);
			((ExprComaContext)_localctx).expr = expr(0);
			 _localctx.t = ((ExprComaContext)_localctx).expr.e 
			}
			_ctx.stop = _input.LT(-1);
			setState(450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprComaContext(_parentctx, _parentState);
					_localctx.left = _prevctx;
					_localctx.left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_exprComa);
					setState(443);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(444);
					((ExprComaContext)_localctx).op = match(COMA);
					setState(445);
					((ExprComaContext)_localctx).right = ((ExprComaContext)_localctx).expr = expr(0);
					 _localctx.t = expressions.NewOperation((((ExprComaContext)_localctx).left!=null?(((ExprComaContext)_localctx).left.start):null).GetLine(), (((ExprComaContext)_localctx).left!=null?(((ExprComaContext)_localctx).left.start):null).GetColumn(), ((ExprComaContext)_localctx).left.t, (((ExprComaContext)_localctx).op!=null?((ExprComaContext)_localctx).op.getText():null), ((ExprComaContext)_localctx).right.e) 
					}
					} 
				}
				setState(452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 16:
			return listParams_sempred((ListParamsContext)_localctx, predIndex);
		case 17:
			return listAccessArray_sempred((ListAccessArrayContext)_localctx, predIndex);
		case 18:
			return listArray_sempred((ListArrayContext)_localctx, predIndex);
		case 19:
			return exprComa_sempred((ExprComaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		}
		return true;
	}
	private boolean listParams_sempred(ListParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listAccessArray_sempred(ListAccessArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listArray_sempred(ListArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exprComa_sempred(ExprComaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u01c8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\6\3\60\n\3\r\3\16\3"+
		"\61\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4W\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5e\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0082\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b3\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c5\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u00dd\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f3\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u010d\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u0122\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0155\n\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u017f"+
		"\n\21\f\21\16\21\u0182\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\7\22\u018d\n\22\f\22\16\22\u0190\13\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u019e\n\23\f\23\16\23\u01a1\13"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\7\24\u01b5\n\24\f\24\16\24\u01b8\13\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u01c3\n\25\f\25\16\25\u01c6"+
		"\13\25\3\25\2\7 \"$&(\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"\2\b\3\2\61\62\4\2\65\6699\3\2\678\4\2//\63\63\4\2\60\60\64\64\3\2)*\2"+
		"\u01ec\2*\3\2\2\2\4/\3\2\2\2\6V\3\2\2\2\bd\3\2\2\2\n\u0081\3\2\2\2\f\u0083"+
		"\3\2\2\2\16\u00b2\3\2\2\2\20\u00c4\3\2\2\2\22\u00dc\3\2\2\2\24\u00de\3"+
		"\2\2\2\26\u00e6\3\2\2\2\30\u00e9\3\2\2\2\32\u00f2\3\2\2\2\34\u010c\3\2"+
		"\2\2\36\u0121\3\2\2\2 \u0154\3\2\2\2\"\u0183\3\2\2\2$\u0191\3\2\2\2&\u01a2"+
		"\3\2\2\2(\u01b9\3\2\2\2*+\5\4\3\2+,\7\2\2\3,-\b\2\1\2-\3\3\2\2\2.\60\5"+
		"\6\4\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2"+
		"\63\64\b\3\1\2\64\5\3\2\2\2\65\66\5\b\5\2\66\67\b\4\1\2\67W\3\2\2\289"+
		"\5\n\6\29:\b\4\1\2:W\3\2\2\2;<\5\16\b\2<=\b\4\1\2=W\3\2\2\2>?\5\f\7\2"+
		"?@\b\4\1\2@W\3\2\2\2AB\5\20\t\2BC\b\4\1\2CW\3\2\2\2DE\5\22\n\2EF\b\4\1"+
		"\2FW\3\2\2\2GH\5\24\13\2HI\b\4\1\2IW\3\2\2\2JK\5\26\f\2KL\b\4\1\2LW\3"+
		"\2\2\2MN\5\30\r\2NO\b\4\1\2OW\3\2\2\2PQ\5\34\17\2QR\b\4\1\2RW\3\2\2\2"+
		"ST\5\32\16\2TU\b\4\1\2UW\3\2\2\2V\65\3\2\2\2V8\3\2\2\2V;\3\2\2\2V>\3\2"+
		"\2\2VA\3\2\2\2VD\3\2\2\2VG\3\2\2\2VJ\3\2\2\2VM\3\2\2\2VP\3\2\2\2VS\3\2"+
		"\2\2W\7\3\2\2\2XY\7\r\2\2YZ\7:\2\2Z[\5 \21\2[\\\7;\2\2\\]\b\5\1\2]e\3"+
		"\2\2\2^_\7\r\2\2_`\7:\2\2`a\5(\25\2ab\7;\2\2bc\b\5\1\2ce\3\2\2\2dX\3\2"+
		"\2\2d^\3\2\2\2e\t\3\2\2\2fg\7\16\2\2gh\5 \21\2hi\7<\2\2ij\5\4\3\2jk\7"+
		"=\2\2kl\b\6\1\2l\u0082\3\2\2\2mn\7\16\2\2no\5 \21\2op\7<\2\2pq\5\4\3\2"+
		"qr\7=\2\2rs\7\17\2\2st\7<\2\2tu\5\4\3\2uv\7=\2\2vw\b\6\1\2w\u0082\3\2"+
		"\2\2xy\7\16\2\2yz\5 \21\2z{\7<\2\2{|\5\4\3\2|}\7=\2\2}~\7\17\2\2~\177"+
		"\5\n\6\2\177\u0080\b\6\1\2\u0080\u0082\3\2\2\2\u0081f\3\2\2\2\u0081m\3"+
		"\2\2\2\u0081x\3\2\2\2\u0082\13\3\2\2\2\u0083\u0084\7\20\2\2\u0084\u0085"+
		"\5 \21\2\u0085\u0086\7<\2\2\u0086\u0087\5\4\3\2\u0087\u0088\7=\2\2\u0088"+
		"\u0089\b\7\1\2\u0089\r\3\2\2\2\u008a\u008b\7\b\2\2\u008b\u008c\7(\2\2"+
		"\u008c\u008d\7>\2\2\u008d\u008e\5\36\20\2\u008e\u008f\7.\2\2\u008f\u0090"+
		"\5 \21\2\u0090\u0091\b\b\1\2\u0091\u00b3\3\2\2\2\u0092\u0093\7\b\2\2\u0093"+
		"\u0094\7(\2\2\u0094\u0095\7.\2\2\u0095\u0096\5 \21\2\u0096\u0097\b\b\1"+
		"\2\u0097\u00b3\3\2\2\2\u0098\u0099\7\b\2\2\u0099\u009a\7(\2\2\u009a\u009b"+
		"\7>\2\2\u009b\u009c\5\36\20\2\u009c\u009d\b\b\1\2\u009d\u00b3\3\2\2\2"+
		"\u009e\u009f\7\t\2\2\u009f\u00a0\7(\2\2\u00a0\u00a1\7>\2\2\u00a1\u00a2"+
		"\5\36\20\2\u00a2\u00a3\7.\2\2\u00a3\u00a4\5 \21\2\u00a4\u00a5\b\b\1\2"+
		"\u00a5\u00b3\3\2\2\2\u00a6\u00a7\7\t\2\2\u00a7\u00a8\7(\2\2\u00a8\u00a9"+
		"\7>\2\2\u00a9\u00aa\5\36\20\2\u00aa\u00ab\b\b\1\2\u00ab\u00b3\3\2\2\2"+
		"\u00ac\u00ad\7\t\2\2\u00ad\u00ae\7(\2\2\u00ae\u00af\7.\2\2\u00af\u00b0"+
		"\5 \21\2\u00b0\u00b1\b\b\1\2\u00b1\u00b3\3\2\2\2\u00b2\u008a\3\2\2\2\u00b2"+
		"\u0092\3\2\2\2\u00b2\u0098\3\2\2\2\u00b2\u009e\3\2\2\2\u00b2\u00a6\3\2"+
		"\2\2\u00b2\u00ac\3\2\2\2\u00b3\17\3\2\2\2\u00b4\u00b5\7(\2\2\u00b5\u00b6"+
		"\7.\2\2\u00b6\u00b7\5 \21\2\u00b7\u00b8\b\t\1\2\u00b8\u00c5\3\2\2\2\u00b9"+
		"\u00ba\7(\2\2\u00ba\u00bb\t\2\2\2\u00bb\u00bc\5 \21\2\u00bc\u00bd\b\t"+
		"\1\2\u00bd\u00c5\3\2\2\2\u00be\u00bf\7(\2\2\u00bf\u00c0\5$\23\2\u00c0"+
		"\u00c1\7.\2\2\u00c1\u00c2\5 \21\2\u00c2\u00c3\b\t\1\2\u00c3\u00c5\3\2"+
		"\2\2\u00c4\u00b4\3\2\2\2\u00c4\u00b9\3\2\2\2\u00c4\u00be\3\2\2\2\u00c5"+
		"\21\3\2\2\2\u00c6\u00c7\7\21\2\2\u00c7\u00c8\7(\2\2\u00c8\u00c9\7\22\2"+
		"\2\u00c9\u00ca\5 \21\2\u00ca\u00cb\7B\2\2\u00cb\u00cc\7B\2\2\u00cc\u00cd"+
		"\7B\2\2\u00cd\u00ce\5 \21\2\u00ce\u00cf\7<\2\2\u00cf\u00d0\5\4\3\2\u00d0"+
		"\u00d1\7=\2\2\u00d1\u00d2\b\n\1\2\u00d2\u00dd\3\2\2\2\u00d3\u00d4\7\21"+
		"\2\2\u00d4\u00d5\7(\2\2\u00d5\u00d6\7\22\2\2\u00d6\u00d7\5 \21\2\u00d7"+
		"\u00d8\7<\2\2\u00d8\u00d9\5\4\3\2\u00d9\u00da\7=\2\2\u00da\u00db\b\n\1"+
		"\2\u00db\u00dd\3\2\2\2\u00dc\u00c6\3\2\2\2\u00dc\u00d3\3\2\2\2\u00dd\23"+
		"\3\2\2\2\u00de\u00df\7\31\2\2\u00df\u00e0\5 \21\2\u00e0\u00e1\7\17\2\2"+
		"\u00e1\u00e2\7<\2\2\u00e2\u00e3\5\4\3\2\u00e3\u00e4\7=\2\2\u00e4\u00e5"+
		"\b\13\1\2\u00e5\25\3\2\2\2\u00e6\u00e7\7\26\2\2\u00e7\u00e8\b\f\1\2\u00e8"+
		"\27\3\2\2\2\u00e9\u00ea\7\30\2\2\u00ea\u00eb\b\r\1\2\u00eb\31\3\2\2\2"+
		"\u00ec\u00ed\7\27\2\2\u00ed\u00ee\5 \21\2\u00ee\u00ef\b\16\1\2\u00ef\u00f3"+
		"\3\2\2\2\u00f0\u00f1\7\27\2\2\u00f1\u00f3\b\16\1\2\u00f2\u00ec\3\2\2\2"+
		"\u00f2\u00f0\3\2\2\2\u00f3\33\3\2\2\2\u00f4\u00f5\7(\2\2\u00f5\u00f6\7"+
		"B\2\2\u00f6\u00f7\7 \2\2\u00f7\u00f8\7:\2\2\u00f8\u00f9\5 \21\2\u00f9"+
		"\u00fa\7;\2\2\u00fa\u00fb\b\17\1\2\u00fb\u010d\3\2\2\2\u00fc\u00fd\7("+
		"\2\2\u00fd\u00fe\7B\2\2\u00fe\u00ff\7\"\2\2\u00ff\u0100\7:\2\2\u0100\u0101"+
		"\7#\2\2\u0101\u0102\7>\2\2\u0102\u0103\5 \21\2\u0103\u0104\7;\2\2\u0104"+
		"\u0105\b\17\1\2\u0105\u010d\3\2\2\2\u0106\u0107\7(\2\2\u0107\u0108\7B"+
		"\2\2\u0108\u0109\7!\2\2\u0109\u010a\7:\2\2\u010a\u010b\7;\2\2\u010b\u010d"+
		"\b\17\1\2\u010c\u00f4\3\2\2\2\u010c\u00fc\3\2\2\2\u010c\u0106\3\2\2\2"+
		"\u010d\35\3\2\2\2\u010e\u010f\7\3\2\2\u010f\u0122\b\20\1\2\u0110\u0111"+
		"\7\4\2\2\u0111\u0122\b\20\1\2\u0112\u0113\7\6\2\2\u0113\u0122\b\20\1\2"+
		"\u0114\u0115\7\5\2\2\u0115\u0122\b\20\1\2\u0116\u0117\7?\2\2\u0117\u0118"+
		"\5\36\20\2\u0118\u0119\7@\2\2\u0119\u011a\b\20\1\2\u011a\u0122\3\2\2\2"+
		"\u011b\u011c\7C\2\2\u011c\u011d\7\6\2\2\u011d\u011e\7C\2\2\u011e\u0122"+
		"\b\20\1\2\u011f\u0120\7\33\2\2\u0120\u0122\b\20\1\2\u0121\u010e\3\2\2"+
		"\2\u0121\u0110\3\2\2\2\u0121\u0112\3\2\2\2\u0121\u0114\3\2\2\2\u0121\u0116"+
		"\3\2\2\2\u0121\u011b\3\2\2\2\u0121\u011f\3\2\2\2\u0122\37\3\2\2\2\u0123"+
		"\u0124\b\21\1\2\u0124\u0125\78\2\2\u0125\u0126\5 \21\30\u0126\u0127\b"+
		"\21\1\2\u0127\u0155\3\2\2\2\u0128\u0129\5\36\20\2\u0129\u012a\7:\2\2\u012a"+
		"\u012b\5 \21\2\u012b\u012c\7;\2\2\u012c\u012d\b\21\1\2\u012d\u0155\3\2"+
		"\2\2\u012e\u012f\7+\2\2\u012f\u0130\5 \21\16\u0130\u0131\b\21\1\2\u0131"+
		"\u0155\3\2\2\2\u0132\u0133\7:\2\2\u0133\u0134\5 \21\2\u0134\u0135\7;\2"+
		"\2\u0135\u0136\b\21\1\2\u0136\u0155\3\2\2\2\u0137\u0138\7?\2\2\u0138\u0139"+
		"\7@\2\2\u0139\u0155\b\21\1\2\u013a\u013b\5&\24\2\u013b\u013c\b\21\1\2"+
		"\u013c\u0155\3\2\2\2\u013d\u013e\7?\2\2\u013e\u013f\5\"\22\2\u013f\u0140"+
		"\7@\2\2\u0140\u0141\b\21\1\2\u0141\u0155\3\2\2\2\u0142\u0143\7&\2\2\u0143"+
		"\u0155\b\21\1\2\u0144\u0145\7\'\2\2\u0145\u0155\b\21\1\2\u0146\u0147\7"+
		"\13\2\2\u0147\u0155\b\21\1\2\u0148\u0149\7\f\2\2\u0149\u0155\b\21\1\2"+
		"\u014a\u014b\7(\2\2\u014b\u014c\7B\2\2\u014c\u014d\7%\2\2\u014d\u0155"+
		"\b\21\1\2\u014e\u014f\7(\2\2\u014f\u0150\7B\2\2\u0150\u0151\7$\2\2\u0151"+
		"\u0155\b\21\1\2\u0152\u0153\7\33\2\2\u0153\u0155\b\21\1\2\u0154\u0123"+
		"\3\2\2\2\u0154\u0128\3\2\2\2\u0154\u012e\3\2\2\2\u0154\u0132\3\2\2\2\u0154"+
		"\u0137\3\2\2\2\u0154\u013a\3\2\2\2\u0154\u013d\3\2\2\2\u0154\u0142\3\2"+
		"\2\2\u0154\u0144\3\2\2\2\u0154\u0146\3\2\2\2\u0154\u0148\3\2\2\2\u0154"+
		"\u014a\3\2\2\2\u0154\u014e\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0180\3\2"+
		"\2\2\u0156\u0157\f\26\2\2\u0157\u0158\t\2\2\2\u0158\u0159\5 \21\27\u0159"+
		"\u015a\b\21\1\2\u015a\u017f\3\2\2\2\u015b\u015c\f\25\2\2\u015c\u015d\t"+
		"\3\2\2\u015d\u015e\5 \21\26\u015e\u015f\b\21\1\2\u015f\u017f\3\2\2\2\u0160"+
		"\u0161\f\24\2\2\u0161\u0162\t\4\2\2\u0162\u0163\5 \21\25\u0163\u0164\b"+
		"\21\1\2\u0164\u017f\3\2\2\2\u0165\u0166\f\23\2\2\u0166\u0167\t\5\2\2\u0167"+
		"\u0168\5 \21\24\u0168\u0169\b\21\1\2\u0169\u017f\3\2\2\2\u016a\u016b\f"+
		"\22\2\2\u016b\u016c\t\6\2\2\u016c\u016d\5 \21\23\u016d\u016e\b\21\1\2"+
		"\u016e\u017f\3\2\2\2\u016f\u0170\f\21\2\2\u0170\u0171\t\7\2\2\u0171\u0172"+
		"\5 \21\22\u0172\u0173\b\21\1\2\u0173\u017f\3\2\2\2\u0174\u0175\f\20\2"+
		"\2\u0175\u0176\7-\2\2\u0176\u0177\5 \21\21\u0177\u0178\b\21\1\2\u0178"+
		"\u017f\3\2\2\2\u0179\u017a\f\17\2\2\u017a\u017b\7,\2\2\u017b\u017c\5 "+
		"\21\20\u017c\u017d\b\21\1\2\u017d\u017f\3\2\2\2\u017e\u0156\3\2\2\2\u017e"+
		"\u015b\3\2\2\2\u017e\u0160\3\2\2\2\u017e\u0165\3\2\2\2\u017e\u016a\3\2"+
		"\2\2\u017e\u016f\3\2\2\2\u017e\u0174\3\2\2\2\u017e\u0179\3\2\2\2\u017f"+
		"\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181!\3\2\2\2"+
		"\u0182\u0180\3\2\2\2\u0183\u0184\b\22\1\2\u0184\u0185\5 \21\2\u0185\u0186"+
		"\b\22\1\2\u0186\u018e\3\2\2\2\u0187\u0188\f\4\2\2\u0188\u0189\7A\2\2\u0189"+
		"\u018a\5 \21\2\u018a\u018b\b\22\1\2\u018b\u018d\3\2\2\2\u018c\u0187\3"+
		"\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"#\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\b\23\1\2\u0192\u0193\7?\2\2"+
		"\u0193\u0194\5 \21\2\u0194\u0195\7@\2\2\u0195\u0196\b\23\1\2\u0196\u019f"+
		"\3\2\2\2\u0197\u0198\f\4\2\2\u0198\u0199\7?\2\2\u0199\u019a\5 \21\2\u019a"+
		"\u019b\7@\2\2\u019b\u019c\b\23\1\2\u019c\u019e\3\2\2\2\u019d\u0197\3\2"+
		"\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"%\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\b\24\1\2\u01a3\u01a4\7(\2\2"+
		"\u01a4\u01a5\b\24\1\2\u01a5\u01b6\3\2\2\2\u01a6\u01a7\f\5\2\2\u01a7\u01a8"+
		"\7?\2\2\u01a8\u01a9\5 \21\2\u01a9\u01aa\7@\2\2\u01aa\u01ab\b\24\1\2\u01ab"+
		"\u01b5\3\2\2\2\u01ac\u01ad\f\4\2\2\u01ad\u01ae\5\36\20\2\u01ae\u01af\7"+
		".\2\2\u01af\u01b0\7?\2\2\u01b0\u01b1\5 \21\2\u01b1\u01b2\7@\2\2\u01b2"+
		"\u01b3\b\24\1\2\u01b3\u01b5\3\2\2\2\u01b4\u01a6\3\2\2\2\u01b4\u01ac\3"+
		"\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\'\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01ba\b\25\1\2\u01ba\u01bb\5 \21"+
		"\2\u01bb\u01bc\b\25\1\2\u01bc\u01c4\3\2\2\2\u01bd\u01be\f\4\2\2\u01be"+
		"\u01bf\7A\2\2\u01bf\u01c0\5 \21\2\u01c0\u01c1\b\25\1\2\u01c1\u01c3\3\2"+
		"\2\2\u01c2\u01bd\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5)\3\2\2\2\u01c6\u01c4\3\2\2\2\24\61Vd\u0081\u00b2"+
		"\u00c4\u00dc\u00f2\u010c\u0121\u0154\u017e\u0180\u018e\u019f\u01b4\u01b6"+
		"\u01c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}