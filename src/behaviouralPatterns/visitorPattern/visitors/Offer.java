package behaviouralPatterns.visitorPattern.visitors;

import behaviouralPatterns.visitorPattern.elements.BronzeCreditCard;
import behaviouralPatterns.visitorPattern.elements.SilverCreditCard;

public interface Offer {

    void visitBronzeCreditCard(BronzeCreditCard bronze);
    void visitSilverCreditCard(SilverCreditCard silver);

}
