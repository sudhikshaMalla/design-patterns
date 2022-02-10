package CreationalPatterns.abstractFactory.factories;

import CreationalPatterns.abstractFactory.backgrounds.Background;
import CreationalPatterns.abstractFactory.foregrounds.Foreground;

public interface UIFactory {
    Background createBackground();
    Foreground createForeground();
}
