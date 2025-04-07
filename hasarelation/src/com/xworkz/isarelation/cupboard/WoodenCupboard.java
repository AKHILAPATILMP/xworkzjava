package com.xworkz.isarelation.cupboard;

public class WoodenCupboard extends Cupboard {

    public WoodenCupboard() {
        super();
        System.out.println("WoodenCupboard constructor is running - subclass");
    }

    @Override
    public void open() {
        System.out.println("Opening wooden cupboard with handle - subclass");
    }

    @Override
    public void close() {
        System.out.println("Closing wooden cupboard slowly - subclass");
    }

    @Override
    public void lock() {
        System.out.println("Locking wooden cupboard with key - subclass");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking wooden cupboard with key - subclass");
    }

    @Override
    public void checkCapacity() {
        System.out.println("Checking wooden cupboard capacity with shelves - subclass");
    }

    public void polish() {
        System.out.println("Polishing the wooden cupboard - subclass specific");
    }
}
