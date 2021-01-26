import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class PythonCodeGenerator extends OfpBaseVisitor<String> {
    private ParseTreeProperty<Scope> scopes;
    private Scope currentScope;
    // see Issue 2
    private int depth = 0;
    private HashMap<Integer,String> indentCache = new HashMap<Integer,String>();
    private String indent(int indentLevel) {
	String ind = indentCache.get(indentLevel);
	if (ind == null) {
	    ind = "";
	    for (int i=0; i < indentLevel; i++)
		ind += "    "; // four spaces
	    indentCache.put(indentLevel, ind);
	}
	return ind;
    }
    // see Issue 5
    private static HashSet<String> reservedIds = new HashSet<String>(Arrays.asList("False", "None", "True", "and", "as", "assert", "async", "await", "break", "class", "continue", "def", "del", "elif", "else", "except", "finally", "for", "from", "global", "if", "import", "in", "is", "lambda", "nonlocal", "not", "or","pass", "raise", "return", "try", "while", "with", "yield", "ArithmeticError", "AssertionError", "AttributeError", "BaseException", "BlockingIOError", "BrokenPipeError", "BufferError", "BytesWarning", "ChildProcessError", "ConnectionAbortedError", "ConnectionError", "ConnectionRefusedError", "ConnectionResetError", "DeprecationWarning", "EOFError", "Ellipsis", "EnvironmentError", "Exception", "False", "FileExistsError", "FileNotFoundError", "FloatingPointError", "FutureWarning", "GeneratorExit", "IOError", "ImportError", "ImportWarning", "IndentationError", "IndexError", "InterruptedError", "IsADirectoryError", "KeyError", "KeyboardInterrupt", "LookupError", "MemoryError", "NameError", "None", "NotADirectoryError", "NotImplemented", "NotImplementedError", "OSError", "OverflowError", "PendingDeprecationWarning", "PermissionError", "ProcessLookupError", "RecursionError", "ReferenceError", "ResourceWarning", "RuntimeError", "RuntimeWarning", "StopAsyncIteration", "StopIteration", "SyntaxError", "SyntaxWarning", "SystemError", "SystemExit", "TabError", "TimeoutError", "True", "TypeError", "UnboundLocalError", "UnicodeDecodeError", "UnicodeEncodeError", "UnicodeError", "UnicodeTranslateError", "UnicodeWarning", "UserWarning", "ValueError", "Warning", "ZeroDivisionError", "__build_class__", "__debug__", "__doc__", "__import__", "__loader__", "__name__", "__package__", "__spec__", "abs", "all", "any", "ascii", "bin", "bool", "bytearray", "bytes", "callable", "chr", "classmethod", "compile", "complex", "copyright", "credits", "delattr", "dict", "dir", "divmod", "enumerate", "eval", "exec", "exit", "filter", "float", "format", "frozenset", "getattr", "globals", "hasattr", "hash", "help", "hex", "id", "input", "int", "isinstance", "issubclass", "iter", "len", "license", "list", "locals", "map", "max", "memoryview", "min", "next", "object", "oct", "open", "ord", "pow", "print", "property", "quit", "range", "repr", "reversed", "round", "set", "setattr", "slice", "sorted", "staticmethod", "str", "sum", "super", "tuple", "type", "vars", "zip"));
    private static String getSafePythonId(String id) {
	if (reservedIds.contains(id))
	    // Underscore is illegal in OFP identifiers,
	    // so no chance of collision with other IDs
	    return "ofp_" + id;
	else
	    return id;
    }
    // see Issue 6
    private String getUniqueVariableId(String id, Symbol symbol) {
	if(symbol==null)
	    return getSafePythonId(id) + "_" + currentScope.getLevel();
	return getSafePythonId(id) + "_" + symbol.getLevel();//System.identityHashCode(symbol);
    }
    private boolean needParen(OfpParser.ExprContext ctx) {
	if(ctx.factor()==null)
	    return true;
	if(ctx.factor().unary_expr()==null)
	    return false;
	if(ctx.factor().unary_expr().primary()==null)
	    return true;
	if(ctx.factor().unary_expr().primary().SUB()!=null)
	    return true;
	return false;
    }
    public PythonCodeGenerator(ParseTreeProperty<Scope> scopes) {
	this.scopes = scopes;
    }
    @Override
    public String visitProgram(OfpParser.ProgramContext ctx) {
	currentScope = scopes.get(ctx);
	StringBuilder buf = new StringBuilder();
	// main function must be generated last!
	OfpParser.Function_declContext main = null;
	for (int i=0; i<ctx.function_decl().size();i++) {
	    OfpParser.Function_declContext p = (OfpParser.Function_declContext) ctx.function_decl(i);
	    String fName = p.ID().getText();
	    if (fName.equals("main"))
		main = p; // defer the visit until after the rest of the functions
	    else
		buf.append(visit(p));
	}
	buf.append(visit(main));
	return buf.toString();
    }
    @Override
    public String visitBool(OfpParser.BoolContext ctx) {
	String b = ctx.getChild(0).getText();
	if (b.equals("true"))
	    return "True";
	else
	    return "False";
    }
    @Override public String visitItem(OfpParser.ItemContext ctx) {
	return ctx.getText();
    }
    @Override
    public String visitData(OfpParser.DataContext ctx) {
	if(ctx.item().size()>0) {
	    StringBuilder buf = new StringBuilder();
	    buf.append( visit(ctx.item(0)) );
	    for (int i=1; i<ctx.item().size();i++) {
		buf.append(", ").append( visit(ctx.item(i)) );
	    }
	    return "[" + buf.toString() + "]";
	} else
	    {
		String tp = ctx.base_type().getText();
		String expr = visit(ctx.expr());
		if (tp.equals("int")) {
		    return "[0]*"+expr; // "[0]*N" used in Python to produce
		} // a list of N duplicate values
		else if (tp.equals("float")) {
		    return "[0.0]*"+expr;
		} else {
		    return "[’’]*"+expr;
		}
	    }
    }
    @Override public String visitFunction_decl(OfpParser.Function_declContext ctx) {
	StringBuilder buf = new StringBuilder();
	String sbody;
	currentScope = scopes.get(ctx);
	if(ctx.ID().getText().equals("main")) {
	    sbody = visit(ctx.block());
	    if (sbody.equals("")) // see Issue 3
		buf.append(indent(depth)).append("pass").append("\n");
	    else
		buf.append(sbody);
	    currentScope = currentScope.getEnclosingScope();
	    return buf.toString();
	}
	buf.append(indent(depth));
	buf.append("def "+getSafePythonId(ctx.ID().getText())+"(");
	if(ctx.parm_decls()!=null && ctx.parm_decls().parm_decl().size()>0) {
	    buf.append(visit(ctx.parm_decls().parm_decl(0)));
	    for(int i=1;i<ctx.parm_decls().parm_decl().size();i++)
		buf.append(","+visit(ctx.parm_decls().parm_decl(i)));
	}
	buf.append("):\n");
	depth++;
	sbody = visit(ctx.block());
	if (sbody.equals("")) // see Issue 3
	    buf.append(indent(depth)).append("pass").append("\n");
	else
	    buf.append(sbody);
	depth--;
	currentScope = currentScope.getEnclosingScope();
	return buf.toString();
    }
    @Override
    public String visitBody(OfpParser.BodyContext ctx) {
	currentScope = scopes.get(ctx);
	depth++;
	StringBuilder buf = new StringBuilder();
	buf.append(visitChildren(ctx));
	if (buf.length() == 0) // see Issue 3
	    buf.append(indent(depth)).append("pass").append("\n");
	depth--;
	currentScope = currentScope.getEnclosingScope();
	return buf.toString();
    }
    @Override
    public String visitBlock(OfpParser.BlockContext ctx) {
	StringBuilder buf = new StringBuilder();
	for(int i=0;i<ctx.stmt().size();i++)
	    buf.append(visit(ctx.stmt(i)));
	return buf.toString();
    }
    @Override public String visitVar_decl(OfpParser.Var_declContext ctx) {
	if(ctx.init()!=null) {
	    StringBuilder buf = new StringBuilder();
	    buf.append(indent(depth)).append(getUniqueVariableId(ctx.ID().getText(),null));
	    buf.append(" = ").append(visit(ctx.init())).append(";\n");
	    return buf.toString();
	}
	return "";
    }
    @Override public String visitParm_decl(OfpParser.Parm_declContext ctx) {
	StringBuilder buf = new StringBuilder();
	buf.append(getUniqueVariableId(ctx.ID().getText(),null));
	return buf.toString();
	
    }
    @Override public String visitAssign(OfpParser.AssignContext ctx) {
	StringBuilder buf = new StringBuilder();
	buf.append(indent(depth));
	buf.append(visit(ctx.variable()));
	if(ctx.index()!=null) {
	    buf.append(visit(ctx.index()));
	}
	buf.append(" = "+visit(ctx.expr())+"\n");
	return buf.toString();
    }
    @Override public String visitPrint(OfpParser.PrintContext ctx) {
	StringBuilder buf = new StringBuilder();
	buf.append(indent(depth));
	buf.append("print("+visit(ctx.expr()));
	if(ctx.PRINT().getText().equals("print"))
	    buf.append(",end=''");
	buf.append(")\n");
	return buf.toString();
    }
    @Override public String visitCalstmt(OfpParser.CalstmtContext ctx) {
	StringBuilder buf = new StringBuilder();
	buf.append(indent(depth));
	buf.append(visit(ctx.cal()));
	buf.append("\n");
	return buf.toString();
    }
    @Override public String visitRetstmt(OfpParser.RetstmtContext ctx) {
	StringBuilder buf = new StringBuilder();
	buf.append(indent(depth));
	buf.append("return "+visit(ctx.expr()));
	buf.append("\n");
	return buf.toString();
    }
    @Override public String visitIfstmt(OfpParser.IfstmtContext ctx) {
	StringBuilder buf = new StringBuilder();
	buf.append(indent(depth));
	buf.append("if "+visit(ctx.expr())+":\n");
	depth++;
	buf.append(visit(ctx.body(0)));
	depth--;
	for(int i=0;i<ctx.elsestmt().size();i++)
	    buf.append(visit(ctx.elsestmt(i)));
	if(ctx.body().size()==2) {
	    buf.append(indent(depth)+"else:\n");
	    depth++;
	    buf.append(visit(ctx.body(1)));
	    depth--;
	}
	return buf.toString();
    }
    @Override public String visitElsestmt(OfpParser.ElsestmtContext ctx) {
	StringBuilder buf = new StringBuilder();
	buf.append(indent(depth));
	buf.append("elif "+visit(ctx.expr())+":\n");
	depth++;
	buf.append(visit(ctx.body()));
	depth--;
	return buf.toString();
    }
    @Override public String visitWhilestmt(OfpParser.WhilestmtContext ctx) {
	StringBuilder buf = new StringBuilder();
	buf.append(indent(depth));
	buf.append("while "+visit(ctx.expr())+":\n");
	depth++;
	buf.append(visit(ctx.body()));
	depth--;
	return buf.toString();
    }
    @Override public String visitExpr(OfpParser.ExprContext ctx) {
	if(ctx.factor()!=null) {return visit(ctx.factor());}
	else if(ctx.expr().size()==2) {
	    StringBuilder buf = new StringBuilder();
	    if(needParen(ctx.expr(0))) buf.append("(");
	    buf.append(visit(ctx.expr(0)));
	    if(needParen(ctx.expr(0))) buf.append(")");
	    if(ctx.MUL()!=null) buf.append("*");
	    else if(ctx.DIV()!=null) buf.append("/");
	    else if(ctx.ADD()!=null) buf.append("+");
	    else if(ctx.SUB()!=null) buf.append("-");
	    else if(ctx.LT()!=null) buf.append("<");
	    else if(ctx.GT()!=null) buf.append(">");
	    else if(ctx.EQ()!=null) buf.append("==");
	    if(needParen(ctx.expr(1))) buf.append("(");
	    buf.append(visit(ctx.expr(1)));
	    if(needParen(ctx.expr(1))) buf.append(")");
	    return buf.toString();
	}
	return "";
    }
    @Override public String visitFactor(OfpParser.FactorContext ctx) {
	if(ctx.unary_expr()!=null) return visit(ctx.unary_expr());
	else return ctx.getText();
    }
    @Override public String visitVariable(OfpParser.VariableContext ctx) {
	Symbol sym = currentScope.resolve(ctx.ID().getText());
	return getUniqueVariableId(sym.getName(),sym);
    }
    @Override public String visitUnary_expr(OfpParser.Unary_exprContext ctx) {
	if(ctx.primary()!=null) return visit(ctx.primary());
	else if(ctx.unary_expr()!=null) {
	    StringBuilder buf = new StringBuilder();
	    buf.append("-");
	    buf.append(visit(ctx.unary_expr()));
	    return buf.toString();
	}
	return "";
    }
    @Override public String visitPrimary(OfpParser.PrimaryContext ctx) {
	StringBuilder buf = new StringBuilder();
	if(ctx.LEN()!=null) buf.append("len(");
	if(ctx.variable()!=null) buf.append(visit(ctx.variable()));
	else if(ctx.cal()!=null) buf.append(visit(ctx.cal()));
	else if(ctx.expr()!=null) buf.append("("+visit(ctx.expr())+")");
	else if(ctx.bool()!=null) buf.append(visit(ctx.bool()));
	else buf.append(ctx.getText());
	if(ctx.LEN()!=null) buf.append(")");
	else if(ctx.index()!=null) buf.append(visit(ctx.index()));
	return buf.toString();
    }
    @Override public String visitIndex(OfpParser.IndexContext ctx) {
	StringBuilder buf = new StringBuilder();
	buf.append("[").append(visit(ctx.expr())).append("]");
	return buf.toString();
    }
    @Override public String visitCal(OfpParser.CalContext ctx) {
	StringBuilder buf = new StringBuilder();
	buf.append(getSafePythonId(ctx.ID().getText())+"(");
	for(int i=0;i<ctx.expr().size();i++) {
	    if(i>0) buf.append(",");
	    buf.append(visit(ctx.expr(i)));
	}
	buf.append(")");
	return buf.toString();
    }
}
