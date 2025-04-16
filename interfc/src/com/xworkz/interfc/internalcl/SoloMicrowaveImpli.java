package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Microwave;

public class SoloMicrowaveImpli implements Microwave {

    @Override
    public void heat() {
        System.out.println("Solo microwave heating");
    }

    @Override
    public void defrost() {
        System.out.println("Solo microwave defrosting");
    }

    @Override
    public void cook() {
        System.out.println("Solo microwave cooking");
    }
}
