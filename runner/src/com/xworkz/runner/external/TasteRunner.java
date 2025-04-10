package com.xworkz.runner.external;

import com.xworkz.runner.internal.Taste;

public class TasteRunner {
    public static void main(String[] args) {
        Taste taste = new Taste("Spicy", false, 8);
        String tasteString = taste.toString();
        System.out.println("Taste details: " + tasteString);

        int hash = taste.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "sweet";
        String two = "bitter";
        String three = "sour";

        System.out.println("sweet: " + one.hashCode());
        System.out.println("bitter: " + two.hashCode());
        System.out.println("sour: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(taste));
    }
}
