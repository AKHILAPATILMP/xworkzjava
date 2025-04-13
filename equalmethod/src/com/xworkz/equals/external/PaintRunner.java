package com.xworkz.equals.external;

import com.xworkz.equals.internal.Paint;

public class PaintRunner {
    public static void main(String[] args) {

        Paint paint1 = new Paint();
        paint1.setColor("Red");
        paint1.setType("Acrylic");
        paint1.setVolume(2.5);

        Paint paint2 = new Paint();
        paint2.setColor("Red");       // Same color
        paint2.setType("Acrylic");    // Same type
        paint2.setVolume(2.5);        // Same volume

        boolean same = paint1.equals(paint2);
        System.out.println("paint1 equals paint2: " + same);

        System.out.println("Paint 1: " + paint1);
        System.out.println("Paint 2: " + paint2);

        System.out.println("Paint 1 hashCode: " + paint1.hashCode());
        System.out.println("Paint 2 hashCode: " + paint2.hashCode());
    }
}
