package com.xworkz.equals.external;

import com.xworkz.equals.internal.Headset;

public class HeadsetRunner {
    public static void main(String[] args) {

        Headset headset1 = new Headset();
        headset1.setBrand("Sony");
        headset1.setPrice(150.00);
        headset1.setWireless(true);

        Headset headset2 = new Headset();
        headset2.setBrand("Sony");
        headset2.setPrice(150.00);
        headset2.setWireless(true);

        boolean same = headset1.equals(headset2);
        System.out.println("headset1 equals headset2: " + same);

        System.out.println("Headset 1: " + headset1);
        System.out.println("Headset 2: " + headset2);

        System.out.println("Headset 1 hashCode: " + headset1.hashCode());
        System.out.println("Headset 2 hashCode: " + headset2.hashCode());
    }
}
