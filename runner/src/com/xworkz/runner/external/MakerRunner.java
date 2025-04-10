package com.xworkz.runner.external;

import com.xworkz.runner.internal.Maker;

public class MakerRunner {
    public static void main(String[] args) {
        Maker maker = new Maker("Philips", "Coffee Maker", 2999.99);
        String makerString = maker.toString();
        System.out.println("Maker details: " + makerString);

        int hash = maker.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "creator";
        String two = "builder";
        String three = "constructor";

        System.out.println("creator: " + one.hashCode());
        System.out.println("builder: " + two.hashCode());
        System.out.println("constructor: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(maker));
    }
}
