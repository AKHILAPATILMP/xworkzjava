package com.xworkz.isarelation.autocar;

public class AutoCarSystem extends AutoCar {

    public AutoCarSystem() {
        super();
        System.out.println("AutoCarSystem constructor is running - subclass");
    }

    @Override
    public void startEngine() {
        System.out.println("AutoCarSystem is starting engine with push button - subclass");
    }

    @Override
    public void stopEngine() {
        System.out.println("AutoCarSystem is stopping engine with safety check - subclass");
    }

    @Override
    public void accelerate() {
        System.out.println("AutoCarSystem is accelerating with cruise control - subclass");
    }

    @Override
    public void brake() {
        System.out.println("AutoCarSystem is applying ABS brakes - subclass");
    }
}
