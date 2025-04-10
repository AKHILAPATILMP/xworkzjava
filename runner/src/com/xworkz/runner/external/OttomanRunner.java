package com.xworkz.runner.external;

import com.xworkz.runner.internal.Ottoman;

public class OttomanRunner {
    public static void main(String[] args) {
        Ottoman ottoman = new Ottoman("Leather", "Brown", 45.5);
        String ottomanString = ottoman.toString();
        System.out.println("Ottoman details: " + ottomanString);

        int hash = ottoman.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "footrest";
        String two = "seat";
        String three = "decor";

        System.out.println("footrest: " + one.hashCode());
        System.out.println("seat: " + two.hashCode());
        System.out.println("decor: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(ottoman));
    }
}
