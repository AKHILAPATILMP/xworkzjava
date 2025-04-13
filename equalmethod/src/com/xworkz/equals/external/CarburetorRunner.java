package com.xworkz.equals.external;

import com.xworkz.equals.internal.Carburetor;

public class CarburetorRunner {
    public static void main(String[] args) {

        Carburetor carb1 = new Carburetor();
        carb1.setBrand("Bosch");
        carb1.setFuelEfficiency(15.5);  // 15.5 km/l
        carb1.setHorsepower(120);

        Carburetor carb2 = new Carburetor();
        carb2.setBrand("Bosch");
        carb2.setFuelEfficiency(15.5);  // same fuel efficiency
        carb2.setHorsepower(130);  // different horsepower

        boolean same = carb1.equals(carb2);
        System.out.println("carb1 equals carb2: " + same);

        System.out.println("Carburetor 1: " + carb1);
        System.out.println("Carburetor 2: " + carb2);

        System.out.println("Carburetor 1 hashCode: " + carb1.hashCode());
        System.out.println("Carburetor 2 hashCode: " + carb2.hashCode());
    }
}
