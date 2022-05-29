package structuralPatterns.decoratorPattern.decorators;

import structuralPatterns.decoratorPattern.SocialMedia;

public abstract class FeatureDecorator extends SocialMedia {

    SocialMedia socialMedia;

    public abstract int memory();
}