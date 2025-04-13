package com.xworkz.equals.external;

import com.xworkz.equals.internal.Airship;

public class AirshipRunner {
    public static void main(String[] args) {

        Airship a1 = new Airship();
        a1.setName("Sky Voyager");
        a1.setCapacity(50);
        a1.setAltitude(10000);
        a1.setGasType("Helium");

        Airship a2 = new Airship();
        a2.setName("Sky Voyager");
        a2.setCapacity(50);
        a2.setAltitude(12000);
        a2.setGasType("Helium");

        boolean same = a1.equals(a2);
        System.out.println("a1 equals a2: " + same);

        System.out.println("Airship 1: " + a1);
        System.out.println("Airship 2: " + a2);

        System.out.println("Airship 1 hashCode: " + a1.hashCode());
        System.out.println("Airship 2 hashCode: " + a2.hashCode());
    }
}
