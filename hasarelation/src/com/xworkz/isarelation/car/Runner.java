package com.xworkz.isarelation.car;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of TeslaCar using Car reference");
            Car carRef = new TeslaCar();
            carRef.start();
            carRef.accelerate();
            carRef.brake();
            carRef.honk();
            carRef.stop();

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

