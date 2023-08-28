// Generated from c:\Users\pbara\OneDrive\Escritorio\T-Swift\Server2\SwiftGrammar.g4 by ANTLR 4.9.2

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
		PUNTO=64, COMILLA=65, WHITESPACE=66, COMMENT=67, LINE_COMMENT=68;
	public static final int
		RULE_s = 0, RULE_block = 1, RULE_instruction = 2, RULE_printstmt = 3, 
		RULE_ifstmt = 4, RULE_whilestmt = 5, RULE_declarationstmt = 6, RULE_assignstmt = 7, 
		RULE_forstmt = 8, RULE_guardstmt = 9, RULE_breakstmt = 10, RULE_continuestmt = 11, 
		RULE_fnArray = 12, RULE_types = 13, RULE_expr = 14, RULE_listParams = 15, 
		RULE_listArray = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "block", "instruction", "printstmt", "ifstmt", "whilestmt", "declarationstmt", 
			"assignstmt", "forstmt", "guardstmt", "breakstmt", "continuestmt", "fnArray", 
			"types", "expr", "listParams", "listArray"
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
			setState(34);
			((SContext)_localctx).block = block();
			setState(35);
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
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				((BlockContext)_localctx).instruction = instruction();
				((BlockContext)_localctx).ins.add(((BlockContext)_localctx).instruction);
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << LET) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << CONTINUE) | (1L << GUARD) | (1L << ID))) != 0) );

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
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				((InstructionContext)_localctx).printstmt = printstmt();
				 _localctx.inst = ((InstructionContext)_localctx).printstmt.prnt
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				((InstructionContext)_localctx).ifstmt = ifstmt();
				 _localctx.inst = ((InstructionContext)_localctx).ifstmt.ifinst 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				((InstructionContext)_localctx).declarationstmt = declarationstmt();
				 _localctx.inst = ((InstructionContext)_localctx).declarationstmt.dec 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				((InstructionContext)_localctx).whilestmt = whilestmt();
				 _localctx.inst = ((InstructionContext)_localctx).whilestmt.whl 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				((InstructionContext)_localctx).assignstmt = assignstmt();
				 _localctx.inst = ((InstructionContext)_localctx).assignstmt.asg 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				((InstructionContext)_localctx).forstmt = forstmt();
				 _localctx.inst = ((InstructionContext)_localctx).forstmt.fr 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(63);
				((InstructionContext)_localctx).guardstmt = guardstmt();
				 _localctx.inst = ((InstructionContext)_localctx).guardstmt.grd 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(66);
				((InstructionContext)_localctx).breakstmt = breakstmt();
				 _localctx.inst = ((InstructionContext)_localctx).breakstmt.brk 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(69);
				((InstructionContext)_localctx).continuestmt = continuestmt();
				 _localctx.inst = ((InstructionContext)_localctx).continuestmt.cnt 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(72);
				((InstructionContext)_localctx).fnArray = fnArray();
				 _localctx.inst = ((InstructionContext)_localctx).fnArray.p 
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
		public TerminalNode PRINT() { return getToken(SwiftGrammarParser.PRINT, 0); }
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
		public PrintstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstmt; }
	}

	public final PrintstmtContext printstmt() throws RecognitionException {
		PrintstmtContext _localctx = new PrintstmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_printstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			((PrintstmtContext)_localctx).PRINT = match(PRINT);
			setState(78);
			match(PARIZQ);
			setState(79);
			((PrintstmtContext)_localctx).expr = expr(0);
			setState(80);
			match(PARDER);
			 _localctx.prnt = instructions.NewPrint((((PrintstmtContext)_localctx).PRINT!=null?((PrintstmtContext)_localctx).PRINT.getLine():0),(((PrintstmtContext)_localctx).PRINT!=null?((PrintstmtContext)_localctx).PRINT.getCharPositionInLine():0),((PrintstmtContext)_localctx).expr.e)
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
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(84);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(85);
				match(LLAVEIZQ);
				setState(86);
				((IfstmtContext)_localctx).block = block();
				setState(87);
				match(LLAVEDER);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).block.blk, nil) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(91);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(92);
				match(LLAVEIZQ);
				setState(93);
				((IfstmtContext)_localctx).e1 = block();
				setState(94);
				match(LLAVEDER);
				setState(95);
				match(ELSE);
				setState(96);
				match(LLAVEIZQ);
				setState(97);
				((IfstmtContext)_localctx).e2 = block();
				setState(98);
				match(LLAVEDER);
				 _localctx.ifinst = instructions.NewIf((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getLine():0), (((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getCharPositionInLine():0), ((IfstmtContext)_localctx).expr.e, ((IfstmtContext)_localctx).e1.blk, ((IfstmtContext)_localctx).e2.blk) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				((IfstmtContext)_localctx).IF = match(IF);
				setState(102);
				((IfstmtContext)_localctx).expr = expr(0);
				setState(103);
				match(LLAVEIZQ);
				setState(104);
				((IfstmtContext)_localctx).block = block();
				setState(105);
				match(LLAVEDER);
				setState(106);
				match(ELSE);
				setState(107);
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
			setState(112);
			((WhilestmtContext)_localctx).WHILE = match(WHILE);
			setState(113);
			((WhilestmtContext)_localctx).expr = expr(0);
			setState(114);
			match(LLAVEIZQ);
			setState(115);
			((WhilestmtContext)_localctx).block = block();
			setState(116);
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
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				((DeclarationstmtContext)_localctx).VAR = match(VAR);
				setState(120);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(121);
				match(D_PTS);
				setState(122);
				((DeclarationstmtContext)_localctx).types = types();
				setState(123);
				match(IG);
				setState(124);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				 _localctx.dec = instructions.NewDeclaration((((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getLine():0), (((DeclarationstmtContext)_localctx).VAR!=null?((DeclarationstmtContext)_localctx).VAR.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null), ((DeclarationstmtContext)_localctx).types.ty, ((DeclarationstmtContext)_localctx).expr.e) 
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				((DeclarationstmtContext)_localctx).LET = match(LET);
				setState(128);
				((DeclarationstmtContext)_localctx).ID = match(ID);
				setState(129);
				match(D_PTS);
				setState(130);
				((DeclarationstmtContext)_localctx).types = types();
				setState(131);
				match(IG);
				setState(132);
				((DeclarationstmtContext)_localctx).expr = expr(0);
				 _localctx.dec = instructions.NewDeclaration((((DeclarationstmtContext)_localctx).LET!=null?((DeclarationstmtContext)_localctx).LET.getLine():0), (((DeclarationstmtContext)_localctx).LET!=null?((DeclarationstmtContext)_localctx).LET.getCharPositionInLine():0), (((DeclarationstmtContext)_localctx).ID!=null?((DeclarationstmtContext)_localctx).ID.getText():null), ((DeclarationstmtContext)_localctx).types.ty, ((DeclarationstmtContext)_localctx).expr.e) 
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

	public static class AssignstmtContext extends ParserRuleContext {
		public interfaces.Instruction asg;
		public Token ID;
		public Token op;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(SwiftGrammarParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IG() { return getToken(SwiftGrammarParser.IG, 0); }
		public TerminalNode SUB_IG() { return getToken(SwiftGrammarParser.SUB_IG, 0); }
		public TerminalNode SUM_IG() { return getToken(SwiftGrammarParser.SUM_IG, 0); }
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
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				((AssignstmtContext)_localctx).ID = match(ID);
				setState(138);
				((AssignstmtContext)_localctx).op = match(IG);
				setState(139);
				((AssignstmtContext)_localctx).expr = expr(0);
				 _localctx.asg = instructions.NewAssign((((AssignstmtContext)_localctx).ID!=null?((AssignstmtContext)_localctx).ID.getLine():0), (((AssignstmtContext)_localctx).ID!=null?((AssignstmtContext)_localctx).ID.getCharPositionInLine():0), (((AssignstmtContext)_localctx).ID!=null?((AssignstmtContext)_localctx).ID.getText():null), ((AssignstmtContext)_localctx).expr.e) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				((AssignstmtContext)_localctx).ID = match(ID);
				setState(143);
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
				setState(144);
				((AssignstmtContext)_localctx).expr = expr(0);
				 ((AssignstmtContext)_localctx).asg =  instructions.NewImplicitAssignment((((AssignstmtContext)_localctx).ID!=null?((AssignstmtContext)_localctx).ID.getLine():0), (((AssignstmtContext)_localctx).ID!=null?((AssignstmtContext)_localctx).ID.getCharPositionInLine():0), (((AssignstmtContext)_localctx).ID!=null?((AssignstmtContext)_localctx).ID.getText():null), (((AssignstmtContext)_localctx).op!=null?((AssignstmtContext)_localctx).op.getText():null), ((AssignstmtContext)_localctx).expr.e); 
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
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				((ForstmtContext)_localctx).FOR = match(FOR);
				setState(150);
				((ForstmtContext)_localctx).ID = match(ID);
				setState(151);
				match(IN);
				setState(152);
				((ForstmtContext)_localctx).exp1 = expr(0);
				setState(153);
				match(PUNTO);
				setState(154);
				match(PUNTO);
				setState(155);
				match(PUNTO);
				setState(156);
				((ForstmtContext)_localctx).exp2 = expr(0);
				setState(157);
				match(LLAVEIZQ);
				setState(158);
				((ForstmtContext)_localctx).block = block();
				setState(159);
				match(LLAVEDER);
				 ((ForstmtContext)_localctx).fr =  instructions.NewForIn((((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getLine():0), (((ForstmtContext)_localctx).FOR!=null?((ForstmtContext)_localctx).FOR.getCharPositionInLine():0), (((ForstmtContext)_localctx).ID!=null?((ForstmtContext)_localctx).ID.getText():null), ((ForstmtContext)_localctx).exp1.e, ((ForstmtContext)_localctx).exp2.e, ((ForstmtContext)_localctx).block.blk); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				((ForstmtContext)_localctx).FOR = match(FOR);
				setState(163);
				((ForstmtContext)_localctx).ID = match(ID);
				setState(164);
				match(IN);
				setState(165);
				((ForstmtContext)_localctx).expr = expr(0);
				setState(166);
				match(LLAVEIZQ);
				setState(167);
				((ForstmtContext)_localctx).block = block();
				setState(168);
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
			setState(173);
			((GuardstmtContext)_localctx).GUARD = match(GUARD);
			setState(174);
			((GuardstmtContext)_localctx).expr = expr(0);
			setState(175);
			match(ELSE);
			setState(176);
			match(LLAVEIZQ);
			setState(177);
			((GuardstmtContext)_localctx).block = block();
			setState(178);
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
			setState(181);
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
			setState(184);
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
		enterRule(_localctx, 24, RULE_fnArray);
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				((FnArrayContext)_localctx).ID = match(ID);
				setState(188);
				match(PUNTO);
				setState(189);
				match(APPEND);
				setState(190);
				match(PARIZQ);
				setState(191);
				((FnArrayContext)_localctx).expr = expr(0);
				setState(192);
				match(PARDER);
				 _localctx.p = instructions.NewAppend((((FnArrayContext)_localctx).ID!=null?((FnArrayContext)_localctx).ID.getLine():0), (((FnArrayContext)_localctx).ID!=null?((FnArrayContext)_localctx).ID.getCharPositionInLine():0), (((FnArrayContext)_localctx).ID!=null?((FnArrayContext)_localctx).ID.getText():null), ((FnArrayContext)_localctx).expr.e) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				((FnArrayContext)_localctx).ID = match(ID);
				setState(196);
				match(PUNTO);
				setState(197);
				match(REMOVE);
				setState(198);
				match(PARIZQ);
				setState(199);
				match(AT);
				setState(200);
				match(D_PTS);
				setState(201);
				((FnArrayContext)_localctx).expr = expr(0);
				setState(202);
				match(PARDER);
				 _localctx.p = instructions.NewRemoveAt((((FnArrayContext)_localctx).ID!=null?((FnArrayContext)_localctx).ID.getLine():0), (((FnArrayContext)_localctx).ID!=null?((FnArrayContext)_localctx).ID.getCharPositionInLine():0), (((FnArrayContext)_localctx).ID!=null?((FnArrayContext)_localctx).ID.getText():null), ((FnArrayContext)_localctx).expr.e) 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				((FnArrayContext)_localctx).ID = match(ID);
				setState(206);
				match(PUNTO);
				setState(207);
				match(REMOVELAST);
				setState(208);
				match(PARIZQ);
				setState(209);
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
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_types);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(INT);
				 _localctx.ty = environment.INTEGER 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(FLOAT);
				 _localctx.ty = environment.FLOAT 
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(STR);
				 _localctx.ty = environment.STRING 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				match(BOOL);
				 _localctx.ty = environment.BOOLEAN 
				}
				break;
			case CORIZQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				match(CORIZQ);
				setState(222);
				types();
				setState(223);
				match(CORDER);
				 _localctx.ty = environment.ARRAY 
				}
				break;
			case COMILLA:
				enterOuterAlt(_localctx, 6);
				{
				setState(226);
				match(COMILLA);
				setState(227);
				match(STR);
				setState(228);
				match(COMILLA);
				 _localctx.ty = environment.STR 
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
		public Token CORIZQ;
		public ListArrayContext list;
		public ListParamsContext listParams;
		public Token NUMBER;
		public Token STRING;
		public Token TRU;
		public Token FAL;
		public Token ID;
		public Token op;
		public ExprContext right;
		public TerminalNode SUB() { return getToken(SwiftGrammarParser.SUB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PARIZQ() { return getToken(SwiftGrammarParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(SwiftGrammarParser.PARDER, 0); }
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(233);
				((ExprContext)_localctx).SUB = match(SUB);
				setState(234);
				((ExprContext)_localctx).opDe = ((ExprContext)_localctx).expr = expr(19);
				_localctx.e = expressions.NewOperation((((ExprContext)_localctx).SUB!=null?((ExprContext)_localctx).SUB.getLine():0),(((ExprContext)_localctx).SUB!=null?((ExprContext)_localctx).SUB.getCharPositionInLine():0),((ExprContext)_localctx).opDe.e,"NEGACION",nil)
				}
				break;
			case 2:
				{
				setState(237);
				match(PARIZQ);
				setState(238);
				((ExprContext)_localctx).expr = expr(0);
				setState(239);
				match(PARDER);
				 _localctx.e = ((ExprContext)_localctx).expr.e 
				}
				break;
			case 3:
				{
				setState(242);
				((ExprContext)_localctx).CORIZQ = match(CORIZQ);
				setState(243);
				match(CORDER);
				 _localctx.e = expressions.NewArray((((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getLine():0), (((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getCharPositionInLine():0), nil) 
				}
				break;
			case 4:
				{
				setState(245);
				((ExprContext)_localctx).list = listArray(0);
				 _localctx.e = ((ExprContext)_localctx).list.p
				}
				break;
			case 5:
				{
				setState(248);
				((ExprContext)_localctx).CORIZQ = match(CORIZQ);
				setState(249);
				((ExprContext)_localctx).listParams = listParams(0);
				setState(250);
				match(CORDER);
				 _localctx.e = expressions.NewArray((((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getLine():0), (((ExprContext)_localctx).CORIZQ!=null?((ExprContext)_localctx).CORIZQ.getCharPositionInLine():0), ((ExprContext)_localctx).listParams.l) 
				}
				break;
			case 6:
				{
				setState(253);
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
			case 7:
				{
				setState(255);
				((ExprContext)_localctx).STRING = match(STRING);

				        str := (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getText():null)
				        _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getLine():0), (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getCharPositionInLine():0), str[1:len(str)-1],environment.STRING)
				    
				}
				break;
			case 8:
				{
				setState(257);
				((ExprContext)_localctx).TRU = match(TRU);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getLine():0), (((ExprContext)_localctx).TRU!=null?((ExprContext)_localctx).TRU.getCharPositionInLine():0), true, environment.BOOLEAN) 
				}
				break;
			case 9:
				{
				setState(259);
				((ExprContext)_localctx).FAL = match(FAL);
				 _localctx.e = expressions.NewPrimitive((((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getLine():0), (((ExprContext)_localctx).FAL!=null?((ExprContext)_localctx).FAL.getCharPositionInLine():0), false, environment.BOOLEAN) 
				}
				break;
			case 10:
				{
				setState(261);
				((ExprContext)_localctx).ID = match(ID);
				setState(262);
				match(PUNTO);
				setState(263);
				match(COUNT);
				 _localctx.e = expressions.NewCount((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getCharPositionInLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) 
				}
				break;
			case 11:
				{
				setState(265);
				((ExprContext)_localctx).ID = match(ID);
				setState(266);
				match(PUNTO);
				setState(267);
				match(ISEMPTY);
				 _localctx.e = expressions.NewIsEmpty((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getCharPositionInLine():0), (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)) 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(311);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(271);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(272);
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
						setState(273);
						((ExprContext)_localctx).expr = expr(19);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getLine():0), (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getCharPositionInLine():0), nil, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).expr.e) 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(276);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(277);
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
						setState(278);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(18);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(281);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(282);
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
						setState(283);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(17);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(286);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(287);
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
						setState(288);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(16);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(291);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(292);
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
						setState(293);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(15);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(296);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(297);
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
						setState(298);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(14);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(301);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(302);
						((ExprContext)_localctx).op = match(AND);
						setState(303);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(13);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(306);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(307);
						((ExprContext)_localctx).op = match(OR);
						setState(308);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(12);
						 _localctx.e = expressions.NewOperation((((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetLine(), (((ExprContext)_localctx).left!=null?(((ExprContext)_localctx).left.start):null).GetColumn(), ((ExprContext)_localctx).left.e, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).right.e) 
						}
						break;
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_listParams, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(317);
			((ListParamsContext)_localctx).expr = expr(0);

			            _localctx.l = []interface{}{}
			            _localctx.l = append(_localctx.l, ((ListParamsContext)_localctx).expr.e)
			        
			}
			_ctx.stop = _input.LT(-1);
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
					setState(320);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(321);
					match(COMA);
					setState(322);
					((ListParamsContext)_localctx).expr = expr(0);

					                                          var arr []interface{}
					                                          arr = append(((ListParamsContext)_localctx).list.l, ((ListParamsContext)_localctx).expr.e)
					                                          _localctx.l = arr
					                                      
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode CORIZQ() { return getToken(SwiftGrammarParser.CORIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(SwiftGrammarParser.CORDER, 0); }
		public ListArrayContext listArray() {
			return getRuleContext(ListArrayContext.class,0);
		}
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_listArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(331);
			((ListArrayContext)_localctx).ID = match(ID);
			 _localctx.p = expressions.NewCallVar((((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getCharPositionInLine():0), (((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))
			}
			_ctx.stop = _input.LT(-1);
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListArrayContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listArray);
					setState(334);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(335);
					types();
					setState(336);
					match(CORIZQ);
					setState(337);
					((ListArrayContext)_localctx).expr = expr(0);
					setState(338);
					match(CORDER);
					 _localctx.p = expressions.NewArrayAccess((((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetLine(), (((ListArrayContext)_localctx).list!=null?(((ListArrayContext)_localctx).list.start):null).GetColumn(), ((ListArrayContext)_localctx).list.p, ((ListArrayContext)_localctx).expr.e) 
					}
					} 
				}
				setState(345);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 15:
			return listParams_sempred((ListParamsContext)_localctx, predIndex);
		case 16:
			return listArray_sempred((ListArrayContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
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
	private boolean listArray_sempred(ListArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u015d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\3\6\3*\n\3\r\3\16\3+\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6q\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008a"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0096\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00ae\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00d6\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00e9\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0110\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u013a\n\20\f\20\16\20\u013d\13\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0148\n\21\f\21\16\21\u014b\13"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0158"+
		"\n\22\f\22\16\22\u015b\13\22\3\22\2\5\36 \"\23\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"\2\b\3\2\61\62\4\2\65\6699\3\2\678\4\2//\63\63\4\2\60"+
		"\60\64\64\3\2)*\2\u0175\2$\3\2\2\2\4)\3\2\2\2\6M\3\2\2\2\bO\3\2\2\2\n"+
		"p\3\2\2\2\fr\3\2\2\2\16\u0089\3\2\2\2\20\u0095\3\2\2\2\22\u00ad\3\2\2"+
		"\2\24\u00af\3\2\2\2\26\u00b7\3\2\2\2\30\u00ba\3\2\2\2\32\u00d5\3\2\2\2"+
		"\34\u00e8\3\2\2\2\36\u010f\3\2\2\2 \u013e\3\2\2\2\"\u014c\3\2\2\2$%\5"+
		"\4\3\2%&\7\2\2\3&\'\b\2\1\2\'\3\3\2\2\2(*\5\6\4\2)(\3\2\2\2*+\3\2\2\2"+
		"+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\b\3\1\2.\5\3\2\2\2/\60\5\b\5\2\60\61"+
		"\b\4\1\2\61N\3\2\2\2\62\63\5\n\6\2\63\64\b\4\1\2\64N\3\2\2\2\65\66\5\16"+
		"\b\2\66\67\b\4\1\2\67N\3\2\2\289\5\f\7\29:\b\4\1\2:N\3\2\2\2;<\5\20\t"+
		"\2<=\b\4\1\2=N\3\2\2\2>?\5\22\n\2?@\b\4\1\2@N\3\2\2\2AB\5\24\13\2BC\b"+
		"\4\1\2CN\3\2\2\2DE\5\26\f\2EF\b\4\1\2FN\3\2\2\2GH\5\30\r\2HI\b\4\1\2I"+
		"N\3\2\2\2JK\5\32\16\2KL\b\4\1\2LN\3\2\2\2M/\3\2\2\2M\62\3\2\2\2M\65\3"+
		"\2\2\2M8\3\2\2\2M;\3\2\2\2M>\3\2\2\2MA\3\2\2\2MD\3\2\2\2MG\3\2\2\2MJ\3"+
		"\2\2\2N\7\3\2\2\2OP\7\r\2\2PQ\7:\2\2QR\5\36\20\2RS\7;\2\2ST\b\5\1\2T\t"+
		"\3\2\2\2UV\7\16\2\2VW\5\36\20\2WX\7<\2\2XY\5\4\3\2YZ\7=\2\2Z[\b\6\1\2"+
		"[q\3\2\2\2\\]\7\16\2\2]^\5\36\20\2^_\7<\2\2_`\5\4\3\2`a\7=\2\2ab\7\17"+
		"\2\2bc\7<\2\2cd\5\4\3\2de\7=\2\2ef\b\6\1\2fq\3\2\2\2gh\7\16\2\2hi\5\36"+
		"\20\2ij\7<\2\2jk\5\4\3\2kl\7=\2\2lm\7\17\2\2mn\5\n\6\2no\b\6\1\2oq\3\2"+
		"\2\2pU\3\2\2\2p\\\3\2\2\2pg\3\2\2\2q\13\3\2\2\2rs\7\20\2\2st\5\36\20\2"+
		"tu\7<\2\2uv\5\4\3\2vw\7=\2\2wx\b\7\1\2x\r\3\2\2\2yz\7\b\2\2z{\7(\2\2{"+
		"|\7>\2\2|}\5\34\17\2}~\7.\2\2~\177\5\36\20\2\177\u0080\b\b\1\2\u0080\u008a"+
		"\3\2\2\2\u0081\u0082\7\t\2\2\u0082\u0083\7(\2\2\u0083\u0084\7>\2\2\u0084"+
		"\u0085\5\34\17\2\u0085\u0086\7.\2\2\u0086\u0087\5\36\20\2\u0087\u0088"+
		"\b\b\1\2\u0088\u008a\3\2\2\2\u0089y\3\2\2\2\u0089\u0081\3\2\2\2\u008a"+
		"\17\3\2\2\2\u008b\u008c\7(\2\2\u008c\u008d\7.\2\2\u008d\u008e\5\36\20"+
		"\2\u008e\u008f\b\t\1\2\u008f\u0096\3\2\2\2\u0090\u0091\7(\2\2\u0091\u0092"+
		"\t\2\2\2\u0092\u0093\5\36\20\2\u0093\u0094\b\t\1\2\u0094\u0096\3\2\2\2"+
		"\u0095\u008b\3\2\2\2\u0095\u0090\3\2\2\2\u0096\21\3\2\2\2\u0097\u0098"+
		"\7\21\2\2\u0098\u0099\7(\2\2\u0099\u009a\7\22\2\2\u009a\u009b\5\36\20"+
		"\2\u009b\u009c\7B\2\2\u009c\u009d\7B\2\2\u009d\u009e\7B\2\2\u009e\u009f"+
		"\5\36\20\2\u009f\u00a0\7<\2\2\u00a0\u00a1\5\4\3\2\u00a1\u00a2\7=\2\2\u00a2"+
		"\u00a3\b\n\1\2\u00a3\u00ae\3\2\2\2\u00a4\u00a5\7\21\2\2\u00a5\u00a6\7"+
		"(\2\2\u00a6\u00a7\7\22\2\2\u00a7\u00a8\5\36\20\2\u00a8\u00a9\7<\2\2\u00a9"+
		"\u00aa\5\4\3\2\u00aa\u00ab\7=\2\2\u00ab\u00ac\b\n\1\2\u00ac\u00ae\3\2"+
		"\2\2\u00ad\u0097\3\2\2\2\u00ad\u00a4\3\2\2\2\u00ae\23\3\2\2\2\u00af\u00b0"+
		"\7\31\2\2\u00b0\u00b1\5\36\20\2\u00b1\u00b2\7\17\2\2\u00b2\u00b3\7<\2"+
		"\2\u00b3\u00b4\5\4\3\2\u00b4\u00b5\7=\2\2\u00b5\u00b6\b\13\1\2\u00b6\25"+
		"\3\2\2\2\u00b7\u00b8\7\26\2\2\u00b8\u00b9\b\f\1\2\u00b9\27\3\2\2\2\u00ba"+
		"\u00bb\7\30\2\2\u00bb\u00bc\b\r\1\2\u00bc\31\3\2\2\2\u00bd\u00be\7(\2"+
		"\2\u00be\u00bf\7B\2\2\u00bf\u00c0\7 \2\2\u00c0\u00c1\7:\2\2\u00c1\u00c2"+
		"\5\36\20\2\u00c2\u00c3\7;\2\2\u00c3\u00c4\b\16\1\2\u00c4\u00d6\3\2\2\2"+
		"\u00c5\u00c6\7(\2\2\u00c6\u00c7\7B\2\2\u00c7\u00c8\7\"\2\2\u00c8\u00c9"+
		"\7:\2\2\u00c9\u00ca\7#\2\2\u00ca\u00cb\7>\2\2\u00cb\u00cc\5\36\20\2\u00cc"+
		"\u00cd\7;\2\2\u00cd\u00ce\b\16\1\2\u00ce\u00d6\3\2\2\2\u00cf\u00d0\7("+
		"\2\2\u00d0\u00d1\7B\2\2\u00d1\u00d2\7!\2\2\u00d2\u00d3\7:\2\2\u00d3\u00d4"+
		"\7;\2\2\u00d4\u00d6\b\16\1\2\u00d5\u00bd\3\2\2\2\u00d5\u00c5\3\2\2\2\u00d5"+
		"\u00cf\3\2\2\2\u00d6\33\3\2\2\2\u00d7\u00d8\7\3\2\2\u00d8\u00e9\b\17\1"+
		"\2\u00d9\u00da\7\4\2\2\u00da\u00e9\b\17\1\2\u00db\u00dc\7\6\2\2\u00dc"+
		"\u00e9\b\17\1\2\u00dd\u00de\7\5\2\2\u00de\u00e9\b\17\1\2\u00df\u00e0\7"+
		"?\2\2\u00e0\u00e1\5\34\17\2\u00e1\u00e2\7@\2\2\u00e2\u00e3\b\17\1\2\u00e3"+
		"\u00e9\3\2\2\2\u00e4\u00e5\7C\2\2\u00e5\u00e6\7\6\2\2\u00e6\u00e7\7C\2"+
		"\2\u00e7\u00e9\b\17\1\2\u00e8\u00d7\3\2\2\2\u00e8\u00d9\3\2\2\2\u00e8"+
		"\u00db\3\2\2\2\u00e8\u00dd\3\2\2\2\u00e8\u00df\3\2\2\2\u00e8\u00e4\3\2"+
		"\2\2\u00e9\35\3\2\2\2\u00ea\u00eb\b\20\1\2\u00eb\u00ec\78\2\2\u00ec\u00ed"+
		"\5\36\20\25\u00ed\u00ee\b\20\1\2\u00ee\u0110\3\2\2\2\u00ef\u00f0\7:\2"+
		"\2\u00f0\u00f1\5\36\20\2\u00f1\u00f2\7;\2\2\u00f2\u00f3\b\20\1\2\u00f3"+
		"\u0110\3\2\2\2\u00f4\u00f5\7?\2\2\u00f5\u00f6\7@\2\2\u00f6\u0110\b\20"+
		"\1\2\u00f7\u00f8\5\"\22\2\u00f8\u00f9\b\20\1\2\u00f9\u0110\3\2\2\2\u00fa"+
		"\u00fb\7?\2\2\u00fb\u00fc\5 \21\2\u00fc\u00fd\7@\2\2\u00fd\u00fe\b\20"+
		"\1\2\u00fe\u0110\3\2\2\2\u00ff\u0100\7&\2\2\u0100\u0110\b\20\1\2\u0101"+
		"\u0102\7\'\2\2\u0102\u0110\b\20\1\2\u0103\u0104\7\13\2\2\u0104\u0110\b"+
		"\20\1\2\u0105\u0106\7\f\2\2\u0106\u0110\b\20\1\2\u0107\u0108\7(\2\2\u0108"+
		"\u0109\7B\2\2\u0109\u010a\7%\2\2\u010a\u0110\b\20\1\2\u010b\u010c\7(\2"+
		"\2\u010c\u010d\7B\2\2\u010d\u010e\7$\2\2\u010e\u0110\b\20\1\2\u010f\u00ea"+
		"\3\2\2\2\u010f\u00ef\3\2\2\2\u010f\u00f4\3\2\2\2\u010f\u00f7\3\2\2\2\u010f"+
		"\u00fa\3\2\2\2\u010f\u00ff\3\2\2\2\u010f\u0101\3\2\2\2\u010f\u0103\3\2"+
		"\2\2\u010f\u0105\3\2\2\2\u010f\u0107\3\2\2\2\u010f\u010b\3\2\2\2\u0110"+
		"\u013b\3\2\2\2\u0111\u0112\f\24\2\2\u0112\u0113\t\2\2\2\u0113\u0114\5"+
		"\36\20\25\u0114\u0115\b\20\1\2\u0115\u013a\3\2\2\2\u0116\u0117\f\23\2"+
		"\2\u0117\u0118\t\3\2\2\u0118\u0119\5\36\20\24\u0119\u011a\b\20\1\2\u011a"+
		"\u013a\3\2\2\2\u011b\u011c\f\22\2\2\u011c\u011d\t\4\2\2\u011d\u011e\5"+
		"\36\20\23\u011e\u011f\b\20\1\2\u011f\u013a\3\2\2\2\u0120\u0121\f\21\2"+
		"\2\u0121\u0122\t\5\2\2\u0122\u0123\5\36\20\22\u0123\u0124\b\20\1\2\u0124"+
		"\u013a\3\2\2\2\u0125\u0126\f\20\2\2\u0126\u0127\t\6\2\2\u0127\u0128\5"+
		"\36\20\21\u0128\u0129\b\20\1\2\u0129\u013a\3\2\2\2\u012a\u012b\f\17\2"+
		"\2\u012b\u012c\t\7\2\2\u012c\u012d\5\36\20\20\u012d\u012e\b\20\1\2\u012e"+
		"\u013a\3\2\2\2\u012f\u0130\f\16\2\2\u0130\u0131\7-\2\2\u0131\u0132\5\36"+
		"\20\17\u0132\u0133\b\20\1\2\u0133\u013a\3\2\2\2\u0134\u0135\f\r\2\2\u0135"+
		"\u0136\7,\2\2\u0136\u0137\5\36\20\16\u0137\u0138\b\20\1\2\u0138\u013a"+
		"\3\2\2\2\u0139\u0111\3\2\2\2\u0139\u0116\3\2\2\2\u0139\u011b\3\2\2\2\u0139"+
		"\u0120\3\2\2\2\u0139\u0125\3\2\2\2\u0139\u012a\3\2\2\2\u0139\u012f\3\2"+
		"\2\2\u0139\u0134\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\37\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\b\21\1"+
		"\2\u013f\u0140\5\36\20\2\u0140\u0141\b\21\1\2\u0141\u0149\3\2\2\2\u0142"+
		"\u0143\f\4\2\2\u0143\u0144\7A\2\2\u0144\u0145\5\36\20\2\u0145\u0146\b"+
		"\21\1\2\u0146\u0148\3\2\2\2\u0147\u0142\3\2\2\2\u0148\u014b\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a!\3\2\2\2\u014b\u0149\3\2\2\2"+
		"\u014c\u014d\b\22\1\2\u014d\u014e\7(\2\2\u014e\u014f\b\22\1\2\u014f\u0159"+
		"\3\2\2\2\u0150\u0151\f\4\2\2\u0151\u0152\5\34\17\2\u0152\u0153\7?\2\2"+
		"\u0153\u0154\5\36\20\2\u0154\u0155\7@\2\2\u0155\u0156\b\22\1\2\u0156\u0158"+
		"\3\2\2\2\u0157\u0150\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a#\3\2\2\2\u015b\u0159\3\2\2\2\17+Mp\u0089\u0095\u00ad"+
		"\u00d5\u00e8\u010f\u0139\u013b\u0149\u0159";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}