package com.xworkz.equals.external;

import com.xworkz.equals.internal.Power;

public class PowerRunner {
    public static void main(String[] args) {

        Power power1 = new Power();
        power1.setSource("Electricity");
        power1.setVoltage(220);
        power1.setCurrent(15.5);
        power1.setApplication("Industrial");

        Power power2 = new Power();
        power2.setSource("Electricity"); // same source
        power2.setVoltage(110);
        power2.setCurrent(10.0);
        power2.setApplication("Residential");

        boolean same = power1.equals(power2);
        System.out.println("power1 equals power2: " + same);

        System.out.println("Power 1: " + power1);
        System.out.println("Power 2: " + power2);

        System.out.println("Power 1 hashCode: " + power1.hashCode());
        System.out.println("Power 2 hashCode: " + power2.hashCode());
    }
}
