package com.xworkz.equals.external;

import com.xworkz.equals.internal.Tub;

public class TubRunner {
    public static void main(String[] args) {

        Tub tub1 = new Tub();
        tub1.setMaterial("Plastic");
        tub1.setCapacity(50.0);
        tub1.setHasDrainPlug(true);

        Tub tub2 = new Tub();
        tub2.setMaterial("Plastic");
        tub2.setCapacity(50.0);
        tub2.setHasDrainPlug(true);

        boolean same = tub1.equals(tub2);
        System.out.println("tub1 equals tub2: " + same);

        System.out.println("Tub 1: " + tub1);
        System.out.println("Tub 2: " + tub2);

        System.out.println("Tub 1 hashCode: " + tub1.hashCode());
        System.out.println("Tub 2 hashCode: " + tub2.hashCode());
    }
}
