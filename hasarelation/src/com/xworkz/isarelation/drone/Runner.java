package com.xworkz.isarelation.drone;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Drone");
        Drone drone = new Drone();
        drone.takeOff();
        drone.fly();
        drone.land();
        drone.captureImage();

        System.out.println("\nCreating an instance of DeliveryDrone using Drone reference");
        Drone droneRef = new DeliveryDrone();
        droneRef.takeOff();
        droneRef.fly();
        droneRef.land();
        droneRef.captureImage();

        System.out.println("\nCreating an instance of DeliveryDrone using subclass reference");
        DeliveryDrone deliveryDrone = new DeliveryDrone();
        deliveryDrone.takeOff();
        deliveryDrone.fly();
        deliveryDrone.land();
        deliveryDrone.captureImage();
    }
}
