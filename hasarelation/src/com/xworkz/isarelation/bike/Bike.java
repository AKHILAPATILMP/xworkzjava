package com.xworkz.isarelation.bike;

public class Bike {

    public Bike() {
        System.out.println("Bike constructor is running - parent class");
    }

    public void start() {
        System.out.println("Starting the bike - parent class");
    }

    public void accelerate() {
        System.out.println("Accelerating the bike - parent class");
    }

    public void applyBrakes() {
        System.out.println("Applying brakes - parent class");
    }

    public void fuelCapacity() {
        System.out.println("Checking fuel capacity - parent class");
    }
}
