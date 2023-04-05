package pl.shonsu.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Publisher implements Observable {

    private final Map<String, List<Observer>> observers = new HashMap<>();
    String event;

    public Publisher(String... events) {
        for (String s : events) {
            observers.put(s, new ArrayList<>());
        }
    }

    @Override
    public void attach(String event, Observer observer) {
        List<Observer> eventObservers = this.observers.get(event);
        eventObservers.add(observer);
    }

    @Override
    public void detach(String event, Observer observer) {
        List<Observer> eventObservers = this.observers.get(event);
        eventObservers.remove(observer);
    }

    @Override
    public void notifyObservers(String event) {
        List<Observer> eventObservers = this.observers.get(event);
        if(eventObservers!=null) {
            eventObservers.forEach(Observer::update);
        }
    }

    String getEvent() {
        return event;
    }

    void publishEvent(String event) {
        this.event = "Event: " + event + " has occurred.";
        notifyObservers(event);
    }
}
