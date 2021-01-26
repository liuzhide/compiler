// Generated from Ofp.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OfpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, PRINT=23, LEN=24, ADD=25, 
		SUB=26, MUL=27, DIV=28, LT=29, GT=30, EQ=31, ID=32, PINT=33, INT=34, PREAL=35, 
		REAL=36, CHAR=37, STRING=38, COMMENT=39, WS=40;
	public static final int
		RULE_program = 0, RULE_function_decl = 1, RULE_type = 2, RULE_base_type = 3, 
		RULE_parm_decl = 4, RULE_parm_decls = 5, RULE_var_decl = 6, RULE_integer = 7, 
		RULE_real = 8, RULE_item = 9, RULE_data = 10, RULE_init = 11, RULE_assign = 12, 
		RULE_print = 13, RULE_calstmt = 14, RULE_retstmt = 15, RULE_stmt = 16, 
		RULE_block = 17, RULE_body = 18, RULE_ifstmt = 19, RULE_elsestmt = 20, 
		RULE_whilestmt = 21, RULE_expr = 22, RULE_factor = 23, RULE_unary_expr = 24, 
		RULE_primary = 25, RULE_variable = 26, RULE_cal = 27, RULE_bool = 28, 
		RULE_index = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function_decl", "type", "base_type", "parm_decl", "parm_decls", 
			"var_decl", "integer", "real", "item", "data", "init", "assign", "print", 
			"calstmt", "retstmt", "stmt", "block", "body", "ifstmt", "elsestmt", 
			"whilestmt", "expr", "factor", "unary_expr", "primary", "variable", "cal", 
			"bool", "index"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'('", "')'", "'['", "']'", "'string'", "'bool'", "'int'", 
			"'float'", "'char'", "','", "'='", "';'", "'{'", "'}'", "'new'", "'return'", 
			"'if'", "'else'", "'while'", "'true'", "'false'", null, "'.length'", 
			"'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "PRINT", 
			"LEN", "ADD", "SUB", "MUL", "DIV", "LT", "GT", "EQ", "ID", "PINT", "INT", 
			"PREAL", "REAL", "CHAR", "STRING", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "Ofp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OfpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(OfpParser.EOF, 0); }
		public List<Function_declContext> function_decl() {
			return getRuleContexts(Function_declContext.class);
		}
		public Function_declContext function_decl(int i) {
			return getRuleContext(Function_declContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				function_decl();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0) );
			setState(65);
			match(EOF);
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

	public static class Function_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OfpParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Parm_declsContext parm_decls() {
			return getRuleContext(Parm_declsContext.class,0);
		}
		public Function_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterFunction_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitFunction_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitFunction_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declContext function_decl() throws RecognitionException {
		Function_declContext _localctx = new Function_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
				{
				setState(67);
				type();
				}
				break;
			case T__0:
				{
				setState(68);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(71);
			match(ID);
			setState(72);
			match(T__1);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				setState(73);
				parm_decls();
				}
			}

			setState(76);
			match(T__2);
			setState(77);
			block();
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
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				base_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				base_type();
				setState(81);
				match(T__3);
				setState(82);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				match(T__6);
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

	public static class Base_typeContext extends ParserRuleContext {
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterBase_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitBase_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitBase_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_base_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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

	public static class Parm_declContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(OfpParser.ID, 0); }
		public Parm_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parm_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterParm_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitParm_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitParm_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parm_declContext parm_decl() throws RecognitionException {
		Parm_declContext _localctx = new Parm_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parm_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			type();
			setState(91);
			match(ID);
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

	public static class Parm_declsContext extends ParserRuleContext {
		public List<Parm_declContext> parm_decl() {
			return getRuleContexts(Parm_declContext.class);
		}
		public Parm_declContext parm_decl(int i) {
			return getRuleContext(Parm_declContext.class,i);
		}
		public Parm_declsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parm_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterParm_decls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitParm_decls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitParm_decls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parm_declsContext parm_decls() throws RecognitionException {
		Parm_declsContext _localctx = new Parm_declsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parm_decls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			parm_decl();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(94);
				match(T__10);
				setState(95);
				parm_decl();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Var_declContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(OfpParser.ID, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			type();
			setState(102);
			match(ID);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(103);
				match(T__11);
				setState(104);
				init();
				}
			}

			setState(107);
			match(T__12);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(OfpParser.INT, 0); }
		public TerminalNode PINT() { return getToken(OfpParser.PINT, 0); }
		public TerminalNode SUB() { return getToken(OfpParser.SUB, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_integer);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(INT);
				}
				break;
			case PINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(PINT);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(SUB);
				setState(112);
				match(PINT);
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

	public static class RealContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(OfpParser.REAL, 0); }
		public TerminalNode PREAL() { return getToken(OfpParser.PREAL, 0); }
		public TerminalNode SUB() { return getToken(OfpParser.SUB, 0); }
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_real);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(REAL);
				}
				break;
			case PREAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(PREAL);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(SUB);
				setState(118);
				match(REAL);
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

	public static class ItemContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(OfpParser.CHAR, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_item);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				real();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(CHAR);
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

	public static class DataContext extends ParserRuleContext {
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_data);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(T__13);
				setState(127);
				item();
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(128);
					match(T__10);
					setState(129);
					item();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(T__15);
				setState(138);
				base_type();
				setState(139);
				match(T__3);
				setState(140);
				expr(0);
				setState(141);
				match(T__4);
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

	public static class InitContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_init);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__20:
			case T__21:
			case SUB:
			case ID:
			case PINT:
			case INT:
			case PREAL:
			case REAL:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				expr(0);
				}
				break;
			case T__13:
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				data();
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

	public static class AssignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			variable();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(150);
				index();
				}
			}

			setState(153);
			match(T__11);
			setState(154);
			expr(0);
			setState(155);
			match(T__12);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(OfpParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(PRINT);
			setState(158);
			match(T__1);
			setState(159);
			expr(0);
			setState(160);
			match(T__2);
			setState(161);
			match(T__12);
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

	public static class CalstmtContext extends ParserRuleContext {
		public CalContext cal() {
			return getRuleContext(CalContext.class,0);
		}
		public CalstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterCalstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitCalstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitCalstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalstmtContext calstmt() throws RecognitionException {
		CalstmtContext _localctx = new CalstmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_calstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			cal();
			setState(164);
			match(T__12);
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

	public static class RetstmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterRetstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitRetstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitRetstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetstmtContext retstmt() throws RecognitionException {
		RetstmtContext _localctx = new RetstmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_retstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__16);
			setState(167);
			expr(0);
			setState(168);
			match(T__12);
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

	public static class StmtContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public CalstmtContext calstmt() {
			return getRuleContext(CalstmtContext.class,0);
		}
		public RetstmtContext retstmt() {
			return getRuleContext(RetstmtContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stmt);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				calstmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				retstmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
				ifstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(176);
				whilestmt();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__13);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(180);
				stmt();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			match(T__14);
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

	public static class BodyContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_body);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__16:
			case T__17:
			case T__19:
			case PRINT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				stmt();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				block();
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

	public static class IfstmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public List<ElsestmtContext> elsestmt() {
			return getRuleContexts(ElsestmtContext.class);
		}
		public ElsestmtContext elsestmt(int i) {
			return getRuleContext(ElsestmtContext.class,i);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifstmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__17);
			setState(193);
			match(T__1);
			setState(194);
			expr(0);
			setState(195);
			match(T__2);
			setState(196);
			body();
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197);
					elsestmt();
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(203);
				match(T__18);
				setState(204);
				body();
				}
				break;
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

	public static class ElsestmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElsestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterElsestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitElsestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitElsestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsestmtContext elsestmt() throws RecognitionException {
		ElsestmtContext _localctx = new ElsestmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elsestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__18);
			setState(208);
			match(T__17);
			setState(209);
			match(T__1);
			setState(210);
			expr(0);
			setState(211);
			match(T__2);
			setState(212);
			body();
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitWhilestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitWhilestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__19);
			setState(215);
			match(T__1);
			setState(216);
			expr(0);
			setState(217);
			match(T__2);
			setState(218);
			body();
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
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(OfpParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(OfpParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(OfpParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(OfpParser.SUB, 0); }
		public TerminalNode LT() { return getToken(OfpParser.LT, 0); }
		public TerminalNode GT() { return getToken(OfpParser.GT, 0); }
		public TerminalNode EQ() { return getToken(OfpParser.EQ, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(221);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(232);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(223);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(224);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(225);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(226);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(227);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(228);
						expr(4);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(229);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(230);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(231);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public Unary_exprContext unary_expr() {
			return getRuleContext(Unary_exprContext.class,0);
		}
		public TerminalNode INT() { return getToken(OfpParser.INT, 0); }
		public TerminalNode REAL() { return getToken(OfpParser.REAL, 0); }
		public TerminalNode PINT() { return getToken(OfpParser.PINT, 0); }
		public TerminalNode PREAL() { return getToken(OfpParser.PREAL, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_factor);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__20:
			case T__21:
			case SUB:
			case ID:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				unary_expr();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(INT);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				match(REAL);
				}
				break;
			case PINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				match(PINT);
				}
				break;
			case PREAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				match(PREAL);
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

	public static class Unary_exprContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode SUB() { return getToken(OfpParser.SUB, 0); }
		public Unary_exprContext unary_expr() {
			return getRuleContext(Unary_exprContext.class,0);
		}
		public Unary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterUnary_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitUnary_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitUnary_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_exprContext unary_expr() throws RecognitionException {
		Unary_exprContext _localctx = new Unary_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_unary_expr);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(SUB);
				setState(246);
				unary_expr();
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

	public static class PrimaryContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public CalContext cal() {
			return getRuleContext(CalContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LEN() { return getToken(OfpParser.LEN, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public TerminalNode SUB() { return getToken(OfpParser.SUB, 0); }
		public TerminalNode PINT() { return getToken(OfpParser.PINT, 0); }
		public TerminalNode PREAL() { return getToken(OfpParser.PREAL, 0); }
		public TerminalNode CHAR() { return getToken(OfpParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(OfpParser.STRING, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_primary);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(249);
					variable();
					}
					break;
				case 2:
					{
					setState(250);
					cal();
					}
					break;
				case 3:
					{
					setState(251);
					match(T__1);
					setState(252);
					expr(0);
					setState(253);
					match(T__2);
					}
					break;
				}
				setState(259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(257);
					match(LEN);
					}
					break;
				case 2:
					{
					setState(258);
					index();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(SUB);
				setState(262);
				match(PINT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				match(SUB);
				setState(264);
				match(PREAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				match(CHAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(267);
				bool();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OfpParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(ID);
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

	public static class CalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OfpParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterCal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitCal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitCal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalContext cal() throws RecognitionException {
		CalContext _localctx = new CalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(ID);
			setState(273);
			match(T__1);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__20) | (1L << T__21) | (1L << SUB) | (1L << ID) | (1L << PINT) | (1L << INT) | (1L << PREAL) | (1L << REAL) | (1L << CHAR) | (1L << STRING))) != 0)) {
				{
				setState(274);
				expr(0);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(275);
					match(T__10);
					setState(276);
					expr(0);
					}
					}
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(284);
			match(T__2);
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

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
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

	public static class IndexContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpListener ) ((OfpListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpVisitor ) return ((OfpVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__3);
			setState(289);
			expr(0);
			setState(290);
			match(T__4);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u0127\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\6\2@"+
		"\n\2\r\2\16\2A\3\2\3\2\3\3\3\3\5\3H\n\3\3\3\3\3\3\3\5\3M\n\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Y\n\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\7\7c\n\7\f\7\16\7f\13\7\3\b\3\b\3\b\3\b\5\bl\n\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\5\tt\n\t\3\n\3\n\3\n\3\n\5\nz\n\n\3\13\3\13\3\13\5\13\177\n\13"+
		"\3\f\3\f\3\f\3\f\7\f\u0085\n\f\f\f\16\f\u0088\13\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u0092\n\f\3\r\3\r\5\r\u0096\n\r\3\16\3\16\5\16\u009a"+
		"\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b4\n\22"+
		"\3\23\3\23\7\23\u00b8\n\23\f\23\16\23\u00bb\13\23\3\23\3\23\3\24\3\24"+
		"\5\24\u00c1\n\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00c9\n\25\f\25\16"+
		"\25\u00cc\13\25\3\25\3\25\5\25\u00d0\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\7\30\u00eb\n\30\f\30\16\30\u00ee\13\30\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u00f5\n\31\3\32\3\32\3\32\5\32\u00fa\n\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\5\33\u0102\n\33\3\33\3\33\5\33\u0106\n\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u010f\n\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\7\35\u0118\n\35\f\35\16\35\u011b\13\35\5\35\u011d\n\35"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\2\3. \2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\7\3\2\n\f\3\2\35\36\3"+
		"\2\33\34\3\2\37!\3\2\27\30\2\u0137\2?\3\2\2\2\4G\3\2\2\2\6X\3\2\2\2\b"+
		"Z\3\2\2\2\n\\\3\2\2\2\f_\3\2\2\2\16g\3\2\2\2\20s\3\2\2\2\22y\3\2\2\2\24"+
		"~\3\2\2\2\26\u0091\3\2\2\2\30\u0095\3\2\2\2\32\u0097\3\2\2\2\34\u009f"+
		"\3\2\2\2\36\u00a5\3\2\2\2 \u00a8\3\2\2\2\"\u00b3\3\2\2\2$\u00b5\3\2\2"+
		"\2&\u00c0\3\2\2\2(\u00c2\3\2\2\2*\u00d1\3\2\2\2,\u00d8\3\2\2\2.\u00de"+
		"\3\2\2\2\60\u00f4\3\2\2\2\62\u00f9\3\2\2\2\64\u010e\3\2\2\2\66\u0110\3"+
		"\2\2\28\u0112\3\2\2\2:\u0120\3\2\2\2<\u0122\3\2\2\2>@\5\4\3\2?>\3\2\2"+
		"\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\2\2\3D\3\3\2\2\2EH\5\6"+
		"\4\2FH\7\3\2\2GE\3\2\2\2GF\3\2\2\2HI\3\2\2\2IJ\7\"\2\2JL\7\4\2\2KM\5\f"+
		"\7\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\5\2\2OP\5$\23\2P\5\3\2\2\2QY\5"+
		"\b\5\2RS\5\b\5\2ST\7\6\2\2TU\7\7\2\2UY\3\2\2\2VY\7\b\2\2WY\7\t\2\2XQ\3"+
		"\2\2\2XR\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\7\3\2\2\2Z[\t\2\2\2[\t\3\2\2\2\\"+
		"]\5\6\4\2]^\7\"\2\2^\13\3\2\2\2_d\5\n\6\2`a\7\r\2\2ac\5\n\6\2b`\3\2\2"+
		"\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\r\3\2\2\2fd\3\2\2\2gh\5\6\4\2hk\7\""+
		"\2\2ij\7\16\2\2jl\5\30\r\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\17\2\2n\17"+
		"\3\2\2\2ot\7$\2\2pt\7#\2\2qr\7\34\2\2rt\7#\2\2so\3\2\2\2sp\3\2\2\2sq\3"+
		"\2\2\2t\21\3\2\2\2uz\7&\2\2vz\7%\2\2wx\7\34\2\2xz\7&\2\2yu\3\2\2\2yv\3"+
		"\2\2\2yw\3\2\2\2z\23\3\2\2\2{\177\5\20\t\2|\177\5\22\n\2}\177\7\'\2\2"+
		"~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\25\3\2\2\2\u0080\u0081\7\20\2\2\u0081"+
		"\u0086\5\24\13\2\u0082\u0083\7\r\2\2\u0083\u0085\5\24\13\2\u0084\u0082"+
		"\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\21\2\2\u008a\u0092\3"+
		"\2\2\2\u008b\u008c\7\22\2\2\u008c\u008d\5\b\5\2\u008d\u008e\7\6\2\2\u008e"+
		"\u008f\5.\30\2\u008f\u0090\7\7\2\2\u0090\u0092\3\2\2\2\u0091\u0080\3\2"+
		"\2\2\u0091\u008b\3\2\2\2\u0092\27\3\2\2\2\u0093\u0096\5.\30\2\u0094\u0096"+
		"\5\26\f\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\31\3\2\2\2\u0097"+
		"\u0099\5\66\34\2\u0098\u009a\5<\37\2\u0099\u0098\3\2\2\2\u0099\u009a\3"+
		"\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\16\2\2\u009c\u009d\5.\30\2\u009d"+
		"\u009e\7\17\2\2\u009e\33\3\2\2\2\u009f\u00a0\7\31\2\2\u00a0\u00a1\7\4"+
		"\2\2\u00a1\u00a2\5.\30\2\u00a2\u00a3\7\5\2\2\u00a3\u00a4\7\17\2\2\u00a4"+
		"\35\3\2\2\2\u00a5\u00a6\58\35\2\u00a6\u00a7\7\17\2\2\u00a7\37\3\2\2\2"+
		"\u00a8\u00a9\7\23\2\2\u00a9\u00aa\5.\30\2\u00aa\u00ab\7\17\2\2\u00ab!"+
		"\3\2\2\2\u00ac\u00b4\5\16\b\2\u00ad\u00b4\5\32\16\2\u00ae\u00b4\5\34\17"+
		"\2\u00af\u00b4\5\36\20\2\u00b0\u00b4\5 \21\2\u00b1\u00b4\5(\25\2\u00b2"+
		"\u00b4\5,\27\2\u00b3\u00ac\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00ae\3\2"+
		"\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4#\3\2\2\2\u00b5\u00b9\7\20\2\2\u00b6\u00b8\5\"\22"+
		"\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\21\2\2"+
		"\u00bd%\3\2\2\2\u00be\u00c1\5\"\22\2\u00bf\u00c1\5$\23\2\u00c0\u00be\3"+
		"\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\'\3\2\2\2\u00c2\u00c3\7\24\2\2\u00c3"+
		"\u00c4\7\4\2\2\u00c4\u00c5\5.\30\2\u00c5\u00c6\7\5\2\2\u00c6\u00ca\5&"+
		"\24\2\u00c7\u00c9\5*\26\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cf\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cd\u00ce\7\25\2\2\u00ce\u00d0\5&\24\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0)\3\2\2\2\u00d1\u00d2\7\25\2\2\u00d2\u00d3\7\24\2"+
		"\2\u00d3\u00d4\7\4\2\2\u00d4\u00d5\5.\30\2\u00d5\u00d6\7\5\2\2\u00d6\u00d7"+
		"\5&\24\2\u00d7+\3\2\2\2\u00d8\u00d9\7\26\2\2\u00d9\u00da\7\4\2\2\u00da"+
		"\u00db\5.\30\2\u00db\u00dc\7\5\2\2\u00dc\u00dd\5&\24\2\u00dd-\3\2\2\2"+
		"\u00de\u00df\b\30\1\2\u00df\u00e0\5\60\31\2\u00e0\u00ec\3\2\2\2\u00e1"+
		"\u00e2\f\6\2\2\u00e2\u00e3\t\3\2\2\u00e3\u00eb\5.\30\7\u00e4\u00e5\f\5"+
		"\2\2\u00e5\u00e6\t\4\2\2\u00e6\u00eb\5.\30\6\u00e7\u00e8\f\4\2\2\u00e8"+
		"\u00e9\t\5\2\2\u00e9\u00eb\5.\30\5\u00ea\u00e1\3\2\2\2\u00ea\u00e4\3\2"+
		"\2\2\u00ea\u00e7\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed/\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f5\5\62\32"+
		"\2\u00f0\u00f5\7$\2\2\u00f1\u00f5\7&\2\2\u00f2\u00f5\7#\2\2\u00f3\u00f5"+
		"\7%\2\2\u00f4\u00ef\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\61\3\2\2\2\u00f6\u00fa\5\64\33"+
		"\2\u00f7\u00f8\7\34\2\2\u00f8\u00fa\5\62\32\2\u00f9\u00f6\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\63\3\2\2\2\u00fb\u0102\5\66\34\2\u00fc\u0102\58\35"+
		"\2\u00fd\u00fe\7\4\2\2\u00fe\u00ff\5.\30\2\u00ff\u0100\7\5\2\2\u0100\u0102"+
		"\3\2\2\2\u0101\u00fb\3\2\2\2\u0101\u00fc\3\2\2\2\u0101\u00fd\3\2\2\2\u0102"+
		"\u0105\3\2\2\2\u0103\u0106\7\32\2\2\u0104\u0106\5<\37\2\u0105\u0103\3"+
		"\2\2\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010f\3\2\2\2\u0107"+
		"\u0108\7\34\2\2\u0108\u010f\7#\2\2\u0109\u010a\7\34\2\2\u010a\u010f\7"+
		"%\2\2\u010b\u010f\7\'\2\2\u010c\u010f\7(\2\2\u010d\u010f\5:\36\2\u010e"+
		"\u0101\3\2\2\2\u010e\u0107\3\2\2\2\u010e\u0109\3\2\2\2\u010e\u010b\3\2"+
		"\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\65\3\2\2\2\u0110\u0111"+
		"\7\"\2\2\u0111\67\3\2\2\2\u0112\u0113\7\"\2\2\u0113\u011c\7\4\2\2\u0114"+
		"\u0119\5.\30\2\u0115\u0116\7\r\2\2\u0116\u0118\5.\30\2\u0117\u0115\3\2"+
		"\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u0114\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7\5\2\2\u011f9\3\2\2\2\u0120\u0121"+
		"\t\6\2\2\u0121;\3\2\2\2\u0122\u0123\7\6\2\2\u0123\u0124\5.\30\2\u0124"+
		"\u0125\7\7\2\2\u0125=\3\2\2\2\35AGLXdksy~\u0086\u0091\u0095\u0099\u00b3"+
		"\u00b9\u00c0\u00ca\u00cf\u00ea\u00ec\u00f4\u00f9\u0101\u0105\u010e\u0119"+
		"\u011c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}