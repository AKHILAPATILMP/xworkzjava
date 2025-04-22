package com.xworkz.later.internal;

public class WasherImpl implements Washer {

    public WasherImpl() {
        super();
        System.out.println("WasherImpl constructor running");
    }

    @Override
    public void wash() {
        System.out.println("Washer is washing...");
    }
}
