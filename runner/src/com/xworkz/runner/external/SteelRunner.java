package com.xworkz.runner.external;

import com.xworkz.runner.internal.Steel;

public class SteelRunner {
    public static void main(String[] args) {
        Steel steel = new Steel("TMT", 12.5, 400.0);
        String steelString = steel.toString();
        System.out.println("Steel details: " + steelString);

        int hash = steel.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "iron";
        String two = "carbon";
        String three = "alloy";

        System.out.println("iron: " + one.hashCode());
        System.out.println("carbon: " + two.hashCode());
        System.out.println("alloy: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(steel));
    }
}
