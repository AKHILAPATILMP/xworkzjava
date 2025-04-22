package com.xworkz.later.external;

import com.xworkz.later.internal.Thermostat;

public class ThermostatUser {

    Thermostat thermostat;

    public ThermostatUser(Thermostat thermostat) {
        this.thermostat = thermostat;
        System.out.println("ThermostatUser is initialized");
    }

    public void activate() {
        if (this.thermostat != null) {
            this.thermostat.controlTemperature();
        } else {
            System.out.println("No thermostat to control temperature");
        }
    }
}
