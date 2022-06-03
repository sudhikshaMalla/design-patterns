package behaviouralPatterns.interpreterPattern;

public class Main {
    public static void main(String[] args) {

        GoogleTranslator japaneseTranslator = new JapaneseTranslator();
        japaneseTranslator.translate("thank you");

        System.out.println();

        GoogleTranslator koreanTranslator = new KoreanTranslator();
        koreanTranslator.translate("SORRY");
        
    }
}