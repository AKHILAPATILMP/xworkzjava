package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Lamp;

public class LampImpli implements Lamp {
    @Override
    public void turnOn() {
        System.out.println("Lamp turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Lamp turned off");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Lamp brightness adjusted");
    }
}
