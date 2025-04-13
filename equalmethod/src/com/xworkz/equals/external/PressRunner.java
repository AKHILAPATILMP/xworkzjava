package com.xworkz.equals.external;

import com.xworkz.equals.internal.Press;

public class PressRunner {
    public static void main(String[] args) {

        Press press1 = new Press();
        press1.setType("Hydraulic");
        press1.setMaterial("Steel");
        press1.setPressure(5000);
        press1.setPurpose("Molding");

        Press press2 = new Press();
        press2.setType("Hydraulic");  // same type
        press2.setMaterial("Iron");
        press2.setPressure(4000);
        press2.setPurpose("Cutting");

        boolean same = press1.equals(press2);
        System.out.println("press1 equals press2: " + same);

        System.out.println("Press 1: " + press1);
        System.out.println("Press 2: " + press2);

        System.out.println("Press 1 hashCode: " + press1.hashCode());
        System.out.println("Press 2 hashCode: " + press2.hashCode());
    }
}
