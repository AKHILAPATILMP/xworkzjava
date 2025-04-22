package com.xworkz.later.internal;

public class ElevatorImpl implements Elevator {

    public ElevatorImpl() {
        super();
        System.out.println("ElevatorImpl constructor running");
    }

    @Override
    public void move() {
        System.out.println("Elevator is moving...");
    }
}
