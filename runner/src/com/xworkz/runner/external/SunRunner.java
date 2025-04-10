package com.xworkz.runner.external;

import com.xworkz.runner.internal.Sun;

public class SunRunner {
    public static void main(String[] args) {
        Sun sun = new Sun("Golden", 5500.0, true);
        String sunString = sun.toString();
        System.out.println("Sun details: " + sunString);

        int hash = sun.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "light";
        String two = "heat";
        String three = "shine";

        System.out.println("light: " + one.hashCode());
        System.out.println("heat: " + two.hashCode());
        System.out.println("shine: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(sun));
    }
}
