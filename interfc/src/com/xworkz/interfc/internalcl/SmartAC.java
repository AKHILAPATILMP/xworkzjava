package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.AC;

public class SmartAC implements AC {

    @Override
    public void cool() {
        System.out.println("Cooling the room...");
    }

    @Override
    public void heat() {
        System.out.println("Heating the room...");
    }

    @Override
    public void adjustTemperature() {
        System.out.println("Adjusting the temperature automatically...");
    }
}
