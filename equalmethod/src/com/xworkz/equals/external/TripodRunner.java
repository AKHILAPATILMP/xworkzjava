package com.xworkz.equals.external;

import com.xworkz.equals.internal.Tripod;

public class TripodRunner {
    public static void main(String[] args) {

        Tripod tripod1 = new Tripod();
        tripod1.setMaterial("Aluminum");
        tripod1.setHeight(150.0);
        tripod1.setLegs(3);

        Tripod tripod2 = new Tripod();
        tripod2.setMaterial("Aluminum");
        tripod2.setHeight(150.0);  // Same height
        tripod2.setLegs(3);        // Same number of legs

        boolean same = tripod1.equals(tripod2);
        System.out.println("tripod1 equals tripod2: " + same);

        System.out.println("Tripod 1: " + tripod1);
        System.out.println("Tripod 2: " + tripod2);

        System.out.println("Tripod 1 hashCode: " + tripod1.hashCode());
        System.out.println("Tripod 2 hashCode: " + tripod2.hashCode());
    }
}
