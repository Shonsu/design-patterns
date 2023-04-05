package pl.shonsu.patterns.creational.abstractfactory.jeep;

import pl.shonsu.patterns.creational.abstractfactory.Doors;

class JeepDoors implements Doors {
    @Override
    public void openDoor(Long doorNumber) {
        System.out.println("Jeep door number " + doorNumber + " have been opened.");
    }
}
