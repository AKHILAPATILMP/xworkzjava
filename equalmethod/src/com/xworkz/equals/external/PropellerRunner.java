package com.xworkz.equals.external;

import com.xworkz.equals.internal.Propeller;

public class PropellerRunner {
    public static void main(String[] args) {

        Propeller propeller1 = new Propeller();
        propeller1.setMaterial("Aluminum");
        propeller1.setDiameter(10.5);
        propeller1.setBlades(3);

        Propeller propeller2 = new Propeller();
        propeller2.setMaterial("Aluminum");
        propeller2.setDiameter(10.5);
        propeller2.setBlades(3);

        boolean same = propeller1.equals(propeller2);
        System.out.println("propeller1 equals propeller2: " + same);

        System.out.println("Propeller 1: " + propeller1);
        System.out.println("Propeller 2: " + propeller2);

        System.out.println("Propeller 1 hashCode: " + propeller1.hashCode());
        System.out.println("Propeller 2 hashCode: " + propeller2.hashCode());
    }
}
