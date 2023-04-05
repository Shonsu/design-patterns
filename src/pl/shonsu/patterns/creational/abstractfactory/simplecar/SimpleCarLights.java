package pl.shonsu.patterns.creational.abstractfactory.simplecar;

import pl.shonsu.patterns.creational.abstractfactory.Lights;

class SimpleCarLights implements Lights {
    @Override
    public void turnOnLights() {
        System.out.println("The SimpleCar's lights have been turned on.");
    }
}
