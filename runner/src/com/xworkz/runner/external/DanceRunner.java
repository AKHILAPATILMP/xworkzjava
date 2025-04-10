package com.xworkz.runner.external;

import com.xworkz.runner.internal.Dance;

public class DanceRunner {
    public static void main(String[] args) {
        Dance dance = new Dance("Bharatanatyam", "India", 9);
        String danceString = dance.toString();
        System.out.println("Dance details: " + danceString);

        int hash = dance.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "ballet";
        String two = "salsa";
        String three = "hiphop";

        System.out.println("ballet: " + one.hashCode());
        System.out.println("salsa: " + two.hashCode());
        System.out.println("hiphop: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(dance));
    }
}
