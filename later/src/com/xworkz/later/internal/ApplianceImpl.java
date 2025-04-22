package com.xworkz.later.internal;

public class ApplianceImpl implements Appliance {

    public ApplianceImpl() {
        super();
        System.out.println("ApplianceImpl constructor running");
    }

    @Override
    public void powerOn() {
        System.out.println("Appliance is now powered on.");
    }
}
