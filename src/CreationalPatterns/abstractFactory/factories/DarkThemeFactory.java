package CreationalPatterns.abstractFactory.factories;

import CreationalPatterns.abstractFactory.backgrounds.Background;
import CreationalPatterns.abstractFactory.backgrounds.DarkBackground;
import CreationalPatterns.abstractFactory.foregrounds.Foreground;
import CreationalPatterns.abstractFactory.foregrounds.LightForeground;

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