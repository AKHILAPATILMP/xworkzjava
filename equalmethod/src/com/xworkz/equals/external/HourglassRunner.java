package com.xworkz.equals.external;

import com.xworkz.equals.internal.Hourglass;

public class HourglassRunner {
    public static void main(String[] args) {

        Hourglass hourglass1 = new Hourglass();
        hourglass1.setMaterial("Wood");
        hourglass1.setHeight(30.5);
        hourglass1.setWidth(15.0);
        hourglass1.setIsAntique(true);

        Hourglass hourglass2 = new Hourglass();
        hourglass2.setMaterial("Wood");  // same material
        hourglass2.setHeight(28.0);
        hourglass2.setWidth(12.0);
        hourglass2.setIsAntique(true);  // same antique status

        boolean same = hourglass1.equals(hourglass2);
        System.out.println("hourglass1 equals hourglass2: " + same);

        System.out.println("Hourglass 1: " + hourglass1);
        System.out.println("Hourglass 2: " + hourglass2);

        System.out.println("Hourglass 1 hashCode: " + hourglass1.hashCode());
        System.out.println("Hourglass 2 hashCode: " + hourglass2.hashCode());
    }
}
