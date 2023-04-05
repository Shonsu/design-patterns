package pl.shonsu.patterns.creational.abstractfactory;

import pl.shonsu.patterns.creational.abstractfactory.jeep.JeepFactory;
import pl.shonsu.patterns.creational.abstractfactory.simplecar.SimpleCarFactory;

class Main {
    public static void main(String[] args) {
        Car car = new Car(new JeepFactory());
        car.repaintBody("Red");
        car.openDoor(1L);
        car.spinWheels();
        car.turnOnLights();

        car = new Car(new SimpleCarFactory());
        car.repaintBody("Red");
        car.openDoor(2L);
        car.spinWheels();
        car.turnOnLights();
    }
}
