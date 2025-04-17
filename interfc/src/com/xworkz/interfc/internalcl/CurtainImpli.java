package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Curtain;

public class CurtainImpli implements Curtain {
    @Override
    public void open() {
        System.out.println("Curtain opened");
    }

    @Override
    public void close() {
        System.out.println("Curtain closed");
    }

    @Override
    public void wash() {
        System.out.println("Curtain washed");
    }

    @Override
    public void operate() {
        System.out.println("operate");
    }
}
