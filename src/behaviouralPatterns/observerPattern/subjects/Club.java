package behaviouralPatterns.observerPattern.subjects;

import behaviouralPatterns.observerPattern.Event;
import behaviouralPatterns.observerPattern.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Club implements Subject{

    private String name;
    private List<Observer> observers;
    private List<Event> events;

    public Club(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
        this.events = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Event event) {
        for (Observer observer : observers) {
            System.out.println(name + " :: " + "Hello " + observer.getName() + ", We have a new event coming soon - " + event.toString());
        }
    }

    @Override
    public void addEvent(Event event) {
        events.add(event);
        notifyObservers(event);
    }


}