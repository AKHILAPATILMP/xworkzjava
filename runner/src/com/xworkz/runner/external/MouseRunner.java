package com.xworkz.runner.external;

import com.xworkz.runner.internal.Mouse;

public class MouseRunner {
    public static void main(String[] args) {
        Mouse mouse = new Mouse("Logitech", "Wireless", 899.99);
        String mouseString = mouse.toString();
        System.out.println("Mouse details: " + mouseString);

        int hash = mouse.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "click";
        String two = "scroll";
        String three = "pointer";

        System.out.println("click: " + one.hashCode());
        System.out.println("scroll: " + two.hashCode());
        System.out.println("pointer: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(mouse));
    }
}
