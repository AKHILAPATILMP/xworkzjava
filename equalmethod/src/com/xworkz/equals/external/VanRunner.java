package com.xworkz.equals.external;

import com.xworkz.equals.internal.Van;

public class VanRunner {
    public static void main(String[] args) {

        Van van1 = new Van();
        van1.setMake("Ford");
        van1.setSeatingCapacity(8);
        van1.setFuelType("Diesel");

        Van van2 = new Van();
        van2.setMake("Ford");
        van2.setSeatingCapacity(8);
        van2.setFuelType("Diesel");

        boolean same = van1.equals(van2);
        System.out.println("van1 equals van2: " + same);

        System.out.println("Van 1: " + van1);
        System.out.println("Van 2: " + van2);

        System.out.println("Van 1 hashCode: " + van1.hashCode());
        System.out.println("Van 2 hashCode: " + van2.hashCode());
    }
}
