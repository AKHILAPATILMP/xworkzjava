package com.xworkz.isarelation.autocar;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of AutoCar");
        AutoCar car = new AutoCar();
        car.startEngine();
        car.stopEngine();
        car.accelerate();
        car.brake();

        System.out.println("\nCreating an instance of AutoCarSystem using AutoCar reference");
        AutoCar car1 = new AutoCarSystem();
        car1.startEngine();
        car1.stopEngine();
        car1.accelerate();
        car1.brake();

        System.out.println("\nCreating an instance of AutoCarSystem using subclass reference");
        AutoCarSystem system = new AutoCarSystem();
        system.startEngine();
        system.stopEngine();
        system.accelerate();
        system.brake();
    }
}
