package com.xworkz.isarelation.lamp;

public class Lamp {

    public Lamp() {
        System.out.println("Lamp constructor is running - parent class");
    }

    public void turnOn() {
        System.out.println("Turning on the lamp - parent class");
    }

    public void turnOff() {
        System.out.println("Turning off the lamp - parent class");
    }

    public void adjustBrightness() {
        System.out.println("Adjusting brightness manually - parent class");
    }

    public void replaceBulb() {
        System.out.println("Replacing the bulb - parent class");
    }

    public void cleanLamp() {
        System.out.println("Cleaning the lamp - parent class");
    }
}
