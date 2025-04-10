package com.xworkz.runner.external;

import com.xworkz.runner.internal.Cleaner;

public class CleanerRunner {
    public static void main(String[] args) {
        Cleaner cleaner = new Cleaner("Sparkle", "Liquid", 89.5);
        String cleanerString = cleaner.toString();
        System.out.println("Cleaner details: " + cleanerString);

        int hash = cleaner.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "mop";
        String two = "detergent";
        String three = "vacuum";

        System.out.println("mop: " + one.hashCode());
        System.out.println("detergent: " + two.hashCode());
        System.out.println("vacuum: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(cleaner));
    }
}
