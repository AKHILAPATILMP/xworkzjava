package com.xworkz.equals.external;

import com.xworkz.equals.internal.Gyroscope;

public class GyroscopeRunner {
    public static void main(String[] args) {

        Gyroscope g1 = new Gyroscope();
        g1.setType("MEMS");
        g1.setSensitivity(0.1);
        g1.setManufacturer("Bosch");
        g1.setWeight(12.5);

        Gyroscope g2 = new Gyroscope();
        g2.setType("MEMS");
        g2.setSensitivity(0.1);
        g2.setManufacturer("Bosch");
        g2.setWeight(14.0);

        boolean same = g1.equals(g2);
        System.out.println("g1 equals g2: " + same);

        System.out.println("Gyroscope 1: " + g1);
        System.out.println("Gyroscope 2: " + g2);

        System.out.println("Gyroscope 1 hashCode: " + g1.hashCode());
        System.out.println("Gyroscope 2 hashCode: " + g2.hashCode());
    }
}
