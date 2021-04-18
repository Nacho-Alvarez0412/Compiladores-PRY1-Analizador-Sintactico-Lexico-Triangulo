/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package html.generator;

import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HTML_Generator generator = new HTML_Generator();
        generator.setCode("!Calculates the fibonnaci sequence.\n" +
                          "!Luis Leopoldo Pérez, Sep. 2005\n" +
                          "\n" +
                          "let\n" +
                          "\tvar i: Integer;\n" +
                          "\tvar j: Integer;\n" +
                          "\tvar k: String;\n" +
                          "\tvar num: Integer\n" +
                          "in\n" +
                          "\n" +
                          "\ti := 5;\n" +
                          "\tk := 'H';\n" +
                          "\tloop do \n" +
                          "\t\tputint(i);\n" +
                          "\t\ti := i-1\n" +
                          "\tuntil i > 10\n" +
                          "\tend;\n" +
                          "\tnothing\n" +
                          "end");
        
        generator.generateHTML();
        
        
        
        
    }
    
}
