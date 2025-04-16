package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.SmartThermostat;

public class NestThermostat implements SmartThermostat {

    @Override
    public void adjustTemperature() {
        System.out.println("Adjusting the room temperature...");
    }

    @Override
    public void setSchedule() {
        System.out.println("Setting a temperature schedule for the week...");
    }

    @Override
    public void monitorEnergyUsage() {
        System.out.println("Monitoring energy consumption...");
    }
}
