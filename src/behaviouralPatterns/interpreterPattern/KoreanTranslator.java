package behaviouralPatterns.interpreterPattern;

public class KoreanTranslator implements GoogleTranslator{

    @Override
    public void translate(String sentence) {
        if(sentence.equalsIgnoreCase("Thank You")) {
            System.out.println("Gamsahamnida");
        }
        else if(sentence.equalsIgnoreCase("Sorry")) {
            System.out.println("Jebal");
        }
        else {
            System.out.println("Sentence not in grammar");
        }
    }

}