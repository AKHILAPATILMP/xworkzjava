package com.xworkz.runner.external;

import com.xworkz.runner.internal.Keyboard;

public class KeyboardRunner {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("Logitech", "Mechanical", 2500);
        String keyboardString = keyboard.toString();
        System.out.println("keyboard" + keyboardString);
    }
}
