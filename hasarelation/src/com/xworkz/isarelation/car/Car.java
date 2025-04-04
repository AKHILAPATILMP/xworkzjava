package com.xworkz.isarelation.car;
public class Car {

    public Car() {
        System.out.println("Car constructor is running - parent class");
    }

    public void start() {
        System.out.println("Car is starting - parent class");
    }

    public void stop() {
        System.out.println("Car is stopping - parent class");
    }

    public void accelerate() {
        System.out.println("Car is accelerating - parent class");
    }

    public void applyBrakes() {
        System.out.println("Car brakes applied - parent class");
    }
}
