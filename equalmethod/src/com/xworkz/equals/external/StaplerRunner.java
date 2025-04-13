package com.xworkz.equals.external;

import com.xworkz.equals.internal.Stapler;

public class StaplerRunner {
    public static void main(String[] args) {

        Stapler stapler1 = new Stapler();
        stapler1.setBrand("Swingline");
        stapler1.setCapacity(100);
        stapler1.setIsElectric(true);

        Stapler stapler2 = new Stapler();
        stapler2.setBrand("Swingline");
        stapler2.setCapacity(100);
        stapler2.setIsElectric(true);

        boolean same = stapler1.equals(stapler2);
        System.out.println("stapler1 equals stapler2: " + same);

        System.out.println("Stapler 1: " + stapler1);
        System.out.println("Stapler 2: " + stapler2);

        System.out.println("Stapler 1 hashCode: " + stapler1.hashCode());
        System.out.println("Stapler 2 hashCode: " + stapler2.hashCode());
    }
}
