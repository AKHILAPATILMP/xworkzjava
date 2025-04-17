package com.xworkz.interfc.externali;

public interface SmartThermostat {
    void adjustTemperature();
    void setSchedule();
    void monitorEnergyUsage();
    default public void thermo() {
        System.out.println("thermo");
    }
}
