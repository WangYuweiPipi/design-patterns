package per.design.patterns.observer;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {
    private ArrayList observers;
    private float temp;
    private float humidity;
    private float pressure;

    public ConcreteSubject() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {

    }
}
