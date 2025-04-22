package com.xworkz.later.internal;

public class DispenserImpl implements Dispenser {

    public DispenserImpl() {
        super();
        System.out.println("DispenserImpl constructor running");
    }

    @Override
    public void dispense() {
        System.out.println("Dispenser is dispensing liquid...");
    }
}
