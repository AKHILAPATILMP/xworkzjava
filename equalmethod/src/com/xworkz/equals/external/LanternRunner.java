package com.xworkz.equals.external;

import com.xworkz.equals.internal.Lantern;

public class LanternRunner {
    public static void main(String[] args) {

        Lantern lantern1 = new Lantern();
        lantern1.setType("Oil");
        lantern1.setBrightness(300.0);
        lantern1.setIsPortable(true);

        Lantern lantern2 = new Lantern();
        lantern2.setType("Oil");
        lantern2.setBrightness(300.0);
        lantern2.setIsPortable(true);

        boolean same = lantern1.equals(lantern2);
        System.out.println("lantern1 equals lantern2: " + same);

        System.out.println("Lantern 1: " + lantern1);
        System.out.println("Lantern 2: " + lantern2);

        System.out.println("Lantern 1 hashCode: " + lantern1.hashCode());
        System.out.println("Lantern 2 hashCode: " + lantern2.hashCode());
    }
}
