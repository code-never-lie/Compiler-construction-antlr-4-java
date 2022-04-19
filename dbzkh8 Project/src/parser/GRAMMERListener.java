// Generated from .\GRAMMER.g4 by ANTLR 4.10
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GRAMMERParser}.
 */
public interface GRAMMERListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GRAMMERParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GRAMMERParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAMMERParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GRAMMERParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAMMERParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GRAMMERParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAMMERParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GRAMMERParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAMMERParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(GRAMMERParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAMMERParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(GRAMMERParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAMMERParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GRAMMERParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAMMERParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GRAMMERParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAMMERParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(GRAMMERParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAMMERParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(GRAMMERParser.AddContext ctx);
}