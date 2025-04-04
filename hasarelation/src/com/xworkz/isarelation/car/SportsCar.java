package com.xworkz.isarelation.car;
public class SportsCar extends Car {

    public SportsCar() {
        super();
        System.out.println("SportsCar constructor is running - subclass");
    }

    @Override
    public void start() {
        System.out.println("SportsCar is starting with turbo ignition - subclass");
    }

    @Override
    public void stop() {
        System.out.println("SportsCar is stopping with high-performance brakes - subclass");
    }

    @Override
    public void accelerate() {
        System.out.println("SportsCar is accelerating with turbo boost - subclass");
    }

    @Override
    public void applyBrakes() {
        System.out.println("SportsCar brakes applied with ABS system - subclass");
    }

    public void enableNitro() {
        System.out.println("SportsCar Nitro Boost activated - subclass");
    }

    public void openSunroof() {
        System.out.println("SportsCar sunroof is opening - subclass");
    }
}
