package com.xworkz.equals.external;

import com.xworkz.equals.internal.Suitcase;

public class SuitcaseRunner {
    public static void main(String[] args) {

        Suitcase suitcase1 = new Suitcase();
        suitcase1.setBrand("Samsonite");
        suitcase1.setWeight(3.5);  // weight in kg
        suitcase1.setColor("Black");
        suitcase1.setNumberOfWheels(4);

        Suitcase suitcase2 = new Suitcase();
        suitcase2.setBrand("Samsonite");  // same brand
        suitcase2.setWeight(4.0);  // different weight
        suitcase2.setColor("Black");  // same color
        suitcase2.setNumberOfWheels(4);

        boolean same = suitcase1.equals(suitcase2);
        System.out.println("suitcase1 equals suitcase2: " + same);

        System.out.println("Suitcase 1: " + suitcase1);
        System.out.println("Suitcase 2: " + suitcase2);

        System.out.println("Suitcase 1 hashCode: " + suitcase1.hashCode());
        System.out.println("Suitcase 2 hashCode: " + suitcase2.hashCode());
    }
}
