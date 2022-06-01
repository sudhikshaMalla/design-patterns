package behaviouralPatterns.memeto;

public class Memento {

    private StringBuffer text;

    public Memento(StringBuffer text) {
        this.text = new StringBuffer(text);
    }

    public StringBuffer getText() {
        return text;
    }
}
