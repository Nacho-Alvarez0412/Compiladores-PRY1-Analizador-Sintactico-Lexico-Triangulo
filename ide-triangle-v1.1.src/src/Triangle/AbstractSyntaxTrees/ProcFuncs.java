/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @newclass
 * @description Clase para representar un AST de dos o más procedures-functions
 * @author Joseph
 * @codigo J.33
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public abstract class ProcFuncs extends AST {

  public ProcFuncs (SourcePosition thePosition) {
    super (thePosition);
  }
}