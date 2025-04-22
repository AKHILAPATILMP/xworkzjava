package com.xworkz.later.external;

import com.xworkz.later.internal.Keyboard;

public class KeyboardUser {

    Keyboard keyboard;

    public KeyboardUser(Keyboard keyboard) {
        this.keyboard = keyboard;
        System.out.println("KeyboardUser is initialized");
    }

    public void activate() {
        if (this.keyboard != null) {
            this.keyboard.type();
        } else {
            System.out.println("No keyboard to type on");
        }
    }
}
