package com.xworkz.isarelation.drone;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Drone");
            Drone drone = new Drone();
            drone.takeOff();
            drone.fly();
            drone.land();
            drone.captureVideo();
            drone.sendSignal();

            System.out.println("\nCreating an instance of MilitaryDrone using Drone reference");
            Drone droneRef = new MilitaryDrone();
            droneRef.takeOff();
            droneRef.fly();
            droneRef.land();
            droneRef.captureVideo();
            droneRef.sendSignal();

            System.out.println("\nCreating an instance of MilitaryDrone using subclass reference");
            MilitaryDrone militaryDrone = new MilitaryDrone();
            militaryDrone.takeOff();
            militaryDrone.fly();
            militaryDrone.land();
            militaryDrone.captureVideo();
            militaryDrone.sendSignal();
            militaryDrone.stealthMode();
            militaryDrone.fireMissile();
            militaryDrone.nightVision();
            militaryDrone.remoteControl();
            militaryDrone.jamSignals();
        }
    }

