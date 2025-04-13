package com.xworkz.equals.external;

import com.xworkz.equals.internal.Space;

public class SpaceRunner {
    public static void main(String[] args) {

        Space s1 = new Space();
        s1.setName("International Space Station");
        s1.setArea(1000);
        s1.setPurpose("Research");
        s1.setAgency("NASA");

        Space s2 = new Space();
        s2.setName("International Space Station");
        s2.setArea(1200);
        s2.setPurpose("Habitat");
        s2.setAgency("ESA");

        boolean same = s1.equals(s2);
        System.out.println("s1 equals s2: " + same);

        System.out.println("Space 1: " + s1);
        System.out.println("Space 2: " + s2);

        System.out.println("Space 1 hashCode: " + s1.hashCode());
        System.out.println("Space 2 hashCode: " + s2.hashCode());
    }
}
