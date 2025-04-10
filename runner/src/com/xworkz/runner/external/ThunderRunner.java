package com.xworkz.runner.external;

import com.xworkz.runner.internal.Thunder;

public class ThunderRunner {
    public static void main(String[] args) {
        Thunder thunder = new Thunder(8, "Midnight", true);
        String thunderString = thunder.toString();
        System.out.println("Thunder details: " + thunderString);

        int hash = thunder.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "storm";
        String two = "boom";
        String three = "crack";

        System.out.println("storm: " + one.hashCode());
        System.out.println("boom: " + two.hashCode());
        System.out.println("crack: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(thunder));
    }
}
