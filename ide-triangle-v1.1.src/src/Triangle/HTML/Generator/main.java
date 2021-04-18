/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.HTML.Generator;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        HTML_Generator generator = new HTML_Generator();
        generator.setCode("D:\\Repositorios\\PRY1-Compiladores\\Programas\\NachoMamapichas.tri");
       
        generator.generateHTML();
        
        
        
        
    }
    
}
