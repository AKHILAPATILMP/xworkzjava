package com.xworkz.isarelation.fan;

public class Fan {

    public Fan() {
        System.out.println("Fan constructor is running - parent class");
    }

    public void turnOn() {
        System.out.println("Turning on the fan - parent class");
    }

    public void turnOff() {
        System.out.println("Turning off the fan - parent class");
    }

    public void changeSpeed() {
        System.out.println("Changing fan speed - parent class");
    }

    public void rotate() {
        System.out.println("Rotating the fan - parent class");
    }

    public void stopRotation() {
        System.out.println("Stopping fan rotation - parent class");
    }
}
