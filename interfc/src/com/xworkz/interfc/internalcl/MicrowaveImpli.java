package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Microwave;

public class MicrowaveImpli implements Microwave {
    @Override
    public void heat() {
        System.out.println("Microwave is heating");
    }

    @Override
    public void defrost() {
        System.out.println("Microwave defrosting");
    }

    @Override
    public void cook() {
        System.out.println("Microwave cooking");
    }
}
