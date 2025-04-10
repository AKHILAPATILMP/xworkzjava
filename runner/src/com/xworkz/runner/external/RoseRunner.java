package com.xworkz.runner.external;

import com.xworkz.runner.internal.Rose;

public class RoseRunner {
    public static void main(String[] args) {
        Rose rose = new Rose("Red", 32, "Strong");
        String roseString = rose.toString();
        System.out.println("Rose details: " + roseString);

        int hash = rose.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "petal";
        String two = "thorn";
        String three = "stem";

        System.out.println("petal: " + one.hashCode());
        System.out.println("thorn: " + two.hashCode());
        System.out.println("stem: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(rose));
    }
}
