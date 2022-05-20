package behaviouralPatterns.visitorPattern.elements;

import behaviouralPatterns.visitorPattern.visitors.Offer;

public interface CreditCard {

    String getName();
    void accept(Offer v);

}
