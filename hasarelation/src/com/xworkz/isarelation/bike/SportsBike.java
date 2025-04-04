package com.xworkz.isarelation.bike;

public class SportsBike extends Bike {

    public SportsBike() {
        super();
        System.out.println("SportsBike constructor is running - subclass");
    }

    @Override
    public void start() {
        System.out.println("Starting the sports bike with keyless ignition - subclass");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating with turbo boost - subclass");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Applying ABS brakes - subclass");
    }

    @Override
    public void fuelCapacity() {
        System.out.println("SportsBike has higher fuel efficiency - subclass");
    }
}


