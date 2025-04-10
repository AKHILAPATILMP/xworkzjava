package com.xworkz.runner.external;

import com.xworkz.runner.internal.Recliner;

public class ReclinerRunner {
    public static void main(String[] args) {
        Recliner recliner = new Recliner("La-Z-Boy", "Leather", 30000.75);
        String reclinerString = recliner.toString();
        System.out.println("Recliner details: " + reclinerString);

        int hash = recliner.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "comfort";
        String two = "relax";
        String three = "tilt";

        System.out.println("comfort: " + one.hashCode());
        System.out.println("relax: " + two.hashCode());
        System.out.println("tilt: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(recliner));
    }
}
