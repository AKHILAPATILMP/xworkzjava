package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Fan;

public class SmartFan implements Fan {

    @Override
    public void turnOn() {
        System.out.println("Turning on the fan...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the fan...");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("Adjusting the fan speed...");
    }
}
