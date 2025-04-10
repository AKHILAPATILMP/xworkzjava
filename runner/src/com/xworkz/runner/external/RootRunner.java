package com.xworkz.runner.external;

import com.xworkz.runner.internal.Root;

public class RootRunner {
    public static void main(String[] args) {
        Root root = new Root("Mango", 2.5, "Absorption");
        String rootString = root.toString();
        System.out.println("Root details: " + rootString);

        int hash = root.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "soil";
        String two = "anchor";
        String three = "support";

        System.out.println("soil: " + one.hashCode());
        System.out.println("anchor: " + two.hashCode());
        System.out.println("support: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(root));
    }
}
