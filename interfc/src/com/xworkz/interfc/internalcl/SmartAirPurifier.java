package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.AirPurifier;

public class SmartAirPurifier implements AirPurifier {

    @Override
    public void purify() {
        System.out.println("Purifying the air...");
    }

    @Override
    public void replaceFilter() {
        System.out.println("Replacing the air filter...");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("Adjusting the fan speed based on air quality...");
    }
}
