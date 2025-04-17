package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.AC;

public class SplitACImpli implements AC {

    @Override
    public void cool() {
        System.out.println("Split AC cooling");
    }

    @Override
    public void heat() {
        System.out.println("Split AC heating");
    }

    @Override
    public void adjustTemperature() {
        System.out.println("Split AC temperature adjusted");
    }

    @Override
    public void energySaverMode() {
        System.out.println("AC is in energy saver mode (default method).");
    }
}
