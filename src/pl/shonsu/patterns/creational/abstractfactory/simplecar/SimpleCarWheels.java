package pl.shonsu.patterns.creational.abstractfactory.simplecar;

import pl.shonsu.patterns.creational.abstractfactory.Wheels;

class SimpleCarWheels implements Wheels {
    @Override
    public void spin() {
        System.out.println("SimpleCar wheels are spinning.");
    }
}
