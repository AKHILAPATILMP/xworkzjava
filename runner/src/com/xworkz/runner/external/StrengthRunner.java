package com.xworkz.runner.external;

import com.xworkz.runner.internal.Strength;

public class StrengthRunner {
    public static void main(String[] args) {
        Strength strength = new Strength("Endurance", 85, true);
        String strengthString = strength.toString();
        System.out.println("Strength details: " + strengthString);

        int hash = strength.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "power";
        String two = "will";
        String three = "energy";

        System.out.println("power: " + one.hashCode());
        System.out.println("will: " + two.hashCode());
        System.out.println("energy: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(strength));
    }
}
