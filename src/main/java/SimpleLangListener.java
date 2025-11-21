// Generated from src/grammar/SimpleLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleLangParser}.
 */
public interface SimpleLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(SimpleLangParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(SimpleLangParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SimpleLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SimpleLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SimpleLangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SimpleLangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SimpleLangParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SimpleLangParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(SimpleLangParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(SimpleLangParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(SimpleLangParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(SimpleLangParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#forCond}.
	 * @param ctx the parse tree
	 */
	void enterForCond(SimpleLangParser.ForCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#forCond}.
	 * @param ctx the parse tree
	 */
	void exitForCond(SimpleLangParser.ForCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(SimpleLangParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(SimpleLangParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(SimpleLangParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(SimpleLangParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(SimpleLangParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(SimpleLangParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(SimpleLangParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(SimpleLangParser.ReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimpleLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimpleLangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimpleLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimpleLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOr(SimpleLangParser.LogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOr(SimpleLangParser.LogicalOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAnd(SimpleLangParser.LogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAnd(SimpleLangParser.LogicalAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(SimpleLangParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(SimpleLangParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#relational}.
	 * @param ctx the parse tree
	 */
	void enterRelational(SimpleLangParser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#relational}.
	 * @param ctx the parse tree
	 */
	void exitRelational(SimpleLangParser.RelationalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#additive}.
	 * @param ctx the parse tree
	 */
	void enterAdditive(SimpleLangParser.AdditiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#additive}.
	 * @param ctx the parse tree
	 */
	void exitAdditive(SimpleLangParser.AdditiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative(SimpleLangParser.MultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative(SimpleLangParser.MultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(SimpleLangParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(SimpleLangParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(SimpleLangParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(SimpleLangParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SimpleLangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SimpleLangParser.TypeContext ctx);
}