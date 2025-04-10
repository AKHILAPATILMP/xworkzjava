package com.xworkz.runner.external;

import com.xworkz.runner.internal.Sofa;

public class SofaRunner {
    public static void main(String[] args) {
        Sofa sofa = new Sofa("Leather", "3-Seater", 25000.0);
        String sofaString = sofa.toString();
        System.out.println("Sofa details: " + sofaString);

        int hash = sofa.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "comfort";
        String two = "relax";
        String three = "seat";

        System.out.println("comfort: " + one.hashCode());
        System.out.println("relax: " + two.hashCode());
        System.out.println("seat: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(sofa));
    }
}
