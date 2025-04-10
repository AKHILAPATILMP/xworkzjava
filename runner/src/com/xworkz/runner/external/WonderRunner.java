package com.xworkz.runner.external;

import com.xworkz.runner.internal.Wonder;

public class WonderRunner {
    public static void main(String[] args) {
        Wonder wonder = new Wonder("Grand Canyon", "USA", true);
        System.out.println("Wonder details: " + wonder.toString());

        int hash = wonder.hashCode();
        System.out.println("hash code using reference: " + hash);

        System.out.println("marvel: " + "marvel".hashCode());
        System.out.println("awe: " + "awe".hashCode());
        System.out.println("beauty: " + "beauty".hashCode());

        System.out.println("Original: " + System.identityHashCode(wonder));
    }
}
