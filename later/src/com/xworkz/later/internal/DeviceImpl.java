package com.xworkz.later.internal;

public class DeviceImpl implements Device {

    public DeviceImpl() {
        super();
        System.out.println("DeviceImpl constructor running");
    }

    @Override
    public void start() {
        System.out.println("Device is starting...");
    }
}
