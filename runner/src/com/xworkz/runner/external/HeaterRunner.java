package com.xworkz.runner.external;

import com.xworkz.runner.internal.Heater;

public class HeaterRunner {
    public static void main(String[] args) {
        Heater heater = new Heater("Bajaj", "Convection", 1500.0);
        String heaterString = heater.toString();
        System.out.println("Heater details: " + heaterString);

        int hash = heater.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "warmth";
        String two = "heat";
        String three = "fire";

        System.out.println("warmth: " + one.hashCode());
        System.out.println("heat: " + two.hashCode());
        System.out.println("fire: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(heater));
    }
}
