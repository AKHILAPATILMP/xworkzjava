package com.xworkz.later.internal;

public class WheelImpl implements Wheel {

    public WheelImpl() {
        super();
        System.out.println("WheelImpl constructor running");
    }

    @Override
    public void rotate() {
        System.out.println("Wheel is rotating...");
    }
}
