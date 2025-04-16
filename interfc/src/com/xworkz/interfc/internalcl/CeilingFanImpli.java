package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.*;


public class CeilingFanImpli implements Fan {

    @Override
    public void turnOn() {
        System.out.println("Ceiling fan turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Ceiling fan turned off");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("Ceiling fan speed adjusted");
    }
}
