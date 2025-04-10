package com.xworkz.runner.external;

import com.xworkz.runner.internal.Forest;

public class ForestRunner {
    public static void main(String[] args) {
        Forest forest = new Forest("Amazon", "South America", 5500000);
        String forestString = forest.toString();
        System.out.println("Forest details: " + forestString);

        int hash = forest.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "jungle";
        String two = "canopy";
        String three = "wildlife";

        System.out.println("jungle: " + one.hashCode());
        System.out.println("canopy: " + two.hashCode());
        System.out.println("wildlife: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(forest));
    }
}
