package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Lamp;

public class DeskLamp implements Lamp {

    @Override
    public void turnOn() {
        System.out.println("Turning on the desk lamp...");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Adjusting the brightness...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the desk lamp...");
    }
}
