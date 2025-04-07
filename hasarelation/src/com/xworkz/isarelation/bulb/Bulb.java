package com.xworkz.isarelation.bulb;

public class Bulb {

    public Bulb() {
        System.out.println("Bulb constructor is running - parent class");
    }

    public void turnOn() {
        System.out.println("Turning on the bulb - parent class");
    }

    public void turnOff() {
        System.out.println("Turning off the bulb - parent class");
    }

    public void glow() {
        System.out.println("Bulb is glowing - parent class");
    }

    public void setVoltage() {
        System.out.println("Setting voltage for the bulb - parent class");
    }

    public void checkWattage() {
        System.out.println("Checking bulb wattage - parent class");
    }
}
