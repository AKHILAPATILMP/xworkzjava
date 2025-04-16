package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.WaterPump;

public class ElectricWaterPump implements WaterPump {

    @Override
    public void pumpWater() {
        System.out.println("Pumping water efficiently...");
    }

    @Override
    public void stopPump() {
        System.out.println("Stopping the water pump...");
    }

    @Override
    public void adjustPressure() {
        System.out.println("Adjusting water pressure as needed...");
    }
}
