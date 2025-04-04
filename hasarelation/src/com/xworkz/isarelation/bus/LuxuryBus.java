package com.xworkz.isarelation.bus;

public class LuxuryBus extends Bus {

    public LuxuryBus() {
        super();
        System.out.println("LuxuryBus constructor is running - subclass");
    }

    @Override
    public void start() {
        System.out.println("LuxuryBus is starting with smooth ignition - subclass");
    }

    @Override
    public void stop() {
        System.out.println("LuxuryBus is stopping with air brakes - subclass");
    }

    @Override
    public void accelerate() {
        System.out.println("LuxuryBus is accelerating with powerful engine - subclass");
    }

    @Override
    public void openDoors() {
        System.out.println("LuxuryBus doors are opening automatically - subclass");
    }

    public void enableAC() {
        System.out.println("LuxuryBus AC is turned on - subclass");
    }

    public void provideEntertainment() {
        System.out.println("LuxuryBus entertainment system is running - subclass");
    }
}
