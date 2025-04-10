package com.xworkz.runner.external;

import com.xworkz.runner.internal.Bike;

public class BikeRunner {
    public static void main(String[] args) {
        Bike bike = new Bike("Yamaha", "MT-15", 160000.00);
        String bikeString = bike.toString();
        System.out.println("Bike details: " + bikeString);

        int hash = bike.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "engine";
        String two = "wheel";
        String three = "helmet";

        System.out.println("engine: " + one.hashCode());
        System.out.println("wheel: " + two.hashCode());
        System.out.println("helmet: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(bike));
    }
}
