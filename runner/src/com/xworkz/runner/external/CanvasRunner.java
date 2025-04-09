package com.xworkz.runner.external;

import com.xworkz.runner.internal.Canvas;

public class CanvasRunner {public static void main(String[] args) {
    Canvas canvas = new Canvas("24x36", "Acrylic", true);
    System.out.println("canvas" + canvas.toString());
}
}
