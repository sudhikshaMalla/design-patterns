package creationalPatterns.abstractFactory.factories;

import creationalPatterns.abstractFactory.backgrounds.Background;
import creationalPatterns.abstractFactory.backgrounds.DarkBackground;
import creationalPatterns.abstractFactory.foregrounds.Foreground;
import creationalPatterns.abstractFactory.foregrounds.LightForeground;

public class DarkThemeFactory implements UIFactory{

    @Override
    public Background createBackground() {
        return new DarkBackground();
    }

    @Override
    public Foreground createForeground() {
        return new LightForeground();
    }
}