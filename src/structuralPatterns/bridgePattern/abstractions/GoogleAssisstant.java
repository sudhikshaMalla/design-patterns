package structuralPatterns.bridgePattern.abstractions;

import structuralPatterns.bridgePattern.implementers.App;

public class GoogleAssisstant extends VoiceAssisstant{

    public GoogleAssisstant(App app) {
        application = app;
    }

    @Override
    public void openApplication() {
        application.openApp();
    }

}