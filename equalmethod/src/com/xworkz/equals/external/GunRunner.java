package com.xworkz.equals.external;

import com.xworkz.equals.internal.Gun;

public class GunRunner {
    public static void main(String[] args) {

        Gun g1 = new Gun();
        g1.setType("Rifle");
        g1.setRange(500);
        g1.setIsAutomatic(true);
        g1.setWeight(3.2);

        Gun g2 = new Gun();
        g2.setType("Rifle");
        g2.setRange(500);
        g2.setIsAutomatic(true);
        g2.setWeight(3.5);

        boolean same = g1.equals(g2);
        System.out.println("g1 equals g2: " + same);

        System.out.println("Gun 1: " + g1);
        System.out.println("Gun 2: " + g2);

        System.out.println("Gun 1 hashCode: " + g1.hashCode());
        System.out.println("Gun 2 hashCode: " + g2.hashCode());
    }
}
