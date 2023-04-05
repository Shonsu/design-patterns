package pl.shonsu.patterns.creational.abstractfactory.jeep;

import pl.shonsu.patterns.creational.abstractfactory.Lights;

class JeepLights implements Lights {
    @Override
    public void turnOnLights() {
        System.out.println("The Jeep's lights have been turned on.");
    }
}
