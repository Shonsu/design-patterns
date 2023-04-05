package pl.shonsu.patterns.creational.abstractfactory.simplecar;

import pl.shonsu.patterns.creational.abstractfactory.*;

public class SimpleCarFactory implements CarFactory {
    @Override
    public Wheels createWheels() {
        return new SimpleCarWheels();
    }

    @Override
    public Body createBody() {
        return new SimpleCarBody();
    }

    @Override
    public Doors createDoors() {
        return new SimpleCarDoors();
    }

    @Override
    public Lights createLights() {
        return new SimpleCarLights();
    }
}
