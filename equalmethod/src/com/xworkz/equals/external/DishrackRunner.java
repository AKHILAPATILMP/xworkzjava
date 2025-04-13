package com.xworkz.equals.external;

import com.xworkz.equals.internal.Dishrack;

public class DishrackRunner {
    public static void main(String[] args) {

        Dishrack dishrack1 = new Dishrack();
        dishrack1.setMaterial("Metal");
        dishrack1.setCapacity(20);
        dishrack1.setColor("Silver");

        Dishrack dishrack2 = new Dishrack();
        dishrack2.setMaterial("Metal");
        dishrack2.setCapacity(20);
        dishrack2.setColor("Silver");

        boolean same = dishrack1.equals(dishrack2);
        System.out.println("dishrack1 equals dishrack2: " + same);

        System.out.println("Dishrack 1: " + dishrack1);
        System.out.println("Dishrack 2: " + dishrack2);

        System.out.println("Dishrack 1 hashCode: " + dishrack1.hashCode());
        System.out.println("Dishrack 2 hashCode: " + dishrack2.hashCode());
    }
}
