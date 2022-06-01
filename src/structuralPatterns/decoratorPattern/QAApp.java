package structuralPatterns.decoratorPattern;

public class QAApp extends Application {

    public QAApp() {
        description = "Question and Answer " + description;
    }

    @Override
    public int memory() {
        return 90;
    }
}