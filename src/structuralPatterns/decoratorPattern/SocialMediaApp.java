package structuralPatterns.decoratorPattern;

public class SocialMediaApp extends Application {

    public SocialMediaApp() {
        description = "Social Media " + description;
    }

    @Override
    public int memory() {
        return 80;
    }
}