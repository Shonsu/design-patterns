package pl.shonsu.patterns.creational.abstractfactory.simplecar;

import pl.shonsu.patterns.creational.abstractfactory.Body;

class SimpleCarBody implements Body {
    @Override
    public void repaint(String color) {
        System.out.println("SimpleCar body has been repainted to " + color);
    }

}
