package structuralPatterns.decoratorPattern;

public abstract class SocialMedia {

    String description = "Social Media App for messaging";

    public String getDescription() {
        return description;
    }

    public abstract int memory();

}