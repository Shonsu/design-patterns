package pl.shonsu.patterns.creational.abstractfactory.jeep;

import pl.shonsu.patterns.creational.abstractfactory.*;

public class JeepFactory implements CarFactory {
    @Override
    public Wheels createWheels() {
        return new JeepWheels();
    }

    @Override
    public Body createBody() {
        return new JeepBody();
    }

    @Override
    public Doors createDoors() {
        return new JeepDoors();
    }

    @Override
    public Lights createLights() {
        return new JeepLights();
    }
}
