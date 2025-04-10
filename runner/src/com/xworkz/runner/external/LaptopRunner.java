package com.xworkz.runner.external;

import com.xworkz.runner.internal.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", "Intel i7", 84999.00);
        String laptopString = laptop.toString();
        System.out.println("Laptop details: " + laptopString);

        int hash = laptop.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "tech";
        String two = "device";
        String three = "machine";

        System.out.println("tech: " + one.hashCode());
        System.out.println("device: " + two.hashCode());
        System.out.println("machine: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(laptop));
    }
}
