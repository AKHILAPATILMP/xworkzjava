package com.xworkz.later.internal;

public class SensorImpl implements Sensor {

    public SensorImpl() {
        super();
        System.out.println("SensorImpl constructor running");
    }

    @Override
    public void detect() {
        System.out.println("Sensor is detecting...");
    }
}
