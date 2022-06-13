package structuralPatterns.bridgePattern.abstractions;

import structuralPatterns.bridgePattern.implementers.App;

public class Siri extends VoiceAssisstant{

    public Siri(App app) {
        application = app;
    }

    @Override
    public void openApplication() {
        application.openApp();
    }
}