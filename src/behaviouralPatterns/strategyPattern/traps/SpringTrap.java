package behaviouralPatterns.strategyPattern.traps;

public class SpringTrap implements Trap{
    @Override
    public void use() {
        System.out.println("Used Spring Trap - 30 pints scored");
    }
}