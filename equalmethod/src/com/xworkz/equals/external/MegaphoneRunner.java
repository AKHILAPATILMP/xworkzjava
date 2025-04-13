package com.xworkz.equals.external;

import com.xworkz.equals.internal.Megaphone;

public class MegaphoneRunner {
    public static void main(String[] args) {

        Megaphone m1 = new Megaphone();
        m1.setBrand("JBL");
        m1.setVolume(10);
        m1.setWireless(true);
        m1.setWeight(1.5);

        Megaphone m2 = new Megaphone();
        m2.setBrand("JBL");
        m2.setVolume(10);
        m2.setWireless(false);
        m2.setWeight(2.0);

        boolean same = m1.equals(m2);
        System.out.println("m1 equals m2: " + same);

        System.out.println("Megaphone 1: " + m1);
        System.out.println("Megaphone 2: " + m2);

        System.out.println("Megaphone 1 hashCode: " + m1.hashCode());
        System.out.println("Megaphone 2 hashCode: " + m2.hashCode());
    }
}
