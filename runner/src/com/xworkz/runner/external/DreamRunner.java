package com.xworkz.runner.external;

import com.xworkz.runner.internal.Dream;

public class DreamRunner {
    public static void main(String[] args) {
        Dream dream = new Dream("Adventure", true, 6.5);
        String dreamString = dream.toString();
        System.out.println("Dream details: " + dreamString);

        int hash = dream.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "vision";
        String two = "night";
        String three = "fantasy";

        System.out.println("vision: " + one.hashCode());
        System.out.println("night: " + two.hashCode());
        System.out.println("fantasy: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(dream));
    }
}
