package com.xworkz.runner.external;

import com.xworkz.runner.internal.Decay;

public class DecayRunner {
    public static void main(String[] args) {
        Decay decay = new Decay("Biological", "Fungi", 0.75);
        String decayString = decay.toString();
        System.out.println("Decay details: " + decayString);

        int hash = decay.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "rust";
        String two = "mold";
        String three = "spoilage";

        System.out.println("rust: " + one.hashCode());
        System.out.println("mold: " + two.hashCode());
        System.out.println("spoilage: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(decay));
    }
}
