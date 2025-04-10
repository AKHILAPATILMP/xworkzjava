package com.xworkz.runner.external;

import com.xworkz.runner.internal.Car;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 3200000);
        String carString = car.toString();
        System.out.println("Car details: " + carString);

        int hash = car.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "engine";
        String two = "wheels";
        String three = "seats";

        System.out.println("engine: " + one.hashCode());
        System.out.println("wheels: " + two.hashCode());
        System.out.println("seats: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(car));
    }
}
