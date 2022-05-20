package behaviouralPatterns.strategyPattern.characters;

import behaviouralPatterns.strategyPattern.traps.Trap;
import behaviouralPatterns.strategyPattern.weapons.Weapon;

public abstract class Character {
    Weapon weapon;
    Trap trap;

    public void hitEnemy() {
        weapon.hit();
    }

    public void useTrap() {
        trap.use();
    }

    abstract void displayRole();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Trap getTrap() {
        return trap;
    }

    public void setTrap(Trap trap) {
        this.trap = trap;
    }
}