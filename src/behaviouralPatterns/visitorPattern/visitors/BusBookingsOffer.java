package behaviouralPatterns.visitorPattern.visitors;

import behaviouralPatterns.visitorPattern.elements.BronzeCreditCard;
import behaviouralPatterns.visitorPattern.elements.SilverCreditCard;

public class BusBookingsOffer implements Offer {
    @Override
    public void visitBronzeCreditCard(BronzeCreditCard bronze) {
        System.out.println("Bronze card provides 8% discount on bus bookings");
    }

    @Override
    public void visitSilverCreditCard(SilverCreditCard silver) {
        System.out.println("Silver card provides 20% discount on bus bookings");
    }
}