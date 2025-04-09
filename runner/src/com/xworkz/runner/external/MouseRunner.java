package com.xworkz.runner.external;

import com.xworkz.runner.internal.Mouse;

public class MouseRunner {
    public static void main(String[] args) {
        Mouse mouse = new Mouse("HP", "Wireless", 1200);
        String mouseString = mouse.toString();
        System.out.println("mouse" + mouseString);
    }
}
