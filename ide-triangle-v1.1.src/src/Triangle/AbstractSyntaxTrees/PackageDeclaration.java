/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * @newclass
 * Represents a PackageDeclaration AST
 * @author Andres
 * A.125
 */
public class PackageDeclaration extends AST {
    
    public PackageDeclaration(PackageIdentifier piAST, Declaration dAST, 
            SourcePosition thePosition) {
        super(thePosition);
        
        PI = piAST;
        D = dAST;
    }
    
     public Object visit(Visitor v, Object o) {
        return v.visitPackageDeclaration(this, o);
    }
    
    public PackageIdentifier PI;
    public Declaration D;
    
}
