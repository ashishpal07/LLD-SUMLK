package DesignPatterns.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    
    List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void unregisterObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for(Observer o : observers) {
            o.update(this);
        }
    }
    
}
