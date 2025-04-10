package com.xworkz.runner.external;

import com.xworkz.runner.internal.Light;

public class LightRunner {
    public static void main(String[] args) {
        Light light = new Light("LED", "Warm White", 800);
        String lightString = light.toString();
        System.out.println("Light details: " + lightString);

        int hash = light.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "lamp";
        String two = "glow";
        String three = "shine";

        System.out.println("lamp: " + one.hashCode());
        System.out.println("glow: " + two.hashCode());
        System.out.println("shine: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(light));
    }
}
