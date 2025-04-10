package com.xworkz.runner.external;

import com.xworkz.runner.internal.Moon;

public class MoonRunner {
    public static void main(String[] args) {
        Moon moon = new Moon("Full", 384400, true);
        String moonString = moon.toString();
        System.out.println("Moon details: " + moonString);

        int hash = moon.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "night";
        String two = "sky";
        String three = "glow";

        System.out.println("night: " + one.hashCode());
        System.out.println("sky: " + two.hashCode());
        System.out.println("glow: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(moon));
    }
}
