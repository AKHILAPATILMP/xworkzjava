package com.xworkz.isarelation.thermostat;

public class SmartThermostat extends Thermostat {

    public SmartThermostat() {
        super();
        System.out.println("SmartThermostat constructor is running - subclass");
    }

    @Override
    public void turnOn() {
        System.out.println("SmartThermostat is turned on via mobile app - subclass");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartThermostat is turned off remotely - subclass");
    }

    @Override
    public void setTemperature() {
        System.out.println("SmartThermostat adjusts temperature using AI - subclass");
    }

    @Override
    public void showStatus() {
        System.out.println("SmartThermostat status displayed on digital screen - subclass");
    }
}


