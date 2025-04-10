package com.xworkz.runner.external;

import com.xworkz.runner.internal.Microwave;

public class MicrowaveRunner {
    public static void main(String[] args) {
        Microwave microwave = new Microwave("Samsung", 900, 7999.99);
        String microwaveString = microwave.toString();
        System.out.println("Microwave details: " + microwaveString);

        int hash = microwave.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "oven";
        String two = "heat";
        String three = "cook";

        System.out.println("oven: " + one.hashCode());
        System.out.println("heat: " + two.hashCode());
        System.out.println("cook: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(microwave));
    }
}
