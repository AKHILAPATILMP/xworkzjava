package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.FanCooler;

public class AirCooler implements FanCooler {
    @Override
    public void cool() {
        System.out.println("cool");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("speed");
    }

    @Override
    public void oscillate() {
        System.out.println("oscillate");
    }
}
