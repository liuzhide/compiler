import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class PopSymbolTable extends OfpBaseListener {
    private ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    public ParseTreeProperty<Scope> getSymbolTable() { return scopes; }
    private Scope currentScope = null;
    private Scope currentFunctionSymbol = null; // Useful for later stages
    private int errorCount = 0;
    private int argCount = 0;
    private int varCount = 0;
    int getErrorCount() {return errorCount;}
    @Override public void enterProgram(OfpParser.ProgramContext ctx) {
	// enclosing scope == null for the global/program scope
	currentScope = new Scope(null);
	scopes.put(ctx, currentScope);
    }
    @Override public void enterFunction_decl(OfpParser.Function_declContext ctx) {
	String typeName = null;
	if(ctx.type()!=null)
	    typeName = ctx.type().getText();
	Symbol sym = new Symbol(ctx.ID().getText(),OfpType.getTypeFor(typeName),ctx);
	if(currentScope.defined(sym)) {
	    System.err.print("line "+ctx.getStart().getLine()+":");
	    System.err.println("function "+ctx.ID().getText()+" already defined.");
	    errorCount++;
	}
	else
	    currentScope.define(sym);
	currentScope = new Scope(currentScope);
	scopes.put(ctx, currentScope);
	argCount = 0;
	varCount = 0;
	if(ctx.ID().getText().equals("main") && ctx.parm_decls()==null) {
	    argCount++;
	    varCount++;
	}
    }
    @Override public void exitFunction_decl(OfpParser.Function_declContext ctx) {
	currentScope = currentScope.getEnclosingScope();
    }
	
    @Override public void enterBody(OfpParser.BodyContext ctx) {
	currentScope = new Scope(currentScope);
	scopes.put(ctx, currentScope);
    }
    @Override public void exitBody(OfpParser.BodyContext ctx) {
	currentScope = currentScope.getEnclosingScope();
    }
    @Override public void enterParm_decl(OfpParser.Parm_declContext ctx) {
	Symbol sym = new Symbol(ctx.ID().getText(),OfpType.getTypeFor(ctx.type().getText()),ctx);
	sym.setArgument(true);
	sym.setIndex(argCount++);
	varCount++;
	if(OfpType.equal(sym.getType(),OfpType.getTypeFor("float")))
	    varCount++;
	if(currentScope.defined(sym)) {
	    System.err.print("line "+ctx.getStart().getLine()+":");
	    System.err.println("parameter "+ctx.ID().getText()+" already defined.");
	    errorCount++;
	}
	else
	    currentScope.define(sym);
    }
    @Override public void enterVar_decl(OfpParser.Var_declContext ctx) {
	Symbol sym = new Symbol(ctx.ID().getText(),OfpType.getTypeFor(ctx.type().getText()),ctx);
	sym.setIndex(varCount++);
	if(OfpType.equal(sym.getType(),OfpType.getTypeFor("float")))
	    varCount++;
	if(currentScope.defined(sym)) {
	    System.err.print("line "+ctx.getStart().getLine()+":");
	    System.err.println("variable "+ctx.ID().getText()+" already defined.");
	    errorCount++;
	}
	else
	    currentScope.define(sym);
    }
}
