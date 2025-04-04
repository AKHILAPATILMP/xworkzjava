package com.xworkz.isarelation.car;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Car");
        Car car = new Car();
        car.start();
        car.stop();
        car.accelerate();
        car.applyBrakes();

        System.out.println("\nCreating an instance of SportsCar using Car reference");
        Car carRef = new SportsCar();
        carRef.start();
        carRef.stop();
        carRef.accelerate();
        carRef.applyBrakes();

        System.out.println("\nCreating an instance of SportsCar using subclass reference");
        SportsCar sportsCar = new SportsCar();
        sportsCar.start();
        sportsCar.stop();
        sportsCar.accelerate();
        sportsCar.applyBrakes();
        sportsCar.enableNitro();
        sportsCar.openSunroof();
    }
}
