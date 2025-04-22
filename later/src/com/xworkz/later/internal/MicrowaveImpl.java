package com.xworkz.later.internal;

public class MicrowaveImpl implements Microwave {

    public MicrowaveImpl() {
        super();
        System.out.println("MicrowaveImpl constructor running");
    }

    @Override
    public void cook() {
        System.out.println("Microwave is cooking...");
    }
}
