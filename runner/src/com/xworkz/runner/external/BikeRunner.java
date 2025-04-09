package com.xworkz.runner.external;

import com.xworkz.runner.internal.Bike;

public class BikeRunner {
    public static void main(String[] args) {
        Bike bike = new Bike("Yamaha", 150, 120000);
        String bikeString = bike.toString();
        System.out.println("bike" + bikeString);
    }
}
