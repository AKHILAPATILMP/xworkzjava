package com.xworkz.isarelation.drone;

public class SurveillanceDrone extends Drone {

    public SurveillanceDrone() {
        super();
        System.out.println("SurveillanceDrone constructor is running - subclass");
    }

    @Override
    public void takeOff() {
        System.out.println("SurveillanceDrone taking off silently - subclass");
    }

    @Override
    public void fly() {
        System.out.println("SurveillanceDrone flying at high altitude - subclass");
    }

    @Override
    public void land() {
        System.out.println("SurveillanceDrone landing with precision GPS - subclass");
    }

    @Override
    public void captureImage() {
        System.out.println("SurveillanceDrone capturing HD image - subclass");
    }

    @Override
    public void checkBattery() {
        System.out.println("SurveillanceDrone battery check via app - subclass");
    }

    public void enableNightVision() {
        System.out.println("SurveillanceDrone enabling night vision - subclass only");
    }
}
