package com.xworkz.runner.external;

import com.xworkz.runner.internal.Pig;

public class PigRunner {
    public static void main(String[] args) {
        Pig pig = new Pig("Yorkshire", 2, 120.75);
        String pigString = pig.toString();
        System.out.println("Pig details: " + pigString);

        int hash = pig.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "boar";
        String two = "hog";
        String three = "swine";

        System.out.println("boar: " + one.hashCode());
        System.out.println("hog: " + two.hashCode());
        System.out.println("swine: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(pig));
    }
}
