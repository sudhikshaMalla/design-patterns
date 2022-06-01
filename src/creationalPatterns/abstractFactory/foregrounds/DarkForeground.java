package creationalPatterns.abstractFactory.foregrounds;

public class DarkForeground implements Foreground{
    @Override
    public void printForegroundColor() {
        System.out.println("The page has a dark foreground");
    }
}