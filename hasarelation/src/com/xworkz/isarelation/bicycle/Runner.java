package com.xworkz.isarelation.bicycle;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartBicycle using Bicycle reference");
            Bicycle bicycleRef = new SmartBicycle();
            bicycleRef.start();
            bicycleRef.pedal();
            bicycleRef.brake();
            bicycleRef.ringBell();
            bicycleRef.stop();

            System.out.println("\nCreating an instance of SmartBicycle using subclass reference");
            SmartBicycle smartBicycle = new SmartBicycle();
            smartBicycle.start();
            smartBicycle.pedal();
            smartBicycle.brake();
            smartBicycle.ringBell();
            smartBicycle.stop();
            smartBicycle.gpsNavigation();
            smartBicycle.electricAssist();
            smartBicycle.autoGearShift();
            smartBicycle.fitnessTracking();
        }
    }

