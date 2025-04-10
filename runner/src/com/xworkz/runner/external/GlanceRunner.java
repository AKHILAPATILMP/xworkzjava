package com.xworkz.runner.external;

import com.xworkz.runner.internal.Glance;

public class GlanceRunner {
    public static void main(String[] args) {
        Glance glance = new Glance("Left", 3, true);
        String glanceString = glance.toString();
        System.out.println("Glance details: " + glanceString);

        int hash = glance.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "look";
        String two = "peek";
        String three = "glimpse";

        System.out.println("look: " + one.hashCode());
        System.out.println("peek: " + two.hashCode());
        System.out.println("glimpse: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(glance));
    }
}
