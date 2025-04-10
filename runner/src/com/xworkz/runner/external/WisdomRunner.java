package com.xworkz.runner.external;

import com.xworkz.runner.internal.Wisdom;

public class WisdomRunner {
    public static void main(String[] args) {
        Wisdom wisdom = new Wisdom("Experience", 50, true);
        System.out.println("Wisdom details: " + wisdom.toString());

        int hash = wisdom.hashCode();
        System.out.println("hash code using reference: " + hash);

        System.out.println("knowledge: " + "knowledge".hashCode());
        System.out.println("truth: " + "truth".hashCode());
        System.out.println("depth: " + "depth".hashCode());

        System.out.println("Original: " + System.identityHashCode(wisdom));
    }
}
