package com.xworkz.isarelation.thermostat;
public class Thermostat {

    public Thermostat() {
        System.out.println("Thermostat constructor is running - parent class");
    }

    public void turnOn() {
        System.out.println("Turning on the thermostat - parent class");
    }

    public void turnOff() {
        System.out.println("Turning off the thermostat - parent class");
    }

    public void setTemperature() {
        System.out.println("Setting temperature manually - parent class");
    }

    public void showStatus() {
        System.out.println("Displaying thermostat status - parent class");
    }
}
