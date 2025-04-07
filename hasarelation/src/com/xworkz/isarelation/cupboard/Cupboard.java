package com.xworkz.isarelation.cupboard;

public class Cupboard {

    public Cupboard() {
        System.out.println("Cupboard constructor is running - parent class");
    }

    public void open() {
        System.out.println("Opening cupboard - parent class");
    }

    public void close() {
        System.out.println("Closing cupboard - parent class");
    }

    public void lock() {
        System.out.println("Locking cupboard - parent class");
    }

    public void unlock() {
        System.out.println("Unlocking cupboard - parent class");
    }

    public void checkCapacity() {
        System.out.println("Checking cupboard capacity - parent class");
    }
}
