package pl.shonsu.patterns.creational.abstractfactory;

public interface CarFactory {
    Wheels createWheels();
    Body createBody();
    Doors createDoors();
    Lights createLights();
}
