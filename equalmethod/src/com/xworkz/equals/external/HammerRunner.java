package com.xworkz.equals.external;

import com.xworkz.equals.internal.Hammer;

public class HammerRunner {
    public static void main(String[] args) {

        Hammer hammer1 = new Hammer();
        hammer1.setType("Claw");
        hammer1.setWeight(1.2);
        hammer1.setMaterial("Steel");
        hammer1.setLength(13);

        Hammer hammer2 = new Hammer();
        hammer2.setType("Claw"); // same type
        hammer2.setWeight(1.5);
        hammer2.setMaterial("Iron");
        hammer2.setLength(14);

        boolean same = hammer1.equals(hammer2);
        System.out.println("hammer1 equals hammer2: " + same);

        System.out.println("Hammer 1: " + hammer1);
        System.out.println("Hammer 2: " + hammer2);

        System.out.println("Hammer 1 hashCode: " + hammer1.hashCode());
        System.out.println("Hammer 2 hashCode: " + hammer2.hashCode());
    }
}
