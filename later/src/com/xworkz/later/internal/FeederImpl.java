package com.xworkz.later.internal;

public class FeederImpl implements Feeder {

    public FeederImpl() {
        super();
        System.out.println("FeederImpl constructor running");
    }

    @Override
    public void feed() {
        System.out.println("Feeder is feeding...");
    }
}
