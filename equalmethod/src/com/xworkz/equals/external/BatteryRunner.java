package com.xworkz.equals.external;

import com.xworkz.equals.internal.Battery;

public class BatteryRunner {
    public static void main(String[] args) {

        Battery battery1 = new Battery();
        battery1.setType("Lithium-Ion");
        battery1.setCapacity(3000);
        battery1.setVoltage(3.7);
        battery1.setUsage("Mobile");

        Battery battery2 = new Battery();
        battery2.setType("Lithium-Ion");  // same type
        battery2.setCapacity(4000);
        battery2.setVoltage(3.8);
        battery2.setUsage("Laptop");

        boolean same = battery1.equals(battery2);
        System.out.println("battery1 equals battery2: " + same);

        System.out.println("Battery 1: " + battery1);
        System.out.println("Battery 2: " + battery2);

        System.out.println("Battery 1 hashCode: " + battery1.hashCode());
        System.out.println("Battery 2 hashCode: " + battery2.hashCode());
    }
}
