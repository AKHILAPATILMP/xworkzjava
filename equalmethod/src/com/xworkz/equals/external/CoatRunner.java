package com.xworkz.equals.external;

import com.xworkz.equals.internal.Coat;

public class CoatRunner {
    public static void main(String[] args) {

        Coat coat1 = new Coat();
        coat1.setMaterial("Leather");
        coat1.setColor("Black");
        coat1.setSize(42);
        coat1.setIsWaterproof(true);

        Coat coat2 = new Coat();
        coat2.setMaterial("Leather");
        coat2.setColor("Black");
        coat2.setSize(40);
        coat2.setIsWaterproof(false);

        boolean same = coat1.equals(coat2);
        System.out.println("coat1 equals coat2: " + same);

        System.out.println("Coat 1: " + coat1);
        System.out.println("Coat 2: " + coat2);

        System.out.println("Coat 1 hashCode: " + coat1.hashCode());
        System.out.println("Coat 2 hashCode: " + coat2.hashCode());
    }
}
