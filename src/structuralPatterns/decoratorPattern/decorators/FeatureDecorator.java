package structuralPatterns.decoratorPattern.decorators;

import structuralPatterns.decoratorPattern.Application;

public abstract class FeatureDecorator extends Application {

    Application socialMedia;

    public abstract int memory();
}