package behaviouralPatterns.interpreterPattern;

import java.sql.SQLOutput;

public class JapaneseTranslator implements GoogleTranslator{
    @Override
    public void translate(String sentence) {
        if(sentence.equalsIgnoreCase("Thank You")) {
            System.out.println("Arigato");
        }
        else if(sentence.equalsIgnoreCase("Sorry")) {
            System.out.println("Gomen");
        }
        else {
            System.out.println("Sentence not in grammar");
        }
    }
}