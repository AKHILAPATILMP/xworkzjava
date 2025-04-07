package com.xworkz.isarelation.car;

public class Car {

    public Car() {
        System.out.println("Car constructor is running - parent class");
    }

    public void start() {
        System.out.println("Starting the car - parent class");
    }

    public void drive() {
        System.out.println("Driving the car - parent class");
    }

    public void brake() {
        System.out.println("Applying brakes - parent class");
    }

    public void honk() {
        System.out.println("Honking the horn - parent class");
    }

    public void refuel() {
        System.out.println("Refueling with petrol or diesel - parent class");
    }
}
