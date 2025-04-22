package com.xworkz.later.internal;

public class DryerImpl implements Dryer {

    public DryerImpl() {
        super();
        System.out.println("DryerImpl constructor running");
    }

    @Override
    public void dry() {
        System.out.println("Dryer is drying...");
    }
}
