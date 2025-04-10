package com.xworkz.runner.external;

import com.xworkz.runner.internal.Hen;

public class HenRunner {
    public static void main(String[] args) {
        Hen hen = new Hen("Leghorn", "White", 5);
        String henString = hen.toString();
        System.out.println("Hen details: " + henString);

        int hash = hen.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "feather";
        String two = "egg";
        String three = "coop";

        System.out.println("feather: " + one.hashCode());
        System.out.println("egg: " + two.hashCode());
        System.out.println("coop: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(hen));
    }
}
