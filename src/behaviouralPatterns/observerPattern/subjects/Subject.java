package behaviouralPatterns.observerPattern.subjects;

import behaviouralPatterns.observerPattern.Event;
import behaviouralPatterns.observerPattern.observers.Observer;

public interface Subject {

    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers(Event event);

    public void addEvent(Event event);
}
