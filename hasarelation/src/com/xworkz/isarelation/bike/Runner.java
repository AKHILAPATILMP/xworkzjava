package com.xworkz.isarelation.bike;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SportsBike using Bike reference");
            Bike bikeRef = new SportsBike();
            bikeRef.start();
            bikeRef.accelerate();
            bikeRef.brake();
            bikeRef.stop();

            System.out.println("\nCreating an instance of SportsBike using subclass reference");
            SportsBike sportsBike = new SportsBike();
            sportsBike.start();
            sportsBike.accelerate();
            sportsBike.brake();
            sportsBike.stop();
            sportsBike.turboBoost();
            sportsBike.aerodynamicMode();
            sportsBike.racingMode();
        }
    }

