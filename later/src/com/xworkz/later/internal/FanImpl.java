package com.xworkz.later.internal;

public class FanImpl implements Fan {

    public FanImpl() {
        super();
        System.out.println("FanImpl constructor running");
    }

    @Override
    public void spin() {
        System.out.println("Fan is spinning...");
    }
}
