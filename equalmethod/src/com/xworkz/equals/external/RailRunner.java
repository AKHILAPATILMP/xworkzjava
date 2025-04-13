package com.xworkz.equals.external;

import com.xworkz.equals.internal.Rail;

public class RailRunner {
    public static void main(String[] args) {

        Rail rail1 = new Rail();
        rail1.setType("High-Speed");
        rail1.setLength(500.5);
        rail1.setMaterial("Steel");
        rail1.setElectrified(true);

        Rail rail2 = new Rail();
        rail2.setType("High-Speed");
        rail2.setLength(500.0);
        rail2.setMaterial("Steel");
        rail2.setElectrified(true);

        boolean same = rail1.equals(rail2);
        System.out.println("rail1 equals rail2: " + same);

        System.out.println("Rail 1: " + rail1);
        System.out.println("Rail 2: " + rail2);

        System.out.println("Rail 1 hashCode: " + rail1.hashCode());
        System.out.println("Rail 2 hashCode: " + rail2.hashCode());
    }
}
