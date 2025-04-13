package com.xworkz.equals.external;

import com.xworkz.equals.internal.Door;

public class DoorRunner {
    public static void main(String[] args) {

        Door door1 = new Door();
        door1.setMaterial("Wood");

        Door door2 = new Door();
        door2.setMaterial("Wood");

        boolean same = door1.equals(door2);
        System.out.println("door1 equals door2: " + same);

        System.out.println("Door 1: " + door1);
        System.out.println("Door 2: " + door2);

        System.out.println("Door 1 hashCode: " + door1.hashCode());
        System.out.println("Door 2 hashCode: " + door2.hashCode());
    }
}
