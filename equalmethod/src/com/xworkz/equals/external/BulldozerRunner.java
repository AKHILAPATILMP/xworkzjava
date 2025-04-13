package com.xworkz.equals.external;

import com.xworkz.equals.internal.Bulldozer;

public class BulldozerRunner {
    public static void main(String[] args) {

        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setModel("BDZ-X1 ");
        bulldozer1.setWeight(15000);
        bulldozer1.setManufacturer("CAT");
        bulldozer1.setHorsepower(400);

        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setModel("BDZ-X1"); // same model
        bulldozer2.setWeight(18000);
        bulldozer2.setManufacturer("Komatsu");
        bulldozer2.setHorsepower(450);

        boolean same = bulldozer1.equals(bulldozer2);
        System.out.println("bulldozer1 equals bulldozer2: " + same);

        System.out.println("Bulldozer 1: " + bulldozer1);
        System.out.println("Bulldozer 2: " + bulldozer2);

        System.out.println("Bulldozer 1 hashCode: " + bulldozer1.hashCode());
        System.out.println("Bulldozer 2 hashCode: " + bulldozer2.hashCode());
    }
}
