package com.xworkz.equals.external;

import com.xworkz.equals.internal.Whiteboard;

public class WhiteboardRunner {
    public static void main(String[] args) {

        Whiteboard whiteboard1 = new Whiteboard();
        whiteboard1.setBrand("Deluxe");
        whiteboard1.setSize(6.0);
        whiteboard1.setColor("White");

        Whiteboard whiteboard2 = new Whiteboard();
        whiteboard2.setBrand("Deluxe");
        whiteboard2.setSize(6.0);  // same size
        whiteboard2.setColor("White");

        boolean same = whiteboard1.equals(whiteboard2);
        System.out.println("whiteboard1 equals whiteboard2: " + same);

        System.out.println("Whiteboard 1: " + whiteboard1);
        System.out.println("Whiteboard 2: " + whiteboard2);

        System.out.println("Whiteboard 1 hashCode: " + whiteboard1.hashCode());
        System.out.println("Whiteboard 2 hashCode: " + whiteboard2.hashCode());
    }
}
