package com.xworkz.later.internal;

public class PumpImpl implements Pump {

    public PumpImpl() {
        super();
        System.out.println("PumpImpl constructor running");
    }

    @Override
    public void startPumping() {
        System.out.println("Pump is starting to pump...");
    }
}
