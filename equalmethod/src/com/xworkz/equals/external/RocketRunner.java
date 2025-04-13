package com.xworkz.equals.external;

import com.xworkz.equals.internal.Rocket;

public class RocketRunner {
    public static void main(String[] args) {

        Rocket r1 = new Rocket();
        r1.setName("GSLV Mk III");
        r1.setHeight(43.43);
        r1.setWeight(640);
        r1.setCountry("India");

        Rocket r2 = new Rocket();
        r2.setName("GSLV Mk III");
        r2.setHeight(50.0);
        r2.setWeight(700);
        r2.setCountry("India");

        boolean same = r1.equals(r2);
        System.out.println("r1 equals r2: " + same);

        System.out.println("Rocket 1: " + r1);
        System.out.println("Rocket 2: " + r2);

        System.out.println("Rocket 1 hashCode: " + r1.hashCode());
        System.out.println("Rocket 2 hashCode: " + r2.hashCode());
    }
}
