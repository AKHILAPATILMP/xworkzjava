package com.xworkz.runner.external;

import com.xworkz.runner.internal.Blender;

public class BlenderRunner {
    public static void main(String[] args) {
        Blender blender = new Blender("Philips", 5, 2450.75);
        String blenderString = blender.toString();
        System.out.println("Blender details: " + blenderString);

        int hash = blender.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "motor";
        String two = "blade";
        String three = "jug";

        System.out.println("motor: " + one.hashCode());
        System.out.println("blade: " + two.hashCode());
        System.out.println("jug: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(blender));
    }
}
