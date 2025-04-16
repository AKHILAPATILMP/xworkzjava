package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Thermometer;

public class DigitalThermometer implements Thermometer {

    @Override
    public void measureTemperature() {
        System.out.println("Measuring temperature...");
    }

    @Override
    public void adjustCalibration() {
        System.out.println("adjust ");
    }

    @Override
    public void switchUnit() {
        System.out.println("switch");
    }
}