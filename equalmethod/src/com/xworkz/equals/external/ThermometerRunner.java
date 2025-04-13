package com.xworkz.equals.external;

import com.xworkz.equals.internal.Thermometer;

public class ThermometerRunner {
    public static void main(String[] args) {

        Thermometer thermometer1 = new Thermometer();
        thermometer1.setScale("Celsius");

        Thermometer thermometer2 = new Thermometer();
        thermometer2.setScale("Celsius");

        boolean same = thermometer1.equals(thermometer2);
        System.out.println("thermometer1 equals thermometer2: " + same);

        System.out.println("Thermometer 1: " + thermometer1);
        System.out.println("Thermometer 2: " + thermometer2);

        System.out.println("Thermometer 1 hashCode: " + thermometer1.hashCode());
        System.out.println("Thermometer 2 hashCode: " + thermometer2.hashCode());
    }
}
