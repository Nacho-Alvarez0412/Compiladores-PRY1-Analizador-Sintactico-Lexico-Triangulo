package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * @newclass
 * @description Clase para representar un AST de un comando do until loop
 * @author Joseph
 * @codigo J.23
 */
public class DoLoopUntilCommand extends Command {

  public DoLoopUntilCommand (Expression eAST, Command cAST, SourcePosition thePosition) {
    super (thePosition);
    E = eAST;
    C = cAST;
  }
  
  public Object visit(Visitor v, Object o) {
    return v.visitDoLoopUntilCommand(this, o);
  }
  
  public Command C;
  public Expression E;
}