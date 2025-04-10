package com.xworkz.runner.external;

import com.xworkz.runner.internal.River;

public class RiverRunner {
    public static void main(String[] args) {
        River river = new River("Nile", "Africa", 6650);
        String riverString = river.toString();
        System.out.println("River details: " + riverString);

        int hash = river.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "water";
        String two = "flow";
        String three = "stream";

        System.out.println("water: " + one.hashCode());
        System.out.println("flow: " + two.hashCode());
        System.out.println("stream: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(river));
    }
}
