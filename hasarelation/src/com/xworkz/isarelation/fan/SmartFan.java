package com.xworkz.isarelation.fan;

public class SmartFan extends Fan {

    public SmartFan() {
        super();
        System.out.println("SmartFan constructor is running - subclass");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on SmartFan with remote - subclass");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off SmartFan via mobile app - subclass");
    }

    @Override
    public void changeSpeed() {
        System.out.println("Changing SmartFan speed automatically - subclass");
    }

    @Override
    public void rotate() {
        System.out.println("SmartFan rotating with smart sensor control - subclass");
    }

    @Override
    public void stopRotation() {
        System.out.println("SmartFan stopping rotation when not needed - subclass");
    }

    public void voiceControl() {
        System.out.println("SmartFan supports voice control - subclass only");
    }
}
