package behaviouralPatterns.strategyPattern.weapons;

public class BowAndArrow implements Weapon{
    @Override
    public void hit() {
        System.out.println("Hit enemy using Bow and Arrow - 10 points scored!");
    }
}