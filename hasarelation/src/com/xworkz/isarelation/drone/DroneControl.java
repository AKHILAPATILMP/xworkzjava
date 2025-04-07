package com.xworkz.isarelation.drone;

public class DroneControl {

    public void operate(Drone drone) {
        drone.takeOff();
        drone.fly();
        drone.land();
        drone.captureImage();
        drone.checkBattery();

        if (drone instanceof SurveillanceDrone) {
            System.out.println("Casting: Drone is an instance of SurveillanceDrone");
            SurveillanceDrone surveillanceDrone = (SurveillanceDrone) drone;
            surveillanceDrone.enableNightVision();
        }
    }
}
