package com.xworkz.isarelation.bike;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Bike");
        Bike bike = new Bike();
        bike.start();
        bike.accelerate();
        bike.applyBrakes();
        bike.fuelCapacity();

        System.out.println("\nCreating an instance of SportsBike using Bike reference");
        Bike sportsBikeRef = new SportsBike();
        sportsBikeRef.start();
        sportsBikeRef.accelerate();
        sportsBikeRef.applyBrakes();
        sportsBikeRef.fuelCapacity();

        System.out.println("\nCreating an instance of SportsBike using subclass reference");
        SportsBike sportsBike = new SportsBike();
        sportsBike.start();
        sportsBike.accelerate();
        sportsBike.applyBrakes();
        sportsBike.fuelCapacity();
    }
}
