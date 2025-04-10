package com.xworkz.runner.external;

import com.xworkz.runner.internal.Box;

public class BoxRunner {
    public static void main(String[] args) {
        Box box = new Box("Cardboard", "Brown", 12.5);
        String boxString = box.toString();
        System.out.println("Box details: " + boxString);

        int hash = box.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "crate";
        String two = "bin";
        String three = "chest";

        System.out.println("crate: " + one.hashCode());
        System.out.println("bin: " + two.hashCode());
        System.out.println("chest: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(box));
    }
}
