package com.xworkz.runner.external;

import com.xworkz.runner.internal.Keyboard;

public class KeyboardRunner {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("Mechanical", "QWERTY", 3499.99);
        String keyboardString = keyboard.toString();
        System.out.println("Keyboard details: " + keyboardString);

        int hash = keyboard.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "key";
        String two = "type";
        String three = "board";

        System.out.println("key: " + one.hashCode());
        System.out.println("type: " + two.hashCode());
        System.out.println("board: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(keyboard));
    }
}
