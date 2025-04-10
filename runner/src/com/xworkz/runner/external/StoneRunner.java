package com.xworkz.runner.external;

import com.xworkz.runner.internal.Stone;

public class StoneRunner {
    public static void main(String[] args) {
        Stone stone = new Stone("Grey", 2.75, "Granite");
        String stoneString = stone.toString();
        System.out.println("Stone details: " + stoneString);

        int hash = stone.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "rock";
        String two = "pebble";
        String three = "granite";

        System.out.println("rock: " + one.hashCode());
        System.out.println("pebble: " + two.hashCode());
        System.out.println("granite: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(stone));
    }
}
