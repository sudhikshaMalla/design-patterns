package creationalPatterns.abstractFactory.factories;

import creationalPatterns.abstractFactory.backgrounds.Background;
import creationalPatterns.abstractFactory.backgrounds.LightBackground;
import creationalPatterns.abstractFactory.foregrounds.DarkForeground;
import creationalPatterns.abstractFactory.foregrounds.Foreground;

public class LightThemeFactory implements UIFactory{

    @Override
    public Background createBackground() {
        return new LightBackground();
    }

    @Override
    public Foreground createForeground() {
        return new DarkForeground();
    }
}