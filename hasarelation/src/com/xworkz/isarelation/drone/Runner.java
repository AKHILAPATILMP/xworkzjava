package com.xworkz.isarelation.drone;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Drone");
        Drone drone = new Drone();
        drone.takeOff();
        drone.fly();
        drone.land();
        drone.captureImage();
        drone.checkBattery();

        System.out.println("\nCreating an instance of SurveillanceDrone using Drone reference");
        Drone droneRef = new SurveillanceDrone();
        droneRef.takeOff();
        droneRef.fly();
        droneRef.land();
        droneRef.captureImage();
        droneRef.checkBattery();

        System.out.println("\nCreating an instance of SurveillanceDrone using subclass reference");
        SurveillanceDrone surveillance = new SurveillanceDrone();
        surveillance.takeOff();
        surveillance.fly();
        surveillance.land();
        surveillance.captureImage();
        surveillance.checkBattery();
        surveillance.enableNightVision();

        System.out.println("\nUsing DroneControl for casting and operations");
        DroneControl control = new DroneControl();
        control.operate(drone);
        control.operate(droneRef);
        control.operate(surveillance);
    }
}
