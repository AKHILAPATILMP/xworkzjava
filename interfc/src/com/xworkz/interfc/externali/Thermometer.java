package com.xworkz.interfc.externali;

public interface Thermometer {
    void measureTemperature();
    void adjustCalibration();
    void switchUnit();
    default void meter() {
        System.out.println("meter");
    }
}
