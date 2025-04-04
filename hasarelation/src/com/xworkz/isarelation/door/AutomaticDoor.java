package com.xworkz.isarelation.door;


public class AutomaticDoor extends Door {

    public AutomaticDoor() {
        super();
        System.out.println("AutomaticDoor constructor is running - subclass");
    }

    @Override
    public void open() {
        System.out.println("AutomaticDoor opens with sensor - subclass");
    }

    @Override
    public void close() {
        System.out.println("AutomaticDoor closes automatically - subclass");
    }

    @Override
    public void lock() {
        System.out.println("AutomaticDoor locks digitally - subclass");
    }

    @Override
    public void unlock() {
        System.out.println("AutomaticDoor unlocks via fingerprint - subclass");
    }
}
