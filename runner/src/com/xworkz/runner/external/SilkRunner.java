package com.xworkz.runner.external;

import com.xworkz.runner.internal.Silk;

public class SilkRunner {
    public static void main(String[] args) {
        Silk silk = new Silk("India", "Smooth", 1200.0);
        String silkString = silk.toString();
        System.out.println("Silk details: " + silkString);

        int hash = silk.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "fabric";
        String two = "thread";
        String three = "weave";

        System.out.println("fabric: " + one.hashCode());
        System.out.println("thread: " + two.hashCode());
        System.out.println("weave: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(silk));
    }
}
