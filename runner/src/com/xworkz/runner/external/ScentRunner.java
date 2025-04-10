package com.xworkz.runner.external;

import com.xworkz.runner.internal.Scent;

public class ScentRunner {
    public static void main(String[] args) {
        Scent scent = new Scent("Lavender Bliss", "Floral", 12.5);
        String scentString = scent.toString();
        System.out.println("Scent details: " + scentString);

        int hash = scent.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "aroma";
        String two = "perfume";
        String three = "fragrance";

        System.out.println("aroma: " + one.hashCode());
        System.out.println("perfume: " + two.hashCode());
        System.out.println("fragrance: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(scent));
    }
}
