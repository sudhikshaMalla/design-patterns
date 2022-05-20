package behaviouralPatterns.visitorPattern.visitors;

import behaviouralPatterns.visitorPattern.elements.BronzeCreditCard;
import behaviouralPatterns.visitorPattern.elements.SilverCreditCard;

public class FoodOffer implements Offer{
    @Override
    public void visitBronzeCreditCard(BronzeCreditCard bronze) {
        System.out.println("Bronze card provides 5% discount on purchasing food");
    }

    @Override
    public void visitSilverCreditCard(SilverCreditCard silver) {
        System.out.println("Silver card provides 10% discount on purchasing food");
    }
}