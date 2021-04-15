/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * @newclass
 * Clase para representar un CaseLiteral
 * @author Andres
 * A.26
 */
public class CaseLiteral extends AST {
    
    public CaseLiteral(Terminal tAST, SourcePosition thePosition) {
        super(thePosition);
        T = tAST;
    }
    
    
    public Object visit(Visitor v, Object o) {
        return v.visitCaseLiteral(this, o);
    }
    
    public Terminal T;
    
}
