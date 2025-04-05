package com.xworkz.isarelation.television;

public class SmartTelevision extends Television {

    public SmartTelevision() {
        super();
        System.out.println("SmartTelevision constructor is running - subclass");
    }

    @Override
    public void turnOn() {
        System.out.println("SmartTelevision is turned on with voice control - subclass");
    }

    @Override
    public void changeChannel() {
        System.out.println("SmartTelevision channel changed using remote app - subclass");
    }

    @Override
    public void adjustVolume() {
        System.out.println("SmartTelevision volume adjusted via smart assistant - subclass");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartTelevision is turned off automatically - subclass");
    }
}
