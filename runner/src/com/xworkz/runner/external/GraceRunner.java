package com.xworkz.runner.external;

import com.xworkz.runner.internal.Grace;

public class GraceRunner {
    public static void main(String[] args) {
        Grace grace = new Grace("Elegant", "Serene", 9.5);
        String graceString = grace.toString();
        System.out.println("Grace details: " + graceString);

        int hash = grace.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "poise";
        String two = "charm";
        String three = "elegance";

        System.out.println("poise: " + one.hashCode());
        System.out.println("charm: " + two.hashCode());
        System.out.println("elegance: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(grace));
    }
}
