package com.xworkz.isarelation.autocar;

public class AutoCar {

    public AutoCar() {
        System.out.println("AutoCar constructor is running - parent class");
    }

    public void startEngine() {
        System.out.println("Starting engine - parent class");
    }

    public void stopEngine() {
        System.out.println("Stopping engine - parent class");
    }

    public void accelerate() {
        System.out.println("Accelerating the car - parent class");
    }

    public void brake() {
        System.out.println("Applying brake - parent class");
    }
}
