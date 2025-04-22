package com.xworkz.later.internal;

public class DroneImpl implements Drone {

    public DroneImpl() {
        super();
        System.out.println("DroneImpl constructor running");
    }

    @Override
    public void fly() {
        System.out.println("Drone is flying...");
    }
}
