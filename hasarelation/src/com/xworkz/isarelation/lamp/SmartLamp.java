package com.xworkz.isarelation.lamp;

public class SmartLamp extends Lamp {

    public SmartLamp() {
        super();
        System.out.println("SmartLamp constructor is running - subclass");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on SmartLamp via app - subclass");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off SmartLamp with voice command - subclass");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("SmartLamp adjusting brightness automatically - subclass");
    }

    @Override
    public void replaceBulb() {
        System.out.println("SmartLamp notifies bulb replacement - subclass");
    }

    @Override
    public void cleanLamp() {
        System.out.println("SmartLamp sends maintenance reminder - subclass");
    }

    public void changeColor() {
        System.out.println("SmartLamp changing color - subclass only method");
    }
}
