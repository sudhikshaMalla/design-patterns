package structuralPatterns.decoratorPattern;

import structuralPatterns.decoratorPattern.decorators.Payment;
import structuralPatterns.decoratorPattern.decorators.Reels;
import structuralPatterns.decoratorPattern.decorators.Status;

public class Main {
    public static void main(String[] args) {
        SocialMedia whatsAppV1 = new WhatsApp();
        System.out.println(whatsAppV1.getDescription() + " - " + whatsAppV1.memory() + " MB");

        SocialMedia whatsAppV2 = new Status(new WhatsApp());
        System.out.println(whatsAppV2.getDescription() + " - " + whatsAppV2.memory() + " MB");

        SocialMedia whatsAppV3 = new Payment(new Status(new WhatsApp()));
        System.out.println(whatsAppV3.getDescription() + " - " + whatsAppV3.memory() + " MB");

        SocialMedia instagramV1 = new Instagram();
        System.out.println(instagramV1.getDescription() + " - " + instagramV1.memory() + " MB");

        SocialMedia instagramV2 = new Status(new Instagram());
        System.out.println(instagramV2.getDescription() + " - " + instagramV2.memory() + " MB");

        SocialMedia instagramV3 = new Reels(new Status(new Instagram()));
        System.out.println(instagramV3.getDescription() + " - " + instagramV3.memory() + " MB");

    }
}