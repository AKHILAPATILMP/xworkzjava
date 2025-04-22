package com.xworkz.later.internal;

public class KeyboardImpl implements Keyboard {

    public KeyboardImpl() {
        super();
        System.out.println("KeyboardImpl constructor running");
    }

    @Override
    public void type() {
        System.out.println("Typing on the keyboard...");
    }
}
