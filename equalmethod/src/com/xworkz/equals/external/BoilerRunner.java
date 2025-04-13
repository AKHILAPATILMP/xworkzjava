package com.xworkz.equals.external;

import com.xworkz.equals.internal.Boiler;

public class BoilerRunner {
    public static void main(String[] args) {

        Boiler b1 = new Boiler();
        b1.setFuelType("Gas");
        b1.setCapacity(150);
        b1.setIsElectric(false);
        b1.setPressure(12.5);

        Boiler b2 = new Boiler();
        b2.setFuelType("Gas");
        b2.setCapacity(150);
        b2.setIsElectric(false);
        b2.setPressure(13.0);

        boolean same = b1.equals(b2);
        System.out.println("b1 equals b2: " + same);

        System.out.println("Boiler 1: " + b1);
        System.out.println("Boiler 2: " + b2);

        System.out.println("Boiler 1 hashCode: " + b1.hashCode());
        System.out.println("Boiler 2 hashCode: " + b2.hashCode());
    }
}
