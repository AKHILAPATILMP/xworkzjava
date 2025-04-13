package com.xworkz.equals.external;

import com.xworkz.equals.internal.Doorknob;

public class DoorknobRunner {
    public static void main(String[] args) {

        Doorknob doorknob1 = new Doorknob();
        doorknob1.setMaterial("Brass");
        doorknob1.setDiameter(4.5);
        doorknob1.setIsRound(true);

        Doorknob doorknob2 = new Doorknob();
        doorknob2.setMaterial("Brass");
        doorknob2.setDiameter(4.5);
        doorknob2.setIsRound(true);

        boolean same = doorknob1.equals(doorknob2);
        System.out.println("doorknob1 equals doorknob2: " + same);

        System.out.println("Doorknob 1: " + doorknob1);
        System.out.println("Doorknob 2: " + doorknob2);

        System.out.println("Doorknob 1 hashCode: " + doorknob1.hashCode());
        System.out.println("Doorknob 2 hashCode: " + doorknob2.hashCode());
    }
}
