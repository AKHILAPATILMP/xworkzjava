package com.xworkz.equals.external;

import com.xworkz.equals.internal.Generator;

public class GeneratorRunner {
    public static void main(String[] args) {

        Generator generator1 = new Generator();
        generator1.setModel("HondaGX390");
        generator1.setPowerOutput(5000);
        generator1.setFuelType("Petrol");
        generator1.setWeight(70.5);

        Generator generator2 = new Generator();
        generator2.setModel("HondaGX390");  // Same model
        generator2.setPowerOutput(6000);
        generator2.setFuelType("Diesel");
        generator2.setWeight(80.0);

        boolean same = generator1.equals(generator2);
        System.out.println("generator1 equals generator2: " + same);

        System.out.println("Generator 1: " + generator1);
        System.out.println("Generator 2: " + generator2);

        System.out.println("Generator 1 hashCode: " + generator1.hashCode());
        System.out.println("Generator 2 hashCode: " + generator2.hashCode());
    }
}
