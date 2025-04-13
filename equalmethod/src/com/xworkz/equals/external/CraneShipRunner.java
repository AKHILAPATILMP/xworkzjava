package com.xworkz.equals.external;

import com.xworkz.equals.internal.CraneShip;

public class CraneShipRunner {
    public static void main(String[] args) {

        CraneShip ship1 = new CraneShip();
        ship1.setModel("CS-9000");
        ship1.setCapacity(1500);
        ship1.setCompany("OceanLifters");
        ship1.setHeight(45.5);

        CraneShip ship2 = new CraneShip();
        ship2.setModel("CS-9000"); // same model
        ship2.setCapacity(2000);
        ship2.setCompany("HarborLift");
        ship2.setHeight(50.0);

        boolean same = ship1.equals(ship2);
        System.out.println("ship1 equals ship2: " + same);

        System.out.println("CraneShip 1: " + ship1);
        System.out.println("CraneShip 2: " + ship2);

        System.out.println("CraneShip 1 hashCode: " + ship1.hashCode());
        System.out.println("CraneShip 2 hashCode: " + ship2.hashCode());
    }
}
