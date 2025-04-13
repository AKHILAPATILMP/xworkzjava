package com.xworkz.equals.external;

import com.xworkz.equals.internal.Lunchbox;

public class LunchboxRunner {
    public static void main(String[] args) {

        Lunchbox lunchbox1 = new Lunchbox();
        lunchbox1.setColor("Red");
        lunchbox1.setMaterial("Plastic");
        lunchbox1.setCompartments(3);

        Lunchbox lunchbox2 = new Lunchbox();
        lunchbox2.setColor("Red");       // Same color
        lunchbox2.setMaterial("Plastic"); // Same material
        lunchbox2.setCompartments(3);    // Same number of compartments

        boolean same = lunchbox1.equals(lunchbox2);
        System.out.println("lunchbox1 equals lunchbox2: " + same);

        System.out.println("Lunchbox 1: " + lunchbox1);
        System.out.println("Lunchbox 2: " + lunchbox2);

        System.out.println("Lunchbox 1 hashCode: " + lunchbox1.hashCode());
        System.out.println("Lunchbox 2 hashCode: " + lunchbox2.hashCode());
    }
}
