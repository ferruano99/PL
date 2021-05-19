// Generated from C:/Users/ferna/Desktop/Universidad/3/2cuatri/PL/PracticaObligatoria/src\scripts.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link scriptsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface scriptsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link scriptsParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(scriptsParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link scriptsParser#program2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram2(scriptsParser.Program2Context ctx);
	/**
	 * Visit a parse tree produced by {@link scriptsParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart(scriptsParser.PartContext ctx);
	/**
	 * Visit a parse tree produced by {@link scriptsParser#restpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestpart(scriptsParser.RestpartContext ctx);
	/**
	 * Visit a parse tree produced by {@link scriptsParser#restpart2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestpart2(scriptsParser.Restpart2Context ctx);
	/**
	 * Visit a parse tree produced by {@link scriptsParser#listparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListparam(scriptsParser.ListparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link scriptsParser#listparam2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListparam2(scriptsParser.Listparam2Context ctx);
	/**
	 * Visit a parse tree produced by {@link scriptsParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(scriptsParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link scriptsParser#blq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlq(scriptsParser.BlqContext ctx);
	/**
	 * Visit a parse tree produced by {@link scriptsParser#sentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist(scriptsParser.SentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link scriptsParser#sentlist2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist2(scriptsParser.Sentlist2Context ctx);
	/**
	 * Visit a parse tree produced by {@link scriptsParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(scriptsParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link scriptsParser#lid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLid(scriptsParser.LidContext ctx);
	/**
	 * Visit a parse tree produced by {@link scriptsParser#lid2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLid2(scriptsParser.Lid2Context ctx);
	/**
	 * Visit a parse tree produced by {@link scriptsParser#asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig(scriptsParser.AsigContext ctx);
	/**
	 * Visit a parse tree produced by {@link scriptsParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(scriptsParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link scriptsParser#funcion2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion2(scriptsParser.Funcion2Context ctx);
	/**
	 * Visit a parse tree produced by {@link scriptsParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(scriptsParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link scriptsParser#exp2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp2(scriptsParser.Exp2Context ctx);
	/**
	 * Visit a parse tree produced by {@link scriptsParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(scriptsParser.OpContext ctx);
}