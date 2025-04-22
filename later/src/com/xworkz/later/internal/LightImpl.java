package com.xworkz.later.internal;

public class LightImpl implements Light {

    public LightImpl() {
        super();
        System.out.println("LightImpl constructor running");
    }

    @Override
    public void turnOn() {
        System.out.println("Light is turned on...");
    }
}
