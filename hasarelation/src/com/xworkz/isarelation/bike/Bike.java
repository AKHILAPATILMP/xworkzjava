package com.xworkz.isarelation.bike;

public class Bike {

    public Bike() {
        System.out.println("Bike constructor is running - parent class");
    }

    public void start() {
        System.out.println("Starting the bike - parent class");
    }

    public void stop() {
        System.out.println("Stopping the bike - parent class");
    }

    public void accelerate() {
        System.out.println("Accelerating the bike - parent class");
    }

    public void applyBrake() {
        System.out.println("Applying brake - parent class");
    }

    public void honk() {
        System.out.println("Honking - parent class");
    }
}
