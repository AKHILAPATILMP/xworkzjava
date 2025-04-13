package com.xworkz.equals.external;

import com.xworkz.equals.internal.Fire;

public class FireRunner {
    public static void main(String[] args) {

        Fire fire1 = new Fire();
        fire1.setType("Wildfire");
        fire1.setTemperature(1000.0);
        fire1.setIsControlled(false);
        fire1.setSource("Forest");

        Fire fire2 = new Fire();
        fire2.setType("Wildfire");   // same type
        fire2.setTemperature(1000.0); // same temperature
        fire2.setIsControlled(true);
        fire2.setSource("Mountain");

        boolean same = fire1.equals(fire2);
        System.out.println("fire1 equals fire2: " + same);

        System.out.println("Fire 1: " + fire1);
        System.out.println("Fire 2: " + fire2);

        System.out.println("Fire 1 hashCode: " + fire1.hashCode());
        System.out.println("Fire 2 hashCode: " + fire2.hashCode());
    }
}
