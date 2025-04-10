package com.xworkz.runner.external;

import com.xworkz.runner.internal.Spirit;

public class SpiritRunner {
    public static void main(String[] args) {
        Spirit spirit = new Spirit("Positive", "Mind", 95.5);
        String spiritString = spirit.toString();
        System.out.println("Spirit details: " + spiritString);

        int hash = spirit.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "energy";
        String two = "vibe";
        String three = "soul";

        System.out.println("energy: " + one.hashCode());
        System.out.println("vibe: " + two.hashCode());
        System.out.println("soul: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(spirit));
    }
}
