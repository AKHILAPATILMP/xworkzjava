package com.xworkz.equals.external;

import com.xworkz.equals.internal.Tractor;

public class TractorRunner {
    public static void main(String[] args) {

        Tractor tractor1 = new Tractor();
        tractor1.setModel("John Deere 5050D");
        tractor1.setHorsepower(50);
        tractor1.setFuelType("Diesel");

        Tractor tractor2 = new Tractor();
        tractor2.setModel("John Deere 5050D");
        tractor2.setHorsepower(50);
        tractor2.setFuelType("Diesel");

        boolean same = tractor1.equals(tractor2);
        System.out.println("tractor1 equals tractor2: " + same);

        System.out.println("Tractor 1: " + tractor1);
        System.out.println("Tractor 2: " + tractor2);

        System.out.println("Tractor 1 hashCode: " + tractor1.hashCode());
        System.out.println("Tractor 2 hashCode: " + tractor2.hashCode());
    }
}
