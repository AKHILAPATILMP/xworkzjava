package com.xworkz.equals.external;

import com.xworkz.equals.internal.Ice;

public class IceRunner {
    public static void main(String[] args) {

        Ice ice1 = new Ice();
        ice1.setType("Glacial");
        ice1.setTemperature(-10.5);
        ice1.setDensity(0.92);
        ice1.setOrigin("Arctic");

        Ice ice2 = new Ice();
        ice2.setType("Glacial");  // Same type
        ice2.setTemperature(-15.0);
        ice2.setDensity(0.91);
        ice2.setOrigin("Antarctica");

        boolean same = ice1.equals(ice2);
        System.out.println("ice1 equals ice2: " + same);

        System.out.println("Ice 1: " + ice1);
        System.out.println("Ice 2: " + ice2);

        System.out.println("Ice 1 hashCode: " + ice1.hashCode());
        System.out.println("Ice 2 hashCode: " + ice2.hashCode());
    }
}
