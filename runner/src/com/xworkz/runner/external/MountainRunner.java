package com.xworkz.runner.external;

import com.xworkz.runner.internal.Mountain;

public class MountainRunner {
    public static void main(String[] args) {
        Mountain mountain = new Mountain("Everest", 8848.86, "Nepal");
        String mountainString = mountain.toString();
        System.out.println("Mountain details: " + mountainString);

        int hash = mountain.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "peak";
        String two = "snow";
        String three = "altitude";

        System.out.println("peak: " + one.hashCode());
        System.out.println("snow: " + two.hashCode());
        System.out.println("altitude: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(mountain));
    }
}
