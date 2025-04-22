package com.xworkz.later.internal;

public class ClockImpl implements Clock {

    public ClockImpl() {
        super();
        System.out.println("ClockImpl constructor running");
    }

    @Override
    public void tick() {
        System.out.println("Clock is ticking...");
    }
}
