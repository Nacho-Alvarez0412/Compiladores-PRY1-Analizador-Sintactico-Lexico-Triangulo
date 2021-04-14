package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * @newclass
 * @description Clase para representar un AST de un comando loo for do
 * @author Joseph
 * @codigo J.24
 */
public class ForLoopDoCommand extends Command {

  public ForLoopDoCommand (Identifier iAST, Expression e1AST, Expression e2AST,Command cAST, SourcePosition thePosition) {
    super (thePosition);
    I = iAST;
    E1 = e1AST;
    E2 = e2AST;
    C = cAST;
  }
  
  public Object visit(Visitor v, Object o) {
    return v.visitForLoopDoCommand(this, o);
  }
  
  public Identifier I;
  public Expression E1,E2;
  public Command C;
}
