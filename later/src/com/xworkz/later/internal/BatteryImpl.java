package com.xworkz.later.internal;

public class BatteryImpl implements Battery {

    public BatteryImpl() {
        super();
        System.out.println("BatteryImpl constructor running");
    }

    @Override
    public void charge() {
        System.out.println("Battery is charging...");
    }
}
