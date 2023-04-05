package pl.shonsu.patterns.creational.abstractfactory.jeep;

import pl.shonsu.patterns.creational.abstractfactory.Body;

class JeepBody implements Body {
    @Override
    public void repaint(String color) {
        System.out.println("Jeep body has been repainted to " + color);
    }
}
