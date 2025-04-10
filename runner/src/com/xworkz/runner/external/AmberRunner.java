package com.xworkz.runner.external;

import com.xworkz.runner.internal.Amber;

public class AmberRunner {
    public static void main(String[] args) {
        Amber amber = new Amber("Fossilized Resin", "Baltic", 750.50);
        String amberString = amber.toString();
        System.out.println("Amber details: " + amberString);

        int hash = amber.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "crystal";
        String two = "resin";
        String three = "gem";

        System.out.println("crystal: " + one.hashCode());
        System.out.println("resin: " + two.hashCode());
        System.out.println("gem: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(amber));
    }
}
