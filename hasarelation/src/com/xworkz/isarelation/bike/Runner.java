package com.xworkz.isarelation.bike;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Bike");
        Bike normalBike = new Bike();
        normalBike.start();
        normalBike.accelerate();
        normalBike.applyBrake();
        normalBike.honk();
        normalBike.stop();

        System.out.println("\nCreating instance of SportBike using Bike reference");
        Bike bikeRef = new SportBike();
        bikeRef.start();
        bikeRef.accelerate();
        bikeRef.applyBrake();
        bikeRef.honk();
        bikeRef.stop();

        System.out.println("\nCreating instance of SportBike using subclass reference");
        SportBike sportBike = new SportBike();
        sportBike.start();
        sportBike.accelerate();
        sportBike.applyBrake();
        sportBike.honk();
        sportBike.stop();
        sportBike.boostMode();

        System.out.println("\nCalling BikeServiceCenter");
        BikeServiceCenter center = new BikeServiceCenter();
        center.service(normalBike);
        center.service(bikeRef);
        center.service(sportBike);
    }
}
