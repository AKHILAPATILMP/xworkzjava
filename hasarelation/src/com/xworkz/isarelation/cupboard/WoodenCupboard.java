package com.xworkz.isarelation.cupboard;

public class WoodenCupboard extends Cupboard {

    public WoodenCupboard() {
        super();
        System.out.println("WoodenCupboard constructor is running - subclass");
    }

    @Override
    public void open() {
        System.out.println("Opening the wooden cupboard with handle - subclass");
    }

    @Override
    public void close() {
        System.out.println("Closing the wooden cupboard gently - subclass");
    }

    @Override
    public void storeItems() {
        System.out.println("Storing clothes in wooden cupboard - subclass");
    }

    @Override
    public void lock() {
        System.out.println("Locking the wooden cupboard with key - subclass");
    }
}


