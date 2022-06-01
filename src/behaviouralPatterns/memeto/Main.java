package behaviouralPatterns.memeto;

public class Main {
    public static void main(String[] args) {
        Originator textEditor = new Originator();

        textEditor.addText("Hi!");
        textEditor.addText("This ");
        textEditor.addText("is ");
        textEditor.addText("Sudhiskha");

        textEditor.backspace(9);
        textEditor.undo();
        textEditor.undo();
        textEditor.undo();
        textEditor.redo();
        textEditor.addText("Sudhiksha");
    }
}
