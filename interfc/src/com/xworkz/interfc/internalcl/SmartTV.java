package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.TV;

public abstract class SmartTV implements TV {

    @Override
    public void powerOn() {
        System.out.println("Turning the TV on...");
    }

    @Override
    public void powerOff() {
        System.out.println("Turning the TV off...");
    }

    @Override
    public void changeChannel() {
        System.out.println("Changing the TV channel...");
    }

    public abstract void streamContent();

    public abstract void adjustSettings();

    public abstract void castToTV();
}
