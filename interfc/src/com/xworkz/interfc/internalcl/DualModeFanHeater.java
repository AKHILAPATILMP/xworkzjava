package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.FanHeater;

public class DualModeFanHeater implements FanHeater {

    @Override
    public void heat() {
        System.out.println("Heating the room using fan heater...");
    }

    @Override
    public void cool() {
        System.out.println("Cooling the room using fan mode...");
    }

    @Override
    public void adjustTemperature() {
        System.out.println("Adjusting temperature based on room conditions...");
    }
}
