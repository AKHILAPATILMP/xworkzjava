package com.xworkz.equals.external;

import com.xworkz.equals.internal.Boat;

public class BoatRunner {
    public static void main(String[] args) {

        Boat boat1 = new Boat();
        boat1.setType("Yacht");
        boat1.setLength(30.5);
        boat1.setHasEngine(true);

        Boat boat2 = new Boat();
        boat2.setType("Yacht");
        boat2.setLength(30.5);
        boat2.setHasEngine(true);

        boolean same = boat1.equals(boat2);
        System.out.println("boat1 equals boat2: " + same);

        System.out.println("Boat 1: " + boat1);
        System.out.println("Boat 2: " + boat2);

        System.out.println("Boat 1 hashCode: " + boat1.hashCode());
        System.out.println("Boat 2 hashCode: " + boat2.hashCode());
    }
}
