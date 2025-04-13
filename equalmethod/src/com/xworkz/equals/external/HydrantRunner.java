package com.xworkz.equals.external;

import com.xworkz.equals.internal.Hydrant;

public class HydrantRunner {
    public static void main(String[] args) {

        Hydrant h1 = new Hydrant();
        h1.setLocation("Main Street");
        h1.setColor("Red");
        h1.setWaterPressure(100);
        h1.setIsOperational(true);

        Hydrant h2 = new Hydrant();
        h2.setLocation("Main Street");
        h2.setColor("Red");
        h2.setWaterPressure(100);
        h2.setIsOperational(false);

        boolean same = h1.equals(h2);
        System.out.println("h1 equals h2: " + same);

        System.out.println("Hydrant 1: " + h1);
        System.out.println("Hydrant 2: " + h2);

        System.out.println("Hydrant 1 hashCode: " + h1.hashCode());
        System.out.println("Hydrant 2 hashCode: " + h2.hashCode());
    }
}
