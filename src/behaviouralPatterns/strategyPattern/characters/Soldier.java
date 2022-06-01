package behaviouralPatterns.strategyPattern.characters;

import behaviouralPatterns.strategyPattern.traps.SpringTrap;
import behaviouralPatterns.strategyPattern.weapons.BowAndArrow;

public class Soldier extends Character{
    public Soldier() {
        weapon = new BowAndArrow();
        trap = new SpringTrap();
    }

    @Override
    void displayRole() {
        System.out.println("Role is Soldier!");
    }
}