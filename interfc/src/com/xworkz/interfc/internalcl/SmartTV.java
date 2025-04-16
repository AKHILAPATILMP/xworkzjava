package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.TV;

public abstract class SmartTV implements TV {


    @Override
    public void powerOn() {
        System.out.println("power on");
    }

    @Override
    public void powerOff() {
        System.out.println("power off");
    }

    @Override
    public void changeChannel() {
        System.out.println("Changing the channel...");
    }

    public abstract void streamContent();

    public abstract void adjustSettings();

    public abstract void castToTV();
}