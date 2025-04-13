package com.xworkz.equals.external;

import com.xworkz.equals.internal.Mill;

public class MillRunner {
    public static void main(String[] args) {

        Mill mill1 = new Mill();
        mill1.setType("Textile");
        mill1.setCapacity(1000.5 );
        mill1.setLocation("Bangalore");
        mill1.setWorkers(150);

        Mill mill2 = new Mill();
        mill2.setType("Textile"); // same type
        mill2.setCapacity(800.0);
        mill2.setLocation("Mysore");
        mill2.setWorkers(100);

        boolean same = mill1.equals(mill2);
        System.out.println("mill1 equals mill2: " + same);

        System.out.println("Mill 1: " + mill1);
        System.out.println("Mill 2: " + mill2);

        System.out.println("Mill 1 hashCode: " + mill1.hashCode());
        System.out.println("Mill 2 hashCode: " + mill2.hashCode());
    }
}
