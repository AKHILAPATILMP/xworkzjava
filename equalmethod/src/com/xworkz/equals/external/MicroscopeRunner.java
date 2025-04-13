package com.xworkz.equals.external;

import com.xworkz.equals.internal.Microscope;

public class MicroscopeRunner {
    public static void main(String[] args) {

        Microscope m1 = new Microscope();
        m1.setBrand("Nikon");
        m1.setMagnification(1000);
        m1.setType("Compound");
        m1.setIsDigital(true);

        Microscope m2 = new Microscope();
        m2.setBrand("Nikon");  // same brand
        m2.setMagnification(1000);  // same magnification
        m2.setType("Stereo");
        m2.setIsDigital(false);

        boolean same = m1.equals(m2);
        System.out.println("m1 equals m2: " + same);

        System.out.println("Microscope 1: " + m1);
        System.out.println("Microscope 2: " + m2);

        System.out.println("Microscope 1 hashCode: " + m1.hashCode());
        System.out.println("Microscope 2 hashCode: " + m2.hashCode());
    }
}
