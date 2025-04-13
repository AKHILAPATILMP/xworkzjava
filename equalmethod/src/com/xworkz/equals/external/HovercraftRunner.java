package com.xworkz.equals.external;

import com.xworkz.equals.internal.Hovercraft;

public class HovercraftRunner {
    public static void main(String[] args) {

        Hovercraft hovercraft1 = new Hovercraft();
        hovercraft1.setModel("HoverMaster 3000");
        hovercraft1.setWeight(5000);
        hovercraft1.setSpeed(100);
        hovercraft1.setManufacturer("AeroTech");

        Hovercraft hovercraft2 = new Hovercraft();
        hovercraft2.setModel("HoverMaster 3000");  // same model
        hovercraft2.setWeight(5000);               // same weight
        hovercraft2.setSpeed(120);
        hovercraft2.setManufacturer("TechnoCruise");

        boolean same = hovercraft1.equals(hovercraft2);
        System.out.println("hovercraft1 equals hovercraft2: " + same);

        System.out.println("Hovercraft 1: " + hovercraft1);
        System.out.println("Hovercraft 2: " + hovercraft2);

        System.out.println("Hovercraft 1 hashCode: " + hovercraft1.hashCode());
        System.out.println("Hovercraft 2 hashCode: " + hovercraft2.hashCode());
    }
}
