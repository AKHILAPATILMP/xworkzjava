package com.xworkz.runner.external;

import com.xworkz.runner.internal.Velvet;

public class VelvetRunner {
    public static void main(String[] args) {
        Velvet velvet = new Velvet("Crimson", 450.0, "India");
        System.out.println("Velvet details: " + velvet.toString());

        int hash = velvet.hashCode();
        System.out.println("hash code using reference: " + hash);

        System.out.println("fabric: " + "fabric".hashCode());
        System.out.println("soft: " + "soft".hashCode());
        System.out.println("luxury: " + "luxury".hashCode());

        System.out.println("Original: " + System.identityHashCode(velvet));
    }
}
