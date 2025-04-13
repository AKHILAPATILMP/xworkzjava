package com.xworkz.equals.external;

import com.xworkz.equals.internal.Bulb;

public class BulbRunner {
    public static void main(String[] args) {

        Bulb b1 = new Bulb();
        b1.setShape("Round");
        b1.setWattage(60);
        b1.setBrand("Philips");
        b1.setIsSmart(true);

        Bulb b2 = new Bulb();
        b2.setShape("Round");
        b2.setWattage(60);
        b2.setBrand("Syska");
        b2.setIsSmart(false);

        boolean same = b1.equals(b2);
        System.out.println("b1 equals b2: " + same);

        System.out.println("Bulb 1: " + b1);
        System.out.println("Bulb 2: " + b2);

        System.out.println("Bulb 1 hashCode: " + b1.hashCode());
        System.out.println("Bulb 2 hashCode: " + b2.hashCode());
    }
}
