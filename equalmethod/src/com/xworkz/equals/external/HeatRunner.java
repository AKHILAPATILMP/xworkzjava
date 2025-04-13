package com.xworkz.equals.external;

import com.xworkz.equals.internal.Heat;

public class HeatRunner {
    public static void main(String[] args) {

        Heat h1 = new Heat();
        h1.setSource("Sun");
        h1.setTemperature(5500);
        h1.setIntensity("High");
        h1.setDuration("Long");

        Heat h2 = new Heat();
        h2.setSource("Sun");
        h2.setTemperature(3000);
        h2.setIntensity("Moderate");
        h2.setDuration("Short");

        boolean same = h1.equals(h2);
        System.out.println("h1 equals h2: " + same);

        System.out.println("Heat 1: " + h1);
        System.out.println("Heat 2: " + h2);

        System.out.println("Heat 1 hashCode: " + h1.hashCode());
        System.out.println("Heat 2 hashCode: " + h2.hashCode());
    }
}
