// Generated from Ofp.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OfpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OfpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OfpParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(OfpParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#function_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_decl(OfpParser.Function_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(OfpParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#base_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_type(OfpParser.Base_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#parm_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParm_decl(OfpParser.Parm_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#parm_decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParm_decls(OfpParser.Parm_declsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(OfpParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(OfpParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#real}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(OfpParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(OfpParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(OfpParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(OfpParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(OfpParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(OfpParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#calstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalstmt(OfpParser.CalstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#retstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetstmt(OfpParser.RetstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(OfpParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(OfpParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(OfpParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(OfpParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#elsestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsestmt(OfpParser.ElsestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#whilestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestmt(OfpParser.WhilestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(OfpParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(OfpParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#unary_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expr(OfpParser.Unary_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(OfpParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(OfpParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#cal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCal(OfpParser.CalContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(OfpParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(OfpParser.IndexContext ctx);
}