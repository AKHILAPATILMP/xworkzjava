package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.SmartBulb;

public class Bulb implements SmartBulb {

    @Override
    public void turnOn() {
        System.out.println("Smart bulb is turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart bulb is turned off...");
    }

    @Override
    public void changeColor() {
        System.out.println("Smart bulb color is changing...");
    }
}