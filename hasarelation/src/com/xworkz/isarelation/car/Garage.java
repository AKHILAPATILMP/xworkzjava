package com.xworkz.isarelation.car;

public class Garage {

    public void service(Car car) {
        car.start();
        car.drive();
        car.brake();
        car.honk();
        car.refuel();

        if (car instanceof SportsCar) {
            System.out.println("Casting: Car is instance of SportsCar");
            SportsCar sportsCar = (SportsCar) car;
            sportsCar.boost();
        }
    }
}
