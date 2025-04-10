package com.xworkz.runner.external;

import com.xworkz.runner.internal.Scooter;

public class ScooterRunner {
    public static void main(String[] args) {
        Scooter scooter = new Scooter("Honda", "White", 55.6);
        String scooterString = scooter.toString();
        System.out.println("Scooter details: " + scooterString);

        int hash = scooter.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "engine";
        String two = "wheels";
        String three = "seat";

        System.out.println("engine: " + one.hashCode());
        System.out.println("wheels: " + two.hashCode());
        System.out.println("seat: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(scooter));
    }
}
