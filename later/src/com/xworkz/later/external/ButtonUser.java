package com.xworkz.later.external;

import com.xworkz.later.internal.Button;

public class ButtonUser {

    Button button;

    public ButtonUser(Button button) {
        this.button = button;
        System.out.println("ButtonUser is initialized");
    }

    public void activate() {
        if (this.button != null) {
            this.button.press();
        } else {
            System.out.println("No button to press");
        }
    }
}
