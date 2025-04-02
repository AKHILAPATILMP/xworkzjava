package com.xworkz.isarelation.autocar;

    public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of AutoCar");
            AutoCar autoCar = new AutoCar();
            autoCar.start();
            autoCar.accelerate();
            autoCar.brake();
            autoCar.honk();
            autoCar.stop();

            System.out.println("\nCreating an instance of TeslaCar using AutoCar reference");
            AutoCar autoCarRef = new TeslaCar();
            autoCarRef.start();
            autoCarRef.accelerate();
            autoCarRef.brake();
            autoCarRef.honk();
            autoCarRef.stop();

            System.out.println("\nCreating an instance of TeslaCar using subclass reference");
            TeslaCar teslaCar = new TeslaCar();
            teslaCar.start();
            teslaCar.accelerate();
            teslaCar.brake();
            teslaCar.honk();
            teslaCar.stop();
            teslaCar.autopilot();
            teslaCar.electricDrive();
            teslaCar.selfParking();
            teslaCar.voiceControl();
            teslaCar.regenerativeBraking();
        }
    }


