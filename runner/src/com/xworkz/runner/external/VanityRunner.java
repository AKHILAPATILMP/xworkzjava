package com.xworkz.runner.external;

import com.xworkz.runner.internal.Vanity;

public class VanityRunner {
    public static void main(String[] args) {
        Vanity vanity = new Vanity("Modern", 4, "White");
        System.out.println("Vanity details: " + vanity.toString());

        int hash = vanity.hashCode();
        System.out.println("hash code using reference: " + hash);

        System.out.println("mirror: " + "mirror".hashCode());
        System.out.println("drawer: " + "drawer".hashCode());
        System.out.println("makeup: " + "makeup".hashCode());

        System.out.println("Original: " + System.identityHashCode(vanity));
    }
}
