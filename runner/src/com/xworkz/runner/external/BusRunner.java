package com.xworkz.runner.external;

import com.xworkz.runner.internal.Bus;

public class BusRunner {
    public static void main(String[] args) {
        Bus bus = new Bus("KSRTC", 50, 350.00);
        String busString = bus.toString();
        System.out.println("Bus details: " + busString);

        int hash = bus.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "transport";
        String two = "vehicle";
        String three = "commute";

        System.out.println("transport: " + one.hashCode());
        System.out.println("vehicle: " + two.hashCode());
        System.out.println("commute: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(bus));
    }
}
