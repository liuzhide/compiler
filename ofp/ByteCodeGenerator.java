
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;
import org.objectweb.asm.util.CheckClassAdapter;
import org.objectweb.asm.util.TraceClassVisitor;
public class ByteCodeGenerator extends OfpBaseVisitor<Void> implements Opcodes {
    private ParseTreeProperty<Scope> scopes = null;
    private Scope currentScope,rootScope;
    private ParseTreeProperty<OfpType> types = null;
    private ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);	
    private GeneratorAdapter mg = null;	      
    public ByteCodeGenerator(ParseTreeProperty<Scope> scopes,ParseTreeProperty<OfpType> types) {
	this.scopes = scopes;
	this.types = types;
    }
    @Override
    public Void visitProgram(OfpParser.ProgramContext ctx) {
	currentScope = scopes.get(ctx);
	rootScope = currentScope;
	cw.visit(V1_1, ACC_PUBLIC, "Hello", null, "java/lang/Object", null);
	// Code for the (implicit) constructor
        Method m = Method.getMethod("void <init> ()");
        mg = new GeneratorAdapter(ACC_PUBLIC, m, null, null,cw);
        mg.loadThis();
        mg.invokeConstructor(Type.getType(Object.class), m);
        mg.returnValue();
        mg.endMethod();
	
	visitChildren(ctx);
	cw.visitEnd();
	try {
	    // Save
	    byte[] code = cw.toByteArray();
	    FileOutputStream fos = new FileOutputStream("Hello.class");
	    fos.write(code);
	    fos.close();
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {

	}
	return null;
    }
    private String getJType(String tp) {
	String tp1 = tp.replace(" ","");
	String jtp;
	int len = tp1.length();
	boolean isArray = false;
	if(tp1.charAt(len-1)==']') {
	    isArray = true;
	    tp1 = tp1.substring(0,len-2);
	}
	if(tp1.equals("float")) jtp = "double";
	else if(tp1.equals("bool")) jtp = "boolean";
	else if(tp1.equals("string")) jtp = "String";
	else jtp = tp1;
	if(isArray) jtp += "[]";
	return jtp;
    }
    private String getProtoType(OfpParser.Function_declContext ctx) {
	StringBuilder buf = new StringBuilder();
	if(ctx.ID().getText().equals("main") && ctx.parm_decls()==null)
	    return "void main(String[])";
	if(ctx.type()!=null) buf.append(getJType(ctx.type().getText()));
	else buf.append("void");
	buf.append(" "+ctx.ID().getText()+"(");
	if(ctx.parm_decls()!=null) {
	    for(int i=0;i<ctx.parm_decls().parm_decl().size();i++) {
		if(i>0) buf.append(",");
		buf.append(getJType(ctx.parm_decls().parm_decl(i).type().getText()));
	    }
	}
	buf.append(")");
	return buf.toString();

    }
    @Override public Void visitFunction_decl(OfpParser.Function_declContext ctx) {
	String proto = getProtoType(ctx);
	currentScope = scopes.get(ctx);
	Method m = Method.getMethod(proto);
	mg = new GeneratorAdapter(ACC_PUBLIC + ACC_STATIC, m, null, null, cw);
	visit(ctx.block());
	//if(ctx.type()!=null)
	mg.returnValue();
	mg.endMethod();
	currentScope = currentScope.getEnclosingScope();
	return null;
    }
	@Override
    public Void visitBool(OfpParser.BoolContext ctx) {
	String b = ctx.getChild(0).getText();
	if (b.equals("true"))
	    mg.push(new Boolean(true));
	else
	    mg.push(new Boolean(false));
		return null;
    }
    @Override
    public Void visitBody(OfpParser.BodyContext ctx) {
	currentScope = scopes.get(ctx);
	visitChildren(ctx);
	currentScope = currentScope.getEnclosingScope();
	return null;
    }
    @Override public Void visitVar_decl(OfpParser.Var_declContext ctx) {
	if(ctx.init()!=null) {
	    Symbol sym = currentScope.resolve(ctx.ID().getText());
	    visit(ctx.init());
	    if(sym.isArgument())
		mg.storeArg(sym.getIndex());
	    else if(sym.getType().getName().equals("int"))
		mg.storeLocal(sym.getIndex(),Type.INT_TYPE);
	    else if(sym.getType().getName().equals("float"))
		mg.storeLocal(sym.getIndex(),Type.DOUBLE_TYPE);
	    else if(sym.getType().getName().equals("char"))
		mg.storeLocal(sym.getIndex(),Type.CHAR_TYPE);
	    else if(sym.getType().getName().equals("bool"))
		mg.storeLocal(sym.getIndex(),Type.BOOLEAN_TYPE);
	    else if(sym.getType().getName().equals("string"))
		mg.storeLocal(sym.getIndex(),Type.getType("Ljava/lang/String;"));
	    else if(sym.getType().getName().equals("int[]"))
		mg.storeLocal(sym.getIndex(),Type.getType("[I"));
	    else if(sym.getType().getName().equals("float[]"))
		mg.storeLocal(sym.getIndex(),Type.getType("[D"));
	    else if(sym.getType().getName().equals("char[]"))
		mg.storeLocal(sym.getIndex(),Type.getType("[C"));
	}
	return null;
    }
    @Override public Void visitItem(OfpParser.ItemContext ctx) {
	try {
	    if(ctx.integer()!=null)
	    mg.push(Integer.parseInt(ctx.getText()));
	    else if(ctx.real()!=null)
		mg.push(Double.parseDouble(ctx.getText()));
	    else if(ctx.CHAR()!=null)
		mg.push(ctx.getText().charAt(1));
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return null;
    }
    @Override
    public Void visitData(OfpParser.DataContext ctx) {
	if(ctx.item().size()>0) {
	    int len = ctx.item().size();
	    mg.push(new Integer(len));
	    if(ctx.item(0).integer()!=null) mg.newArray(Type.INT_TYPE);
	    else if(ctx.item(0).real()!=null) mg.newArray(Type.DOUBLE_TYPE);
	    else mg.newArray(Type.CHAR_TYPE);
	    for(int i=0;i<len;i++) {
		mg.dup();
		mg.push(new Integer(i));
		visit(ctx.item(i));
		if(ctx.item(0).integer()!=null) mg.arrayStore(Type.INT_TYPE);
		else if(ctx.item(0).real()!=null) mg.arrayStore(Type.DOUBLE_TYPE);
		else mg.arrayStore(Type.CHAR_TYPE);
	    }
			
	} else {
	    String tp = ctx.base_type().getText();
	    visit(ctx.expr());
	    if (tp.equals("int")) mg.newArray(Type.INT_TYPE);
	    else if(tp.equals("float")) mg.newArray(Type.DOUBLE_TYPE);
	    else mg.newArray(Type.CHAR_TYPE);
	}
	return null;
    }
    @Override public Void visitAssign(OfpParser.AssignContext ctx) {
	Symbol sym = currentScope.resolve(ctx.variable().getText());
	if(ctx.index()!=null) {
	    OfpType tp = types.get(ctx.expr());
	    if(sym.isArgument())
		mg.loadArg(sym.getIndex());
	    else if(tp.getName().equals("int"))
		mg.loadLocal(sym.getIndex(),Type.getType("[I"));
	    else if(tp.getName().equals("float"))
		mg.loadLocal(sym.getIndex(),Type.getType("[D"));
	    else if(tp.getName().equals("char"))
		mg.loadLocal(sym.getIndex(),Type.getType("[C"));
	    visit(ctx.index().expr());
	    visit(ctx.expr());
	    if(tp.getName().equals("int"))
		mg.arrayStore(Type.INT_TYPE);
	    else if(tp.getName().equals("float"))
		mg.arrayStore(Type.DOUBLE_TYPE);
	    else if(tp.getName().equals("char"))
		mg.arrayStore(Type.CHAR_TYPE);
	} else {
	    visit(ctx.expr());
	    if(sym.isArgument())
		mg.storeArg(sym.getIndex());
	    else if(sym.getType().getName().equals("int"))
		mg.storeLocal(sym.getIndex(),Type.INT_TYPE);
	    else if(sym.getType().getName().equals("float"))
		mg.storeLocal(sym.getIndex(),Type.DOUBLE_TYPE);
	    else if(sym.getType().getName().equals("char"))
		mg.storeLocal(sym.getIndex(),Type.CHAR_TYPE);
	    else if(sym.getType().getName().equals("bool"))
		mg.storeLocal(sym.getIndex(),Type.BOOLEAN_TYPE);
	    else if(sym.getType().getName().equals("string"))
		mg.storeLocal(sym.getIndex(),Type.getType("Ljava/lang/String;"));
	    else if(sym.getType().getName().equals("int[]"))
		mg.storeLocal(sym.getIndex(),Type.getType("[I"));
	    else if(sym.getType().getName().equals("float[]"))
		mg.storeLocal(sym.getIndex(),Type.getType("[D"));
	    else if(sym.getType().getName().equals("char[]"))
		mg.storeLocal(sym.getIndex(),Type.getType("[C"));
	}
	return null;
    }
    @Override public Void visitPrint(OfpParser.PrintContext ctx) {
	String printName = "println";
	String prot;
	if(ctx.PRINT().getText().equals("print"))
	    printName = "print";
	prot = "void "+printName+"("+getJType(types.get(ctx.expr()).getName())+")";
	mg.getStatic(Type.getType(System.class), "out",Type.getType(PrintStream.class));
	visit(ctx.expr());
	mg.invokeVirtual(Type.getType(PrintStream.class), Method.getMethod(prot));
	return null;
    }
    @Override public Void visitCal(OfpParser.CalContext ctx) {
	Symbol sym = rootScope.resolve(ctx.ID().getText());
	OfpParser.Function_declContext fun = (OfpParser.Function_declContext)sym.getDecl();
	String proto = getProtoType(fun);
	for(int i=0;i<ctx.expr().size();i++)
	    visit(ctx.expr(i));
	mg.invokeStatic(Type.getType("L"+"Hello"+";"),Method.getMethod(proto));
	return null;
    }
    @Override public Void visitRetstmt(OfpParser.RetstmtContext ctx) {
	visit(ctx.expr());
	mg.returnValue();
	return null;
    }
    @Override public Void visitIfstmt(OfpParser.IfstmtContext ctx) {
	Label exitLb = new Label();
	Label elsLb = new Label();
	visit(ctx.expr());
	mg.ifZCmp(GeneratorAdapter.EQ,elsLb);
	visit(ctx.body(0));
	mg.goTo(exitLb);
	mg.mark(elsLb);
	for(int i=0;i<ctx.elsestmt().size();i++) {
	    visit(ctx.elsestmt(i).expr());
	    elsLb = new Label();
	    mg.ifZCmp(GeneratorAdapter.EQ,elsLb);
	    visit(ctx.elsestmt(i).body());
	    mg.goTo(exitLb);
	    mg.mark(elsLb);
	}
	if(ctx.body().size()==2)
	    visit(ctx.body(1));
	mg.mark(exitLb);
	return null;
    }
    @Override public Void visitWhilestmt(OfpParser.WhilestmtContext ctx) {
	Label exitWhile = new Label();
	mg.goTo(exitWhile);
	Label enterWhile = mg.mark();
	visit(ctx.body());
	mg.mark(exitWhile);
	visit(ctx.expr());
	mg.ifZCmp(GeneratorAdapter.NE,enterWhile);
	return null;
    }
    @Override public Void visitFactor(OfpParser.FactorContext ctx) {
	try {
	    if(ctx.INT()!=null || ctx.PINT()!=null)
		mg.push(Integer.parseInt(ctx.getText()));
	    else if(ctx.REAL()!=null || ctx.PREAL()!=null)
		mg.push(Double.parseDouble(ctx.getText()));
	    else visit(ctx.unary_expr());
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return null;
    }
    @Override public Void visitUnary_expr(OfpParser.Unary_exprContext ctx) {
	if(ctx.primary()!=null)
	    visit(ctx.primary());
	else if(ctx.unary_expr()!=null) {
	    OfpType tp = types.get(ctx.unary_expr());
	    visit(ctx.unary_expr());
	    if(tp.getName().equals("int"))
	    mg.math(GeneratorAdapter.NEG, Type.INT_TYPE);
	    else
		mg.math(GeneratorAdapter.NEG,Type.DOUBLE_TYPE);
	}
	return null;
    }
    @Override public Void visitVariable(OfpParser.VariableContext ctx) {
	Symbol sym = currentScope.resolve(ctx.ID().getText());
	if(sym.isArgument())
	    mg.loadArg(sym.getIndex());
	else if(sym.getType().getName().equals("int"))
	    mg.loadLocal(sym.getIndex(),Type.INT_TYPE);
	else if(sym.getType().getName().equals("float"))
	    mg.loadLocal(sym.getIndex(),Type.DOUBLE_TYPE);
	else if(sym.getType().getName().equals("char"))
	    mg.loadLocal(sym.getIndex(),Type.CHAR_TYPE);
	else if(sym.getType().getName().equals("bool"))
	    mg.loadLocal(sym.getIndex(),Type.BOOLEAN_TYPE);
	else if(sym.getType().getName().equals("string"))
	    mg.loadLocal(sym.getIndex(),Type.getType("Ljava/lang/String;"));
	else if(sym.getType().getName().equals("int[]"))
	    mg.loadLocal(sym.getIndex(),Type.getType("[I"));
	else if(sym.getType().getName().equals("float[]"))
	    mg.loadLocal(sym.getIndex(),Type.getType("[D"));
	else if(sym.getType().getName().equals("char[]"))
	    mg.loadLocal(sym.getIndex(),Type.getType("[C"));
	return null;
    }
    @Override public Void visitPrimary(OfpParser.PrimaryContext ctx) {
	//if(ctx.LEN()!=null) buf.append("len(");
	OfpType tp = null;
	if(ctx.variable()!=null) {
	    visit(ctx.variable());
	    tp = types.get(ctx.variable());
	}
	else if(ctx.cal()!=null) {
	    visit(ctx.cal());
	    tp = types.get(ctx.cal());
	}
	else if(ctx.expr()!=null) {
	    visit(ctx.expr());
	    tp = types.get(ctx.expr());
	}
	else if(ctx.bool()!=null) visit(ctx.bool());
	else {
	    try {
		if(ctx.PINT()!=null)
		    mg.push(Integer.parseInt("-"+ctx.getText()));
		else if(ctx.PREAL()!=null)
		    mg.push(Double.parseDouble("-"+ctx.getText()));
		else if(ctx.CHAR()!=null)
		    mg.push(ctx.getText().charAt(1));
		else if(ctx.STRING()!=null) {
		    int len = ctx.getText().length();
		    mg.push(ctx.getText().substring(1,len-1));
		}
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	}
	if(ctx.LEN()!=null && tp!=null) {
	    if(tp.getName().equals("string"))
		mg.invokeVirtual(Type.getType("Ljava/lang/String;"),Method.getMethod("int length()"));
	    else mg.arrayLength();
	}
	else if(ctx.index()!=null && tp!=null) {
	    if(tp.getName().equals("string")) {
		visit(ctx.index().expr());
		mg.invokeVirtual(Type.getType("Ljava/lang/String;"),Method.getMethod("char charAt(int)"));
	    } else if(tp.getName().equals("int[]")) {
		visit(ctx.index().expr());
		mg.arrayLoad(Type.INT_TYPE);
	    }
	    else if(tp.getName().equals("float[]")) {
		visit(ctx.index().expr());
		mg.arrayLoad(Type.DOUBLE_TYPE);
	    }
	    else if(tp.getName().equals("char[]")) {
		visit(ctx.index().expr());
		mg.arrayLoad(Type.CHAR_TYPE);
	    }
	}
	return null;
    }
 
    @Override public Void visitExpr(OfpParser.ExprContext ctx) {
	if(ctx.factor()!=null)
	    visit(ctx.factor());
	else if(ctx.expr().size()==2) {
	    int op = GeneratorAdapter.EQ;
	    OfpType otp = types.get(ctx.expr(0));
	    Type tp;
	    if(otp.getName().equals("int"))
		tp = Type.INT_TYPE;
	    else if(otp.getName().equals("float"))
		tp = Type.DOUBLE_TYPE;
	    else
		tp = Type.CHAR_TYPE;
	    visit(ctx.expr(0));
	    visit(ctx.expr(1));
	    if(ctx.MUL()!=null) op=GeneratorAdapter.MUL;
	    else if(ctx.DIV()!=null) op=GeneratorAdapter.DIV;
	    else if(ctx.ADD()!=null) op=GeneratorAdapter.ADD;
	    else if(ctx.SUB()!=null) op=GeneratorAdapter.SUB;
	    if(op==GeneratorAdapter.EQ) {
		Label tl=new Label();
		Label el=new Label();
		if(ctx.LT()!=null) op=GeneratorAdapter.LT;
		else if(ctx.GT()!=null) op=GeneratorAdapter.GT;
		mg.ifCmp(tp,op,tl);
		mg.push(false);
		mg.goTo(el);
		mg.mark(tl);
		mg.push(true);
		mg.mark(el);
	    } else
		mg.math(op,tp);
	}
	return null;
    }
}
