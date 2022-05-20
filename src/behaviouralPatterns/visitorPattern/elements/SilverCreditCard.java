package behaviouralPatterns.visitorPattern.elements;

import behaviouralPatterns.visitorPattern.visitors.Offer;

public class SilverCreditCard implements CreditCard{
    @Override
    public String getName() {
        return "Silver Credit Card";
    }

    @Override
    public void accept(Offer v) {
        v.visitSilverCreditCard(this);
    }
}