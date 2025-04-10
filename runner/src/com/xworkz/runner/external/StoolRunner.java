package com.xworkz.runner.external;

import com.xworkz.runner.internal.Stool;

public class StoolRunner {
    public static void main(String[] args) {
        Stool stool = new Stool("Plastic", 4, 1.5);
        String stoolString = stool.toString();
        System.out.println("Stool details: " + stoolString);

        int hash = stool.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "seat";
        String two = "legs";
        String three = "support";

        System.out.println("seat: " + one.hashCode());
        System.out.println("legs: " + two.hashCode());
        System.out.println("support: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(stool));
    }
}
