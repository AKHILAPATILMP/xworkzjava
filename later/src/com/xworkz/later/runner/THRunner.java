package com.xworkz.later.runner;

import com.xworkz.later.internal.Thermostat;
import com.xworkz.later.internal.ThermostatImpl;
import com.xworkz.later.external.ThermostatUser;

public class THRunner {
    public static void main(String[] args) {
        Thermostat thermostat = new ThermostatImpl();
        ThermostatUser thermostatUser = new ThermostatUser(thermostat); // abstraction
        thermostatUser.activate();
    }
}
