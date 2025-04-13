package com.xworkz.equals.external;

import com.xworkz.equals.internal.Gearbox;

public class GearboxRunner {
    public static void main(String[] args) {

        Gearbox gearbox1 = new Gearbox();
        gearbox1.setType("Manual");
        gearbox1.setNumberOfGears(5);
        gearbox1.setMaterial("Steel");
        gearbox1.setIsAutomatic(false);

        Gearbox gearbox2 = new Gearbox();
        gearbox2.setType("Manual");  // same type
        gearbox2.setNumberOfGears(5);  // same number of gears
        gearbox2.setMaterial("Aluminum");
        gearbox2.setIsAutomatic(false);

        boolean same = gearbox1.equals(gearbox2);
        System.out.println("gearbox1 equals gearbox2: " + same);

        System.out.println("Gearbox 1: " + gearbox1);
        System.out.println("Gearbox 2: " + gearbox2);

        System.out.println("Gearbox 1 hashCode: " + gearbox1.hashCode());
        System.out.println("Gearbox 2 hashCode: " + gearbox2.hashCode());
    }
}
