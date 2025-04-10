package com.xworkz.runner.external;

import com.xworkz.runner.internal.Truck;

public class TruckRunner {
    public static void main(String[] args) {
        Truck truck = new Truck("Tata Ace", 2.5, "Diesel");
        String truckString = truck.toString();
        System.out.println("Truck details: " + truckString);

        int hash = truck.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "cargo";
        String two = "engine";
        String three = "haul";

        System.out.println("cargo: " + one.hashCode());
        System.out.println("engine: " + two.hashCode());
        System.out.println("haul: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(truck));
    }
}
