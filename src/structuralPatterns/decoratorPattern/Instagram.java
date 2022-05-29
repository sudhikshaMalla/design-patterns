package structuralPatterns.decoratorPattern;

public class Instagram extends SocialMedia{

    public Instagram() {
        description = "Instagram " + description;
    }

    @Override
    public int memory() {
        return 90;
    }
}