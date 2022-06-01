package creationalPatterns.abstractFactory.backgrounds;

public class LightBackground implements Background{
    @Override
    public void printBackgroundColor() {
        System.out.println("The page has a light background");
    }
}