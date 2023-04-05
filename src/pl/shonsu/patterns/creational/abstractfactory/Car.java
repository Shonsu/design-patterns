package pl.shonsu.patterns.creational.abstractfactory;

class Car {
    private final Doors doors;
    private final Body body;
    private final Wheels wheels;
    private final Lights lights;

    public Car(CarFactory carFactory) {
        this.doors = carFactory.createDoors();
        this.body = carFactory.createBody();
        this.wheels = carFactory.createWheels();
        this.lights = carFactory.createLights();
    }

    public void openDoor(Long doorNumber){
        doors.openDoor(doorNumber);
    }

    public void repaintBody(String color){
        body.repaint(color);
    }

    public void spinWheels(){
        wheels.spin();
    }

    public void turnOnLights(){
        lights.turnOnLights();
    }

}
