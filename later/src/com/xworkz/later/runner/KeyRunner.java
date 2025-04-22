package com.xworkz.later.runner;

import com.xworkz.later.internal.Keyboard;
import com.xworkz.later.internal.KeyboardImpl;
import com.xworkz.later.external.KeyboardUser;

public class KeyRunner {
    public static void main(String[] args) {
        Keyboard keyboard = new KeyboardImpl();
        KeyboardUser keyboardUser = new KeyboardUser(keyboard); // abstraction
        keyboardUser.activate();
    }
}
