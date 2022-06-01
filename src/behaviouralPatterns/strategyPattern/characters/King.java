package behaviouralPatterns.strategyPattern.characters;

import behaviouralPatterns.strategyPattern.traps.GiantBomb;
import behaviouralPatterns.strategyPattern.weapons.Sword;

public class King extends Character{
    public King() {
        weapon = new Sword();
        trap = new GiantBomb();
    }

    @Override
    void displayRole() {
        System.out.println("Role is King!");
    }
}