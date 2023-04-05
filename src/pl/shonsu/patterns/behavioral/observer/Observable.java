package pl.shonsu.patterns.behavioral.observer;

interface Observable {
    void attach(String event, Observer observer);

    void detach(String event, Observer observer);

    void notifyObservers(String event);
}
