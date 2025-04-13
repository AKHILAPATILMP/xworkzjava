package com.xworkz.equals.external;

import com.xworkz.equals.internal.Mat;

public class MatRunner {
    public static void main(String[] args) {

        Mat mat1 = new Mat();
        mat1.setMaterial("Cotton");
        mat1.setSize(3.5);
        mat1.setColor("Red");
        mat1.setThickness(1.2);

        Mat mat2 = new Mat();
        mat2.setMaterial("Cotton");
        mat2.setSize(3.5);
        mat2.setColor("Red");
        mat2.setThickness(1.5);

        boolean same = mat1.equals(mat2);
        System.out.println("mat1 equals mat2: " + same);

        System.out.println("Mat 1: " + mat1);
        System.out.println("Mat 2: " + mat2);

        System.out.println("Mat 1 hashCode: " + mat1.hashCode());
        System.out.println("Mat 2 hashCode: " + mat2.hashCode());
    }
}
