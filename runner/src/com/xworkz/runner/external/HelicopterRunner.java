package com.xworkz.runner.external;

import com.xworkz.runner.internal.Helicopter;

public class HelicopterRunner {
    public static void main(String[] args) {
        Helicopter helicopter = new Helicopter("H125", "Airbus", 6);
        String helicopterString = helicopter.toString();
        System.out.println("Helicopter details: " + helicopterString);

        int hash = helicopter.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "air";
        String two = "rotor";
        String three = "lift";

        System.out.println("air: " + one.hashCode());
        System.out.println("rotor: " + two.hashCode());
        System.out.println("lift: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(helicopter));
    }
}
