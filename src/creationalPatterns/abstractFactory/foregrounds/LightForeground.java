package creationalPatterns.abstractFactory.foregrounds;

public class LightForeground implements Foreground{
    @Override
    public void printForegroundColor() {
        System.out.println("The page has a light foreground");
    }
}