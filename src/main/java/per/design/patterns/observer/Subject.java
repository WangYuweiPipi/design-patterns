package per.design.patterns.observer;

public interface Subject {

    void registerObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObserver(); // 当主题改变时，就会调用此方法，以通知所有的观察者
}
