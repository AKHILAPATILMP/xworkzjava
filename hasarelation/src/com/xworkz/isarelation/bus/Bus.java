package com.xworkz.isarelation.bus;

public class Bus {

    public Bus() {
        System.out.println("Bus constructor is running - parent class");
    }

    public void start() {
        System.out.println("Starting the bus - parent class");
    }

    public void stop() {
        System.out.println("Stopping the bus - parent class");
    }

    public void accelerate() {
        System.out.println("Accelerating the bus - parent class");
    }

    public void openDoor() {
        System.out.println("Opening bus door - parent class");
    }

    public void checkFuel() {
        System.out.println("Checking diesel level - parent class");
    }
}
