package com.xworkz.equals.external;

import com.xworkz.equals.internal.Stick;

public class StickRunner {
    public static void main(String[] args) {

        Stick stick1 = new Stick();
        stick1.setMaterial("Wood");
        stick1.setLength(120.5);
        stick1.setIsStraight(true);

        Stick stick2 = new Stick();
        stick2.setMaterial("Wood");
        stick2.setLength(120.5);  // Same length
        stick2.setIsStraight(true); // Same straightness

        boolean same = stick1.equals(stick2);
        System.out.println("stick1 equals stick2: " + same);

        System.out.println("Stick 1: " + stick1);
        System.out.println("Stick 2: " + stick2);

        System.out.println("Stick 1 hashCode: " + stick1.hashCode());
        System.out.println("Stick 2 hashCode: " + stick2.hashCode());
    }
}
