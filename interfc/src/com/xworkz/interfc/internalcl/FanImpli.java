package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Fan;

public class FanImpli implements Fan {
    @Override
    public void turnOn() {
        System.out.println("Fan is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is turned off");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("Fan speed adjusted");
    }
}
