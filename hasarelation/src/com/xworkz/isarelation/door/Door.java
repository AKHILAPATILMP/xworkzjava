package com.xworkz.isarelation.door;

public class Door {

    public Door() {
        System.out.println("Door constructor is running - parent class");
    }

    public void open() {
        System.out.println("Opening the door manually - parent class");
    }

    public void close() {
        System.out.println("Closing the door manually - parent class");
    }

    public void lock() {
        System.out.println("Locking the door with key - parent class");
    }

    public void unlock() {
        System.out.println("Unlocking the door with key - parent class");
    }

    public void knock() {
        System.out.println("Knocking on the door - parent class");
    }
}
