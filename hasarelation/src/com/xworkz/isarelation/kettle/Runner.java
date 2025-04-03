package com.xworkz.isarelation.kettle;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartKettle using Kettle reference");
            Kettle kettleRef = new SmartKettle();
            kettleRef.fill();
            kettleRef.heat();
            kettleRef.pour();
            kettleRef.clean();
            kettleRef.turnOff();

            System.out.println("\nCreating an instance of SmartKettle using subclass reference");
            SmartKettle smartKettle = new SmartKettle();
            smartKettle.fill();
            smartKettle.heat();
            smartKettle.pour();
            smartKettle.clean();
            smartKettle.turnOff();
            smartKettle.setTemperature();
            smartKettle.autoShutOff();
            smartKettle.scheduleBoiling();
            smartKettle.keepWarm();
            smartKettle.connectToApp();
        }
    }

