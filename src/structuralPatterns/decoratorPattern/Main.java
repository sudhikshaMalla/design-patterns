package structuralPatterns.decoratorPattern;

import structuralPatterns.decoratorPattern.decorators.Messaging;
import structuralPatterns.decoratorPattern.decorators.Payment;
import structuralPatterns.decoratorPattern.decorators.Reels;
import structuralPatterns.decoratorPattern.decorators.Status;

public class Main {
    public static void main(String[] args) {
        Application whatsApp = new Payment(new Status(new Messaging(new SocialMediaApp())));
        System.out.println(whatsApp.getDescription() + " - " + whatsApp.memory() + " MB");

        Application instagram = new Reels(new Status(new Messaging(new SocialMediaApp())));
        System.out.println(instagram.getDescription() + " - " + instagram.memory() + " MB");

        Application stackOverflow = new QAApp();
        System.out.println(stackOverflow.getDescription() + " - " + stackOverflow.memory() + " MB");

        Application quora = new Messaging(new QAApp());
        System.out.println(quora.getDescription() + " - " + quora.memory() + " MB");

    }
}