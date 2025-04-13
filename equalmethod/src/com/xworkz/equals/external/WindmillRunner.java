package com.xworkz.equals.external;

import com.xworkz.equals.internal.Windmill;

public class WindmillRunner {
    public static void main(String[] args) {

        Windmill w1 = new Windmill();
        w1.setLocation("Holland");
        w1.setHeight(120.0);
        w1.setBladeCount(3);
        w1.setMaterial("Steel");

        Windmill w2 = new Windmill();
        w2.setLocation("Holland");
        w2.setHeight(120.0);
        w2.setBladeCount(3);
        w2.setMaterial("Wood");

        boolean same = w1.equals(w2);
        System.out.println("w1 equals w2: " + same);

        System.out.println("Windmill 1: " + w1);
        System.out.println("Windmill 2: " + w2);

        System.out.println("Windmill 1 hashCode: " + w1.hashCode());
        System.out.println("Windmill 2 hashCode: " + w2.hashCode());
    }
}
