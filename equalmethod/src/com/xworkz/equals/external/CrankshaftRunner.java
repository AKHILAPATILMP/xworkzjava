package com.xworkz.equals.external;

import com.xworkz.equals.internal.Crankshaft;

public class CrankshaftRunner {
    public static void main(String[] args) {

        Crankshaft crankshaft1 = new Crankshaft();
        crankshaft1.setMaterial("Steel");
        crankshaft1.setDiameter(45.5);
        crankshaft1.setLength(150);
        crankshaft1.setEngineType("V6");

        Crankshaft crankshaft2 = new Crankshaft();
        crankshaft2.setMaterial("Steel");  // same material
        crankshaft2.setDiameter(45.5);     // same diameter
        crankshaft2.setLength(160);
        crankshaft2.setEngineType("V8");

        boolean same = crankshaft1.equals(crankshaft2);
        System.out.println("crankshaft1 equals crankshaft2: " + same);

        System.out.println("Crankshaft 1: " + crankshaft1);
        System.out.println("Crankshaft 2: " + crankshaft2);

        System.out.println("Crankshaft 1 hashCode: " + crankshaft1.hashCode());
        System.out.println("Crankshaft 2 hashCode: " + crankshaft2.hashCode());
    }
}
