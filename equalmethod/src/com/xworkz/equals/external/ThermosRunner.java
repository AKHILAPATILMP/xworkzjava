package com.xworkz.equals.external;

import com.xworkz.equals.internal.Thermos;

public class ThermosRunner {
    public static void main(String[] args) {

        Thermos thermos1 = new Thermos();
        thermos1.setBrand("Milton");
        thermos1.setCapacity(1.5);
        thermos1.setColor("Silver");
        thermos1.setIsInsulated(true);

        Thermos thermos2 = new Thermos();
        thermos2.setBrand("Milton");
        thermos2.setCapacity(1.0);
        thermos2.setColor("Silver");
        thermos2.setIsInsulated(false);

        boolean same = thermos1.equals(thermos2);
        System.out.println("thermos1 equals thermos2: " + same);

        System.out.println("Thermos 1: " + thermos1);
        System.out.println("Thermos 2: " + thermos2);

        System.out.println("Thermos 1 hashCode: " + thermos1.hashCode());
        System.out.println("Thermos 2 hashCode: " + thermos2.hashCode());
    }
}
