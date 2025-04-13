package com.xworkz.equals.external;

import com.xworkz.equals.internal.Line;

public class LineRunner {
    public static void main(String[] args) {

        Line line1 = new Line();
        line1.setLength(10.5);
        line1.setColor("Red");
        line1.setIsDashed(true);

        Line line2 = new Line();
        line2.setLength(10.5); // same length
        line2.setColor("Blue");
        line2.setIsDashed(false);

        boolean same = line1.equals(line2);
        System.out.println("line1 equals line2: " + same);

        System.out.println("Line 1: " + line1);
        System.out.println("Line 2: " + line2);

        System.out.println("Line 1 hashCode: " + line1.hashCode());
        System.out.println("Line 2 hashCode: " + line2.hashCode());
    }
}
