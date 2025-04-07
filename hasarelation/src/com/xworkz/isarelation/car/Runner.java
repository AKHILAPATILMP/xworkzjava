package com.xworkz.isarelation.car;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Car");
        Car basicCar = new Car();
        basicCar.start();
        basicCar.drive();
        basicCar.brake();
        basicCar.honk();
        basicCar.refuel();

        System.out.println("\nCreating an instance of SportsCar using Car reference");
        Car carRef = new SportsCar();
        carRef.start();
        carRef.drive();
        carRef.brake();
        carRef.honk();
        carRef.refuel();

        System.out.println("\nCreating an instance of SportsCar using subclass reference");
        SportsCar sportsCar = new SportsCar();
        sportsCar.start();
        sportsCar.drive();
        sportsCar.brake();
        sportsCar.honk();
        sportsCar.refuel();
        sportsCar.boost();

        System.out.println("\nCalling Garage for servicing (with casting)");
        Garage garage = new Garage();
        garage.service(basicCar);
        garage.service(carRef);
        garage.service(sportsCar);
    }
}
