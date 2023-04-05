package pl.shonsu.patterns.creational.abstractfactory.simplecar;

import pl.shonsu.patterns.creational.abstractfactory.Doors;

class SimpleCarDoors implements Doors {
    @Override
    public void openDoor(Long doorNumber) {
        System.out.println("Simple door number " + doorNumber + " have been opened.");
    }
}
