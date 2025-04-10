package com.xworkz.runner.external;

import com.xworkz.runner.internal.Futon;

public class FutonRunner {
    public static void main(String[] args) {
        Futon futon = new Futon("Cotton", "Queen", 13500.00);
        String futonString = futon.toString();
        System.out.println("Futon details: " + futonString);

        int hash = futon.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "sofa";
        String two = "bed";
        String three = "comfort";

        System.out.println("sofa: " + one.hashCode());
        System.out.println("bed: " + two.hashCode());
        System.out.println("comfort: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(futon));
    }
}
