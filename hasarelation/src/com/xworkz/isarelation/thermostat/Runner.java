package com.xworkz.isarelation.thermostat;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Thermostat");
        Thermostat thermostat = new Thermostat();
        thermostat.turnOn();
        thermostat.turnOff();
        thermostat.setTemperature();
        thermostat.showStatus();

        System.out.println("\nCreating an instance of SmartThermostat using Thermostat reference");
        Thermostat smartRef = new SmartThermostat();
        smartRef.turnOn();
        smartRef.turnOff();
        smartRef.setTemperature();
        smartRef.showStatus();

        System.out.println("\nCreating an instance of SmartThermostat using subclass reference");
        SmartThermostat smartThermo = new SmartThermostat();
        smartThermo.turnOn();
        smartThermo.turnOff();
        smartThermo.setTemperature();
        smartThermo.showStatus();
    }
}


