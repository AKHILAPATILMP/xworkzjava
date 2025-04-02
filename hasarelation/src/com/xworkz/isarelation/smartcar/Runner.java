package com.xworkz.isarelation.smartcar;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of SmartCar");
            SmartCar smartCar = new SmartCar();
            smartCar.start();
            smartCar.drive();
            smartCar.brake();
            smartCar.park();
            smartCar.playMusic();

            System.out.println("\nCreating an instance of ElectricSmartCar using SmartCar reference");
            SmartCar smartCarRef = new ElectricSmartCar();
            smartCarRef.start();
            smartCarRef.drive();
            smartCarRef.brake();
            smartCarRef.park();
            smartCarRef.playMusic();

            System.out.println("\nCreating an instance of ElectricSmartCar using subclass reference");
            ElectricSmartCar electricCar = new ElectricSmartCar();
            electricCar.start();
            electricCar.drive();
            electricCar.brake();
            electricCar.park();
            electricCar.playMusic();
            electricCar.chargeBattery();
            electricCar.autopilot();
            electricCar.ecoMode();
            electricCar.selfParking();
            electricCar.voiceControl();
        }
    }

