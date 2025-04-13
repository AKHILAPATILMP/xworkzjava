package com.xworkz.equals.external;

import com.xworkz.equals.internal.Transistor;

public class TransistorRunner {
    public static void main(String[] args) {

        Transistor t1 = new Transistor();
        t1.setType("NPN");
        t1.setMaterial("Silicon");
        t1.setFrequency(300.5);
        t1.setPowerRating(10);

        Transistor t2 = new Transistor();
        t2.setType("NPN");
        t2.setMaterial("Silicon");
        t2.setFrequency(300.5);
        t2.setPowerRating(12);

        boolean same = t1.equals(t2);
        System.out.println("t1 equals t2: " + same);

        System.out.println("Transistor 1: " + t1);
        System.out.println("Transistor 2: " + t2);

        System.out.println("Transistor 1 hashCode: " + t1.hashCode());
        System.out.println("Transistor 2 hashCode: " + t2.hashCode());
    }
}
