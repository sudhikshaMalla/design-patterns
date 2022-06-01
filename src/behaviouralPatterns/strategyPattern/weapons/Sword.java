package behaviouralPatterns.strategyPattern.weapons;

public class Sword implements Weapon{
    @Override
    public void hit() {
        System.out.println("Hit enemy using sword - 30 points scored!");
    }
}