package structuralPatterns.decoratorPattern.decorators;

import structuralPatterns.decoratorPattern.SocialMedia;

public class Status extends FeatureDecorator{

    public Status(SocialMedia socialMedia) {
        this.socialMedia = socialMedia;
    }

    @Override
    public String getDescription() {
        return socialMedia.getDescription() + " with status";
    }

    @Override
    public int memory() {
        return socialMedia.memory() + 20;
    }
}