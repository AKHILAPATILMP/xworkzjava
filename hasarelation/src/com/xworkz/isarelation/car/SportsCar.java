package com.xworkz.isarelation.car;

public class SportsCar extends Car {

    public SportsCar() {
        super();
        System.out.println("SportsCar constructor is running - subclass");
    }

    @Override
    public void start() {
        System.out.println("Starting the sports car with keyless ignition - subclass");
    }

    @Override
    public void drive() {
        System.out.println("Driving at high speed - subclass");
    }

    @Override
    public void brake() {
        System.out.println("Applying high-performance brakes - subclass");
    }

    @Override
    public void honk() {
        System.out.println("Honking with sports horn - subclass");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling with premium petrol - subclass");
    }

    public void boost() {
        System.out.println("Activating turbo boost - only in subclass");
    }
}
