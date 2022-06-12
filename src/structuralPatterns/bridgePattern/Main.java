package structuralPatterns.bridgePattern;

import structuralPatterns.bridgePattern.abstractions.GoogleAssisstant;
import structuralPatterns.bridgePattern.abstractions.Siri;
import structuralPatterns.bridgePattern.abstractions.VoiceAssisstant;
import structuralPatterns.bridgePattern.implementers.App;
import structuralPatterns.bridgePattern.implementers.Facebook;
import structuralPatterns.bridgePattern.implementers.Instagram;

public class Main {
    public static void main(String[] args) {

        App app1 = new Facebook();
        VoiceAssisstant assisstant1 = new Siri(app1);
        assisstant1.openApplication();

        App app2 = new Instagram();
        VoiceAssisstant assisstant2 = new GoogleAssisstant(app2);
        assisstant2.openApplication();

    }
}