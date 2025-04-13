package com.xworkz.equals.external;

import com.xworkz.equals.internal.Jacket;

public class JacketRunner {
    public static void main(String[] args) {

        Jacket jacket1 = new Jacket();
        jacket1.setMaterial("Leather");
        jacket1.setSize("M");
        jacket1.setIsWaterproof(true);

        Jacket jacket2 = new Jacket();
        jacket2.setMaterial("Leather");
        jacket2.setSize("M");
        jacket2.setIsWaterproof(true);

        boolean same = jacket1.equals(jacket2);
        System.out.println("jacket1 equals jacket2: " + same);

        System.out.println("Jacket 1: " + jacket1);
        System.out.println("Jacket 2: " + jacket2);

        System.out.println("Jacket 1 hashCode: " + jacket1.hashCode());
        System.out.println("Jacket 2 hashCode: " + jacket2.hashCode());
    }
}
