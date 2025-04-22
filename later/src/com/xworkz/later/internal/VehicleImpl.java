package com.xworkz.later.internal;

public class VehicleImpl implements Vehicle {

    public VehicleImpl() {
        super();
        System.out.println("Vehicle implementation constructor running");
    }

    @Override
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}
