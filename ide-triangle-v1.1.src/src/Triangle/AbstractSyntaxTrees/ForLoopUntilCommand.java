package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * @newclass
 * @description Clase para representar un AST de un comando loop for until
 * @author Joseph
 * @codigo J.26
 */
public class ForLoopUntilCommand extends Command {

  public ForLoopUntilCommand (Identifier iAST, Expression e1AST, Expression e2AST, Expression e3AST, Command cAST,SourcePosition thePosition) {
    super (thePosition);
    I = iAST;
    E1 = e1AST;
    E2 = e2AST;
    E3 = e3AST;
    C = cAST;
  }
  
  public Object visit(Visitor v, Object o) {
    return v.visitForLoopUntilCommand(this, o);
  }
  
  public Identifier I;
  public Expression E1,E2,E3;
  public Command C;
  
}