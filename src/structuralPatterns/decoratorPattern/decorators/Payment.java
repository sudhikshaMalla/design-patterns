package structuralPatterns.decoratorPattern.decorators;

import structuralPatterns.decoratorPattern.Application;

public class Payment extends FeatureDecorator{

    public Payment(Application socialMedia) {
        this.socialMedia = socialMedia;
    }

    @Override
    public String getDescription() {
        return socialMedia.getDescription() + " with payment";
    }

    @Override
    public int memory() {
        return socialMedia.memory() + 10;
    }
}