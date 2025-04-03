package com.xworkz.isarelation.thermostat;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartThermostat using Thermostat reference");
            Thermostat thermostatRef = new SmartThermostat();
            thermostatRef.turnOn();
            thermostatRef.turnOff();
            thermostatRef.setTemperature(22);
            thermostatRef.displayTemperature();
            thermostatRef.energySavingMode();

            System.out.println("\nCreating an instance of SmartThermostat using subclass reference");
            SmartThermostat smartThermostat = new SmartThermostat();
            smartThermostat.turnOn();
            smartThermostat.turnOff();
            smartThermostat.setTemperature(24);
            smartThermostat.displayTemperature();
            smartThermostat.energySavingMode();
            smartThermostat.connectToWiFi();
            smartThermostat.remoteControl();
            smartThermostat.voiceControl();
            smartThermostat.autoAdjust();
            smartThermostat.scheduleTemperature(20, "10:00 PM");
        }
    }

