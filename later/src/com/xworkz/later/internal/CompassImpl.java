package com.xworkz.later.internal;

public class CompassImpl implements Compass {

    public CompassImpl() {
        super();
        System.out.println("CompassImpl constructor running");
    }

    @Override
    public void navigate() {
        System.out.println("Compass is navigating...");
    }
}
