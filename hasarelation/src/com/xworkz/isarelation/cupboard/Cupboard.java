package com.xworkz.isarelation.cupboard;

public class Cupboard {

    public Cupboard() {
        System.out.println("Cupboard constructor is running - parent class");
    }

    public void open() {
        System.out.println("Opening the cupboard - parent class");
    }

    public void close() {
        System.out.println("Closing the cupboard - parent class");
    }

    public void storeItems() {
        System.out.println("Storing items in the cupboard - parent class");
    }

    public void lock() {
        System.out.println("Locking the cupboard - parent class");
    }
}
