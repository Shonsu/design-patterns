package pl.shonsu.patterns.creational.abstractfactory.jeep;

import pl.shonsu.patterns.creational.abstractfactory.Wheels;

class JeepWheels implements Wheels {
    @Override
    public void spin() {
        System.out.println("Jeep wheels are spinning.");
    }
}
