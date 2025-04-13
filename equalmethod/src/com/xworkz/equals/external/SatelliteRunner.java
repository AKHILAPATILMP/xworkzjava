package com.xworkz.equals.external;

import com.xworkz.equals.internal.Satellite;

public class SatelliteRunner {
    public static void main(String[] args) {

        Satellite s1 = new Satellite();
        s1.setName("Chandrayaan");
        s1.setWeight(1000);
        s1.setOrbitType("Lunar");
        s1.setLaunchYear(2019);

        Satellite s2 = new Satellite();
        s2.setName("Chandrayaan");
        s2.setWeight(1200);
        s2.setOrbitType("Lunar");
        s2.setLaunchYear(2023);

        boolean same = s1.equals(s2);
        System.out.println("s1 equals s2: " + same);

        System.out.println("Satellite 1: " + s1);
        System.out.println("Satellite 2: " + s2);

        System.out.println("Satellite 1 hashCode: " + s1.hashCode());
        System.out.println("Satellite 2 hashCode: " + s2.hashCode());
    }
}
