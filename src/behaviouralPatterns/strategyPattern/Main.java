package behaviouralPatterns.strategyPattern;

import behaviouralPatterns.strategyPattern.characters.Character;
import behaviouralPatterns.strategyPattern.characters.King;
import behaviouralPatterns.strategyPattern.characters.Soldier;
import behaviouralPatterns.strategyPattern.weapons.Sword;

public class Main {
    public static void main(String[] args) {
        Character king1 = new King();
        king1.hitEnemy();
        king1.useTrap();

        Character soldier1 = new Soldier();
        soldier1.hitEnemy();

        soldier1.setWeapon(new Sword());
        soldier1.hitEnemy();
        soldier1.useTrap();
    }
}