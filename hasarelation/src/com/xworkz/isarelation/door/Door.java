package com.xworkz.isarelation.door;

public class Door {

    public Door() {
        System.out.println("Door constructor is running - parent class");
    }

    public void open() {
        System.out.println("Door is opened manually - parent class");
    }

    public void close() {
        System.out.println("Door is closed manually - parent class");
    }

    public void lock() {
        System.out.println("Door is locked with a key - parent class");
    }

    public void unlock() {
        System.out.println("Door is unlocked with a key - parent class");
    }
}


