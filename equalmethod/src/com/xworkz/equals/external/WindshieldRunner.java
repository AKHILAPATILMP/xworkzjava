package com.xworkz.equals.external;

import com.xworkz.equals.internal.Windshield;

public class WindshieldRunner {
    public static void main(String[] args) {

        Windshield windshield1 = new Windshield();
        windshield1.setThickness(5.0);
        windshield1.setMaterial("Tempered Glass");

        Windshield windshield2 = new Windshield();
        windshield2.setThickness(5.0);  // same thickness
        windshield2.setMaterial("Tempered Glass");  // same material

        boolean same = windshield1.equals(windshield2);
        System.out.println("windshield1 equals windshield2: " + same);

        System.out.println("Windshield 1: " + windshield1);
        System.out.println("Windshield 2: " + windshield2);

        System.out.println("Windshield 1 hashCode: " + windshield1.hashCode());
        System.out.println("Windshield 2 hashCode: " + windshield2.hashCode());
    }
}
