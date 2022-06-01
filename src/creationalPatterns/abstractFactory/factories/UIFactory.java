package creationalPatterns.abstractFactory.factories;

import creationalPatterns.abstractFactory.backgrounds.Background;
import creationalPatterns.abstractFactory.foregrounds.Foreground;

public interface UIFactory {
    Background createBackground();
    Foreground createForeground();
}