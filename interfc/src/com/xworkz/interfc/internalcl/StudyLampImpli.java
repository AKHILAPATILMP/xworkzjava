package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Lamp;

public class StudyLampImpli implements Lamp {

    @Override
    public void turnOn() {
        System.out.println("Study lamp turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Study lamp turned off");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Study lamp brightness adjusted");
    }
}
