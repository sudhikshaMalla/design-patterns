package creationalPatterns.abstractFactory;

import creationalPatterns.abstractFactory.backgrounds.Background;
import creationalPatterns.abstractFactory.factories.DarkThemeFactory;
import creationalPatterns.abstractFactory.factories.LightThemeFactory;
import creationalPatterns.abstractFactory.factories.UIFactory;
import creationalPatterns.abstractFactory.foregrounds.Foreground;

public class Main {
    public static void main(String[] args) {
        UIFactory lightThemeFactory = new LightThemeFactory();
        Background lightThemeBackground = lightThemeFactory.createBackground();
        Foreground lightThemeForeground = lightThemeFactory.createForeground();
        lightThemeBackground.printBackgroundColor();
        lightThemeForeground.printForegroundColor();

        System.out.println("");

        UIFactory darkThemeFactory = new DarkThemeFactory();
        Background darkThemeBackground = darkThemeFactory.createBackground();
        Foreground darkThemeForeground = darkThemeFactory.createForeground();
        darkThemeBackground.printBackgroundColor();
        darkThemeForeground.printForegroundColor();
    }
}