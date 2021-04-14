package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * @newclass
 * @description Clase para representar un AST de un comando do while loop
 * @author Joseph
 * @codigo J.22
 */
public class DoLoopWhileCommand extends Command {

  public DoLoopWhileCommand (Expression eAST, Command cAST, SourcePosition thePosition) {
    super (thePosition);
    E = eAST;
    C = cAST;
  }
  
  public Object visit(Visitor v, Object o) {
    return v.visitDoLoopWhileCommand(this, o);
  }
  
  public Command C;
  public Expression E;
}