package com.xworkz.isarelation.fan;

public class CeilingFan extends Fan {

    public CeilingFan() {
        super();
        System.out.println("CeilingFan constructor is running - subclass");
    }

    @Override
    public void turnOn() {
        System.out.println("CeilingFan is turned on with wall switch - subclass");
    }

    @Override
    public void turnOff() {
        System.out.println("CeilingFan is turned off from switchboard - subclass");
    }

    @Override
    public void setSpeed() {
        System.out.println("CeilingFan speed set to medium - subclass");
    }

    @Override
    public void rotate() {
        System.out.println("CeilingFan is rotating clockwise - subclass");
    }
}


