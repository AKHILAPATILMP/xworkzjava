package com.xworkz.isarelation.screen;

public class SmartScreen extends Screen {

    public SmartScreen() {
        super();
        System.out.println("SmartScreen constructor is running - subclass");
    }

    @Override
    public void display() {
        System.out.println("SmartScreen is displaying HD content - subclass");
    }

    @Override
    public void turnOn() {
        System.out.println("SmartScreen turned on with voice command - subclass");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartScreen is turned off with auto sensor - subclass");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("SmartScreen auto-adjusts brightness - subclass");
    }
}
