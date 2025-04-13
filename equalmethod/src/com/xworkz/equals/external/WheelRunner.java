package com.xworkz.equals.external;

import com.xworkz.equals.internal.Wheel;

public class WheelRunner {
    public static void main(String[] args) {

        Wheel wheel1 = new Wheel();
        wheel1.setSize(15.0);
        wheel1.setMaterial("Aluminum");
        wheel1.setType("Alloy");
        wheel1.setVehicleType("Car");

        Wheel wheel2 = new Wheel();
        wheel2.setSize(15.0);        // same size
        wheel2.setMaterial("Aluminum");  // same material
        wheel2.setType("Steel");
        wheel2.setVehicleType("Truck");

        boolean same = wheel1.equals(wheel2);
        System.out.println("wheel1 equals wheel2: " + same);

        System.out.println("Wheel 1: " + wheel1);
        System.out.println("Wheel 2: " + wheel2);

        System.out.println("Wheel 1 hashCode: " + wheel1.hashCode());
        System.out.println("Wheel 2 hashCode: " + wheel2.hashCode());
    }
}
