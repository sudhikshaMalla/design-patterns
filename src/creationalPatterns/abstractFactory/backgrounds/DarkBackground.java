package creationalPatterns.abstractFactory.backgrounds;

public class DarkBackground implements Background{
    @Override
    public void printBackgroundColor() {
        System.out.println("The page has a dark background");
    }
}