package com.xworkz.later.runner;

import com.xworkz.later.internal.Button;
import com.xworkz.later.internal.ButtonImpl;
import com.xworkz.later.external.ButtonUser;

public class BRunner {
    public static void main(String[] args) {
        Button button = new ButtonImpl();
        ButtonUser buttonUser = new ButtonUser(button); // abstraction
        buttonUser.activate();
    }
}
