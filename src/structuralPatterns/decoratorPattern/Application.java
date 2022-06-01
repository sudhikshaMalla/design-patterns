package structuralPatterns.decoratorPattern;

public abstract class Application {

    String description = "Application";

    public String getDescription() {
        return description;
    }

    public abstract int memory();

}