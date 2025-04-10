package com.xworkz.runner.external;

import com.xworkz.runner.internal.Star;

public class StarRunner {
    public static void main(String[] args) {
        Star star = new Star("Sirius", 1.46, "Canis Major");
        String starString = star.toString();
        System.out.println("Star details: " + starString);

        int hash = star.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "shine";
        String two = "twinkle";
        String three = "night";

        System.out.println("shine: " + one.hashCode());
        System.out.println("twinkle: " + two.hashCode());
        System.out.println("night: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(star));
    }
}
