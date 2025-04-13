package com.xworkz.equals.external;

import com.xworkz.equals.internal.Sailboat;

public class SailboatRunner {
    public static void main(String[] args) {

        Sailboat sailboat1 = new Sailboat();
        sailboat1.setType("Monohull");
        sailboat1.setLength(15.5);
        sailboat1.setHasMotor(false);

        Sailboat sailboat2 = new Sailboat();
        sailboat2.setType("Monohull");
        sailboat2.setLength(15.5);
        sailboat2.setHasMotor(false);

        boolean same = sailboat1.equals(sailboat2);
        System.out.println("sailboat1 equals sailboat2: " + same);

        System.out.println("Sailboat 1: " + sailboat1);
        System.out.println("Sailboat 2: " + sailboat2);

        System.out.println("Sailboat 1 hashCode: " + sailboat1.hashCode());
        System.out.println("Sailboat 2 hashCode: " + sailboat2.hashCode());
    }
}
