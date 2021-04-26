/**
 * @newclass
 * @description Clase para representar la alternativa recursive de Declaration
 * @author Joseph
 * @codigo J.56
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class RecDeclaration extends Declaration {

  public RecDeclaration (ProcFuncs pfsAST, SourcePosition thePosition) {
    super (thePosition);
    PFs = pfsAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitRecDeclaration(this, o);
  }

  public Object visitXML(Visitor v, Object o) {
    return v.visitRecDeclaration(this, o);
  }



  public ProcFuncs PFs;
}