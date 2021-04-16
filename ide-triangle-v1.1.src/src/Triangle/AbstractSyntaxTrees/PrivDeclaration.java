/**
 * @newclass
 * @description Clase para representar la alternativa private de Declaration
 * @author Joseph
 * @codigo J.57
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class PrivDeclaration extends Declaration {

  public PrivDeclaration (Declaration d1AST, Declaration d2AST, SourcePosition thePosition) {
    super (thePosition);
    D1 = d1AST;
    D2 = d2AST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitPrivDeclaration(this, o);
  }



  public Declaration D1,D2;
}
