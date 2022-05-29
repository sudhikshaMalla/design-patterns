package structuralPatterns.decoratorPattern;

public class WhatsApp extends SocialMedia{

    public WhatsApp() {
        description = "WhatsApp " + description;
    }

    @Override
    public int memory() {
        return 80;
    }
}