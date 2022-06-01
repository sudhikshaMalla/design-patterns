package behaviouralPatterns.strategyPattern.traps;

public class GiantBomb implements Trap{
    @Override
    public void use() {
        System.out.println("Used Giant Bomb - 50 pints scored");
    }
}