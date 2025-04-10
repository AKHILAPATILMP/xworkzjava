package com.xworkz.runner.external;

import com.xworkz.runner.internal.Fridge;

public class FridgeRunner {
    public static void main(String[] args) {
        Fridge fridge = new Fridge("Samsung", 345, 28999.99);
        String fridgeString = fridge.toString();
        System.out.println("Fridge details: " + fridgeString);

        int hash = fridge.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "cooling";
        String two = "storage";
        String three = "kitchen";

        System.out.println("cooling: " + one.hashCode());
        System.out.println("storage: " + two.hashCode());
        System.out.println("kitchen: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(fridge));
    }
}
