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
public class HTML_Generator {
    private String code;
    private ArrayList<HTML_Token> tokens;

    
    public HTML_Generator(){
        this.code = "";
        this.tokens = new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<HTML_Token> getTokens() {
        return tokens;
    }

    public void setTokens(ArrayList<HTML_Token> tokens) {
        this.tokens = tokens;
    }
    
    public ArrayList<String> getCodeSections(){
        ArrayList<String> words = new ArrayList<>();
        String word = "";
        
        for (int i = 0 ; i < this.code.length(); i++){
            if(isSpecial(this.code.charAt(i))){
                words.add(word);
                words.add(this.code.charAt(i)+"");
                word = "";
            }
            
            else{
                word = word.concat(this.code.charAt(i)+"");
            }
        }
        
        return words; 
    }
    public ArrayList<HTML_Token> getTokens(ArrayList<String> sections){
        ArrayList<HTML_Token> codeTokens = new ArrayList<>();
        
        for (String preToken : sections){
            HTML_Token token = new HTML_Token(preToken);
            codeTokens.add(token);
        }
        codeTokens = fixComments(codeTokens);
        return codeTokens;
        
    }
    private boolean isSpecial(char charAt) {
        HTML_Token tokenIdentifier = new HTML_Token();
        return (charAt == '\n') || (charAt == ' ') || (charAt == '\t') || (tokenIdentifier.isOperator(charAt+"")) || (tokenIdentifier.isSeparator(charAt+""));
    }

    private ArrayList<HTML_Token> fixComments(ArrayList<HTML_Token> codeTokens) {
        boolean commentZone = false;
        
        for (HTML_Token token : codeTokens){
            if(token.getType() == HTML_Token_Enum.COMMENT)
                commentZone = true;
            if (token.getType() == HTML_Token_Enum.ENTER)
                commentZone = false;
            if(commentZone)
                token.setType(HTML_Token_Enum.COMMENT);
        }
        codeTokens = unifyComments(codeTokens);
        return codeTokens;
        
        
    }

    private ArrayList<HTML_Token> unifyComments(ArrayList<HTML_Token> codeTokens) {
        ArrayList<HTML_Token> unifiedTokens = new ArrayList<>();
        String comment = "";
        
        for(HTML_Token token : codeTokens){
            if(token.getType() == HTML_Token_Enum.COMMENT){
                comment = comment.concat(token.toString());
            }
            else if(token.getType() != HTML_Token_Enum.COMMENT && !comment.isEmpty()){
                
                HTML_Token tempToken = new HTML_Token(comment);
                unifiedTokens.add(tempToken);
                comment = "";
                unifiedTokens.add(token);
            }
            else
                unifiedTokens.add(token);
            
        }
        return unifiedTokens;
    }
    
}
