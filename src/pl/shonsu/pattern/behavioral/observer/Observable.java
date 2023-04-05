package pl.shonsu.pattern.behavioral.observer;

interface Observable {
    void attach(String event, Observer observer);

    void detach(String event, Observer observer);

    void notifyObservers(String event);
}
