package structuralPatterns.decoratorPattern.decorators;

import structuralPatterns.decoratorPattern.Application;

public class Messaging extends FeatureDecorator{

    public Messaging(Application socialMedia) {
        this.socialMedia = socialMedia;
    }

    @Override
    public String getDescription() {
        return socialMedia.getDescription() + " with messaging";
    }

    @Override
    public int memory() {
        return socialMedia.memory() + 5;
    }

}