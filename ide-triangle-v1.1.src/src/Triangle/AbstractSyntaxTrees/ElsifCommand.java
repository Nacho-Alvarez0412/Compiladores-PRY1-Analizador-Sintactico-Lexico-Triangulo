/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 *
 * @author Andres
 */
public abstract class ElsifCommand extends Command {
    
    public ElsifCommand(SourcePosition thePosition) {
        super(thePosition);
    }
}
