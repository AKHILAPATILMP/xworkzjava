package com.xworkz.isarelation.escooter;

public class Runner
{
        public static void main(String[] args) {
            System.out.println("Creating an instance of EScooter");
            EScooter eScooter = new EScooter();
            eScooter.start();
            eScooter.accelerate();
            eScooter.brake();
            eScooter.charge();
            eScooter.stop();

            System.out.println("\nCreating an instance of OlaScooter using EScooter reference");
            EScooter eScooterRef = new OlaScooter();
            eScooterRef.start();
            eScooterRef.accelerate();
            eScooterRef.brake();
            eScooterRef.charge();
            eScooterRef.stop();

            System.out.println("\nCreating an instance of OlaScooter using subclass reference");
            OlaScooter olaScooter = new OlaScooter();
            olaScooter.start();
            olaScooter.accelerate();
            olaScooter.brake();
            olaScooter.charge();
            olaScooter.stop();
            olaScooter.ecoMode();
            olaScooter.cruiseControl();
            olaScooter.gpsNavigation();
            olaScooter.bluetoothConnectivity();
            olaScooter.reverseMode();
        }
    }


