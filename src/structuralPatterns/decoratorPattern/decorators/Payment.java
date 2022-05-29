package structuralPatterns.decoratorPattern.decorators;

import structuralPatterns.decoratorPattern.SocialMedia;

public class Payment extends FeatureDecorator{

    public Payment(SocialMedia socialMedia) {
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