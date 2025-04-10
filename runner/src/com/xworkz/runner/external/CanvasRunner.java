package com.xworkz.runner.external;

import com.xworkz.runner.internal.Canvas;

public class CanvasRunner {
    public static void main(String[] args) {
        Canvas canvas = new Canvas("Cotton", "24x36", 1200.00);
        String canvasString = canvas.toString();
        System.out.println("Canvas details: " + canvasString);

        int hash = canvas.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "brush";
        String two = "easel";
        String three = "paint";

        System.out.println("brush: " + one.hashCode());
        System.out.println("easel: " + two.hashCode());
        System.out.println("paint: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(canvas));
    }
}
