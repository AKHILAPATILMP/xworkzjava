package com.xworkz.equals.external;

import com.xworkz.equals.internal.Hydrometer;

public class HydrometerRunner {
    public static void main(String[] args) {

        Hydrometer hydrometer1 = new Hydrometer();
        hydrometer1.setBrand("Omega");
        hydrometer1.setRange(0.0);  // 0-1.0 SG range
        hydrometer1.setIsDigital(true);

        Hydrometer hydrometer2 = new Hydrometer();
        hydrometer2.setBrand("Omega");
        hydrometer2.setRange(0.0);  // same range
        hydrometer2.setIsDigital(false);  // different type

        boolean same = hydrometer1.equals(hydrometer2);
        System.out.println("hydrometer1 equals hydrometer2: " + same);

        System.out.println("Hydrometer 1: " + hydrometer1);
        System.out.println("Hydrometer 2: " + hydrometer2);

        System.out.println("Hydrometer 1 hashCode: " + hydrometer1.hashCode());
        System.out.println("Hydrometer 2 hashCode: " + hydrometer2.hashCode());
    }
}
