package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.TV;

public class TVImpli implements TV {
    @Override
    public void powerOn() {
        System.out.println("TV powered on");
    }

    @Override
    public void powerOff() {
        System.out.println("TV powered off");
    }

    @Override
    public void changeChannel() {
        System.out.println("TV channel changed");
    }
}
