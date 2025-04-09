package com.xworkz.runner.external;

import com.xworkz.runner.internal.Car;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car("Honda", "Petrol", 900000);
        String carString = car.toString();
        System.out.println("car" + carString);
    }
}
