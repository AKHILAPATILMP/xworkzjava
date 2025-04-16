package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.SmartFridge;

public class SmartRefrigerator implements SmartFridge {

    @Override
    public void storeFood() {
        System.out.println("Storing food in the fridge...");
    }

    @Override
    public void monitorTemperature() {
        System.out.println("Monitoring the internal temperature of the fridge...");
    }

    @Override
    public void alertExpiry() {
        System.out.println("Alerting about food expiry dates...");
    }
}
