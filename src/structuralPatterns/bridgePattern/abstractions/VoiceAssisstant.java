package structuralPatterns.bridgePattern.abstractions;

import structuralPatterns.bridgePattern.implementers.App;

public abstract class VoiceAssisstant {

    public App application;

    public abstract void openApplication();

}