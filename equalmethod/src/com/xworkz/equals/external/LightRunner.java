package com.xworkz.equals.external;

import com.xworkz.equals.internal.Light;

public class LightRunner {
    public static void main(String[] args) {

        Light l1 = new Light();
        l1.setType("Ceiling");
        l1.setBrightness(750);
        l1.setColor("White");
        l1.setIsLED(true);

        Light l2 = new Light();
        l2.setType("Ceiling");
        l2.setBrightness(750);
        l2.setColor("Yellow");
        l2.setIsLED(false);

        boolean same = l1.equals(l2);
        System.out.println("l1 equals l2: " + same);

        System.out.println("Light 1: " + l1);
        System.out.println("Light 2: " + l2);

        System.out.println("Light 1 hashCode: " + l1.hashCode());
        System.out.println("Light 2 hashCode: " + l2.hashCode());
    }
}
