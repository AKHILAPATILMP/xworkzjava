package com.xworkz.isarelation.bike;

public class SportBike extends Bike {

    public SportBike() {
        super();
        System.out.println("SportBike constructor is running - subclass");
    }

    @Override
    public void start() {
        System.out.println("SportBike starting with electric ignition - subclass");
    }

    @Override
    public void stop() {
        System.out.println("SportBike stopping with disc brakes - subclass");
    }

    @Override
    public void accelerate() {
        System.out.println("SportBike accelerating rapidly - subclass");
    }

    @Override
    public void applyBrake() {
        System.out.println("SportBike applying ABS brake - subclass");
    }

    @Override
    public void honk() {
        System.out.println("SportBike honking with a sporty sound - subclass");
    }

    public void boostMode() {
        System.out.println("SportBike activated boost mode - subclass only method");
    }
}
