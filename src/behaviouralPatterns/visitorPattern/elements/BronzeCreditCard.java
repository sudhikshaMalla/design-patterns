package behaviouralPatterns.visitorPattern.elements;

import behaviouralPatterns.visitorPattern.visitors.Offer;

public class BronzeCreditCard implements CreditCard{
    @Override
    public String getName() {
        return "Bronze Credit Card";
    }

    @Override
    public void accept(Offer v) {
        v.visitBronzeCreditCard(this);
    }


}