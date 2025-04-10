package com.xworkz.runner.external;

import com.xworkz.runner.internal.Ocean;

public class OceanRunner {
    public static void main(String[] args) {
        Ocean ocean = new Ocean("Pacific", 10994, 165250000);
        String oceanString = ocean.toString();
        System.out.println("Ocean details: " + oceanString);

        int hash = ocean.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "wave";
        String two = "tide";
        String three = "current";

        System.out.println("wave: " + one.hashCode());
        System.out.println("tide: " + two.hashCode());
        System.out.println("current: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(ocean));
    }
}
