package com.xworkz.runner.external;

import com.xworkz.runner.internal.Bench;

public class BenchRunner {
    public static void main(String[] args) {
        Bench bench = new Bench("Wood", 180, 3500.00);
        String benchString = bench.toString();
        System.out.println("Bench details: " + benchString);

        int hash = bench.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "seat";
        String two = "plank";
        String three = "furniture";

        System.out.println("seat: " + one.hashCode());
        System.out.println("plank: " + two.hashCode());
        System.out.println("furniture: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(bench));
    }
}
