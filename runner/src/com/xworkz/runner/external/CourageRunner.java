package com.xworkz.runner.external;

import com.xworkz.runner.internal.Courage;

public class CourageRunner {
    public static void main(String[] args) {
        Courage courage = new Courage("Inner Strength", "Facing Fears", 9.5);
        String courageString = courage.toString();
        System.out.println("Courage details: " + courageString);

        int hash = courage.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "bravery";
        String two = "valor";
        String three = "nerve";

        System.out.println("bravery: " + one.hashCode());
        System.out.println("valor: " + two.hashCode());
        System.out.println("nerve: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(courage));
    }
}
