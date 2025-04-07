package com.xworkz.isarelation.bus;

public class ElectricBus extends Bus {

    public ElectricBus() {
        super();
        System.out.println("ElectricBus constructor is running - subclass");
    }

    @Override
    public void start() {
        System.out.println("Starting electric motor - subclass");
    }

    @Override
    public void stop() {
        System.out.println("Stopping electric bus silently - subclass");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric bus accelerating smoothly - subclass");
    }

    @Override
    public void openDoor() {
        System.out.println("Opening door with electric control - subclass");
    }

    @Override
    public void checkFuel() {
        System.out.println("Checking battery level - subclass");
    }

    public void chargeBattery() {
        System.out.println("Charging the electric bus - subclass only method");
    }
}
