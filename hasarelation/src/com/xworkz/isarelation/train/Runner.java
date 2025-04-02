package com.xworkz.isarelation.train;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of Train");
            Train train = new Train();
            train.start();
            train.stop();
            train.accelerate();
            train.carryPassengers();
            train.blowHorn();

            System.out.println("\nCreating an instance of BulletTrain using Train reference");
            Train trainRef = new BulletTrain();
            trainRef.start();
            trainRef.stop();
            trainRef.accelerate();
            trainRef.carryPassengers();
            trainRef.blowHorn();

            System.out.println("\nCreating an instance of BulletTrain using subclass reference");
            BulletTrain bulletTrain = new BulletTrain();
            bulletTrain.start();
            bulletTrain.stop();
            bulletTrain.accelerate();
            bulletTrain.carryPassengers();
            bulletTrain.blowHorn();
            bulletTrain.highSpeed();
            bulletTrain.aerodynamicDesign();
            bulletTrain.advancedBraking();
            bulletTrain.automatedControl();
            bulletTrain.luxurySeats();
        }
    }

