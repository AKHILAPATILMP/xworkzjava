package com.xworkz.runner.external;

import com.xworkz.runner.internal.Bronze;

public class BronzeRunner {
    public static void main(String[] args) {
        Bronze bronze = new Bronze("High", 12.5, "India");
        String bronzeString = bronze.toString();
        System.out.println("Bronze details: " + bronzeString);

        int hash = bronze.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "metal";
        String two = "alloy";
        String three = "copper";

        System.out.println("metal: " + one.hashCode());
        System.out.println("alloy: " + two.hashCode());
        System.out.println("copper: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(bronze));
    }
}
