// Generated from src/grammar/SimpleLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpleLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(SimpleLangParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SimpleLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SimpleLangParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(SimpleLangParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(SimpleLangParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(SimpleLangParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#forCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCond(SimpleLangParser.ForCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(SimpleLangParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(SimpleLangParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(SimpleLangParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#readStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(SimpleLangParser.ReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SimpleLangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SimpleLangParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#logicalOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOr(SimpleLangParser.LogicalOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#logicalAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAnd(SimpleLangParser.LogicalAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(SimpleLangParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#relational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(SimpleLangParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#additive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive(SimpleLangParser.AdditiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#multiplicative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative(SimpleLangParser.MultiplicativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(SimpleLangParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(SimpleLangParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SimpleLangParser.TypeContext ctx);
}