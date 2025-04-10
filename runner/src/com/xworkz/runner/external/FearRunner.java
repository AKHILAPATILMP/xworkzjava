package com.xworkz.runner.external;

import com.xworkz.runner.internal.Fear;

public class FearRunner {
    public static void main(String[] args) {
        Fear fear = new Fear("Phobia", 8, "Darkness");
        String fearString = fear.toString();
        System.out.println("Fear details: " + fearString);

        int hash = fear.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "terror";
        String two = "panic";
        String three = "anxiety";

        System.out.println("terror: " + one.hashCode());
        System.out.println("panic: " + two.hashCode());
        System.out.println("anxiety: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(fear));
    }
}
