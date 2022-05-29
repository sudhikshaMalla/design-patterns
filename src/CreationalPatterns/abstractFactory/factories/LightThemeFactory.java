package CreationalPatterns.abstractFactory.factories;

import CreationalPatterns.abstractFactory.backgrounds.Background;
import CreationalPatterns.abstractFactory.backgrounds.LightBackground;
import CreationalPatterns.abstractFactory.foregrounds.DarkForeground;
import CreationalPatterns.abstractFactory.foregrounds.Foreground;

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