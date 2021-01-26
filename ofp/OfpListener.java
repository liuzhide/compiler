// Generated from Ofp.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OfpParser}.
 */
public interface OfpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OfpParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(OfpParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(OfpParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#function_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunction_decl(OfpParser.Function_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#function_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunction_decl(OfpParser.Function_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(OfpParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(OfpParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#base_type}.
	 * @param ctx the parse tree
	 */
	void enterBase_type(OfpParser.Base_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#base_type}.
	 * @param ctx the parse tree
	 */
	void exitBase_type(OfpParser.Base_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#parm_decl}.
	 * @param ctx the parse tree
	 */
	void enterParm_decl(OfpParser.Parm_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#parm_decl}.
	 * @param ctx the parse tree
	 */
	void exitParm_decl(OfpParser.Parm_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#parm_decls}.
	 * @param ctx the parse tree
	 */
	void enterParm_decls(OfpParser.Parm_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#parm_decls}.
	 * @param ctx the parse tree
	 */
	void exitParm_decls(OfpParser.Parm_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(OfpParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(OfpParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(OfpParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(OfpParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#real}.
	 * @param ctx the parse tree
	 */
	void enterReal(OfpParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#real}.
	 * @param ctx the parse tree
	 */
	void exitReal(OfpParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(OfpParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(OfpParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(OfpParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(OfpParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(OfpParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(OfpParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(OfpParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(OfpParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(OfpParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(OfpParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#calstmt}.
	 * @param ctx the parse tree
	 */
	void enterCalstmt(OfpParser.CalstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#calstmt}.
	 * @param ctx the parse tree
	 */
	void exitCalstmt(OfpParser.CalstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#retstmt}.
	 * @param ctx the parse tree
	 */
	void enterRetstmt(OfpParser.RetstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#retstmt}.
	 * @param ctx the parse tree
	 */
	void exitRetstmt(OfpParser.RetstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(OfpParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(OfpParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(OfpParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(OfpParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(OfpParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(OfpParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(OfpParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(OfpParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#elsestmt}.
	 * @param ctx the parse tree
	 */
	void enterElsestmt(OfpParser.ElsestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#elsestmt}.
	 * @param ctx the parse tree
	 */
	void exitElsestmt(OfpParser.ElsestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(OfpParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(OfpParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(OfpParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(OfpParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(OfpParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(OfpParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expr(OfpParser.Unary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expr(OfpParser.Unary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(OfpParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(OfpParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(OfpParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(OfpParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#cal}.
	 * @param ctx the parse tree
	 */
	void enterCal(OfpParser.CalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#cal}.
	 * @param ctx the parse tree
	 */
	void exitCal(OfpParser.CalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(OfpParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(OfpParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(OfpParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(OfpParser.IndexContext ctx);
}