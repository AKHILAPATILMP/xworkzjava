package com.xworkz.later.internal;

public class MotorImpl implements Motor {

    public MotorImpl() {
        super();
        System.out.println("MotorImpl constructor running");
    }

    @Override
    public void start() {
        System.out.println("Motor is starting...");
    }
}
