package com.xworkz.isarelation.bus;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartBus using Bus reference");
            Bus busRef = new SmartBus();
            busRef.start();
            busRef.accelerate();
            busRef.brake();
            busRef.honk();
            busRef.stop();
            busRef.openDoors();
            busRef.closeDoors();

            System.out.println("\nCreating an instance of SmartBus using subclass reference");
            SmartBus smartBus = new SmartBus();
            smartBus.start();
            smartBus.accelerate();
            smartBus.brake();
            smartBus.honk();
            smartBus.stop();
            smartBus.openDoors();
            smartBus.closeDoors();
            smartBus.gpsNavigation();
            smartBus.automaticDoors();
            smartBus.electricDrive();
            smartBus.smartTicketing();
            smartBus.passengerCounting();
        }
    }

