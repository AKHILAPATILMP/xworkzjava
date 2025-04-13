package com.xworkz.equals.external;

import com.xworkz.equals.internal.NailPaint;

public class NailPaintRunner {
    public static void main(String[] args) {

        NailPaint paint1 = new NailPaint();
        paint1.setColor("Red");
        paint1.setFinish("Glossy");
        paint1.setVolume(10.5);
        paint1.setIsLongLasting(true);

        NailPaint paint2 = new NailPaint();
        paint2.setColor("Red");
        paint2.setFinish("Glossy");
        paint2.setVolume(15.0);
        paint2.setIsLongLasting(false);

        boolean same = paint1.equals(paint2);
        System.out.println("paint1 equals paint2: " + same);

        System.out.println("NailPaint 1: " + paint1);
        System.out.println("NailPaint 2: " + paint2);

        System.out.println("NailPaint 1 hashCode: " + paint1.hashCode());
        System.out.println("NailPaint 2 hashCode: " + paint2.hashCode());
    }
}
