package com.xworkz.runner.external;

import com.xworkz.runner.internal.Touch;

public class TouchRunner {
    public static void main(String[] args) {
        Touch touch = new Touch("Gentle", true, 3.2);
        String touchString = touch.toString();
        System.out.println("Touch details: " + touchString);

        int hash = touch.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "hand";
        String two = "skin";
        String three = "feel";

        System.out.println("hand: " + one.hashCode());
        System.out.println("skin: " + two.hashCode());
        System.out.println("feel: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(touch));
    }
}
