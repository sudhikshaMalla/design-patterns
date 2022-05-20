package behaviouralPatterns.visitorPattern;

import behaviouralPatterns.visitorPattern.elements.BronzeCreditCard;
import behaviouralPatterns.visitorPattern.elements.CreditCard;
import behaviouralPatterns.visitorPattern.elements.SilverCreditCard;
import behaviouralPatterns.visitorPattern.visitors.BusBookingsOffer;
import behaviouralPatterns.visitorPattern.visitors.FoodOffer;

public class Main {
    public static void main(String[] args) {
        CreditCard bronze = new BronzeCreditCard();
        CreditCard silver = new SilverCreditCard();

        bronze.accept(new FoodOffer());
        bronze.accept(new BusBookingsOffer());
        System.out.println("");

        silver.accept(new FoodOffer());
        silver.accept(new BusBookingsOffer());

    }
}