package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.TV;

public class SmartTVImpli implements TV {

    @Override
    public void powerOn() {
        System.out.println("Smart TV powered on");
    }

    @Override
    public void powerOff() {
        System.out.println("Smart TV powered off");
    }

    @Override
    public void changeChannel() {
        System.out.println("Smart TV channel changed");
    }
}
