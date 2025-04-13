package com.xworkz.equals.external;

import com.xworkz.equals.internal.Drill;

public class DrillRunner {
    public static void main(String[] args) {

        Drill d1 = new Drill();
        d1.setBrand("Bosch");
        d1.setPower(750);
        d1.setType("Cordless");
        d1.setWeight(2.5);

        Drill d2 = new Drill();
        d2.setBrand("Bosch");
        d2.setPower(750);
        d2.setType("Cordless");
        d2.setWeight(3.0);

        boolean same = d1.equals(d2);
        System.out.println("d1 equals d2: " + same);

        System.out.println("Drill 1: " + d1);
        System.out.println("Drill 2: " + d2);

        System.out.println("Drill 1 hashCode: " + d1.hashCode());
        System.out.println("Drill 2 hashCode: " + d2.hashCode());
    }
}
