package com.xworkz.equals.external;

import com.xworkz.equals.internal.Pacemaker;

public class PacemakerRunner {
    public static void main(String[] args) {

        Pacemaker pacemaker1 = new Pacemaker();
        pacemaker1.setBrand("Medtronic");
        pacemaker1.setBatteryLife(8.0);
        pacemaker1.setType("Dual Chamber");

        Pacemaker pacemaker2 = new Pacemaker();
        pacemaker2.setBrand("Medtronic");
        pacemaker2.setBatteryLife(8.0);  // same battery life
        pacemaker2.setType("Single Chamber");

        boolean same = pacemaker1.equals(pacemaker2);
        System.out.println("pacemaker1 equals pacemaker2: " + same);

        System.out.println("Pacemaker 1: " + pacemaker1);
        System.out.println("Pacemaker 2: " + pacemaker2);

        System.out.println("Pacemaker 1 hashCode: " + pacemaker1.hashCode());
        System.out.println("Pacemaker 2 hashCode: " + pacemaker2.hashCode());
    }
}
