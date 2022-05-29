package CreationalPatterns.abstractFactory;

import CreationalPatterns.abstractFactory.backgrounds.Background;
import CreationalPatterns.abstractFactory.factories.DarkThemeFactory;
import CreationalPatterns.abstractFactory.factories.LightThemeFactory;
import CreationalPatterns.abstractFactory.factories.UIFactory;
import CreationalPatterns.abstractFactory.foregrounds.Foreground;

public class Main {
    public static void main(String[] args) {
        UIFactory lightThemeFactory = new LightThemeFactory();
        Background lightThemeBackground = lightThemeFactory.createBackground();
        Foreground lightThemeForeground = lightThemeFactory.createForeground();
        lightThemeBackground.printBackgroundColor();
        lightThemeForeground.printForegroundColor();

        UIFactory darkThemeFactory = new DarkThemeFactory();
        Background darkThemeBackground = darkThemeFactory.createBackground();
        Foreground darkThemeForeground = darkThemeFactory.createForeground();
        darkThemeBackground.printBackgroundColor();
        darkThemeForeground.printForegroundColor();
    }
}
