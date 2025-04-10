package com.xworkz.runner.external;

import com.xworkz.runner.internal.Metro;

public class MetroRunner {
    public static void main(String[] args) {
        Metro metro = new Metro("Bangalore", 40, 50.0);
        String metroString = metro.toString();
        System.out.println("Metro details: " + metroString);

        int hash = metro.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "train";
        String two = "transit";
        String three = "commute";

        System.out.println("train: " + one.hashCode());
        System.out.println("transit: " + two.hashCode());
        System.out.println("commute: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(metro));
    }
}
