package com.xworkz.equals.external;

import com.xworkz.equals.internal.Zipper;

public class ZipperRunner {
    public static void main(String[] args) {

        Zipper zipper1 = new Zipper();
        zipper1.setMaterial("Metal");
        zipper1.setLength(15.0);
        zipper1.setColor("Silver");

        Zipper zipper2 = new Zipper();
        zipper2.setMaterial("Metal");    // Same material
        zipper2.setLength(15.0);         // Same length
        zipper2.setColor("Silver");      // Same color

        boolean same = zipper1.equals(zipper2);
        System.out.println("zipper1 equals zipper2: " + same);

        System.out.println("Zipper 1: " + zipper1);
        System.out.println("Zipper 2: " + zipper2);

        System.out.println("Zipper 1 hashCode: " + zipper1.hashCode());
        System.out.println("Zipper 2 hashCode: " + zipper2.hashCode());
    }
}
