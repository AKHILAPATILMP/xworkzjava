package com.xworkz.later.internal;

public class MeterImpl implements Meter {

    public MeterImpl() {
        super();
        System.out.println("MeterImpl constructor running");
    }

    @Override
    public void measure() {
        System.out.println("Meter is measuring...");
    }
}
