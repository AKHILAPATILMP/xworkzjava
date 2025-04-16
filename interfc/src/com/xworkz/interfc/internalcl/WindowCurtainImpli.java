package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Curtain;

public class WindowCurtainImpli implements Curtain {

    @Override
    public void open() {
        System.out.println("Window curtain opened");
    }

    @Override
    public void close() {
        System.out.println("Window curtain closed");
    }

    @Override
    public void wash() {
        System.out.println("Window curtain washed");
    }
}
