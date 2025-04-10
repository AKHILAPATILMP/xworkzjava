package com.xworkz.runner.external;

import com.xworkz.runner.internal.Desk;

public class DeskRunner {
    public static void main(String[] args) {
        Desk desk = new Desk("Wood", "Rectangular", 2.5);
        String deskString = desk.toString();
        System.out.println("Desk details: " + deskString);

        int hash = desk.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "table";
        String two = "furniture";
        String three = "workspace";

        System.out.println("table: " + one.hashCode());
        System.out.println("furniture: " + two.hashCode());
        System.out.println("workspace: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(desk));
    }
}
