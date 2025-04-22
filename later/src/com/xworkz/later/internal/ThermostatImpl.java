package com.xworkz.later.internal;

public class ThermostatImpl implements Thermostat {

    public ThermostatImpl() {
        super();
        System.out.println("ThermostatImpl constructor running");
    }

    @Override
    public void controlTemperature() {
        System.out.println("Thermostat is controlling temperature...");
    }
}
