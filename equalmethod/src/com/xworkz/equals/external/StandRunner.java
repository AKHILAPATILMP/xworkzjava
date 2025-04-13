package com.xworkz.equals.external;

import com.xworkz.equals.internal.Stand;

public class StandRunner {
    public static void main(String[] args) {

        Stand stand1 = new Stand();
        stand1.setMaterial("Wood");
        stand1.setHeight(5.5);
        stand1.setColor("Brown");

        Stand stand2 = new Stand();
        stand2.setMaterial("Wood");
        stand2.setHeight(5.5);
        stand2.setColor("Brown");

        boolean same = stand1.equals(stand2);
        System.out.println("stand1 equals stand2: " + same);

        System.out.println("Stand 1: " + stand1);
        System.out.println("Stand 2: " + stand2);

        System.out.println("Stand 1 hashCode: " + stand1.hashCode());
        System.out.println("Stand 2 hashCode: " + stand2.hashCode());
    }
}
