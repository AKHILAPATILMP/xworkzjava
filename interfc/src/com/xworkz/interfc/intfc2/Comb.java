package com.xworkz.interfc.intfc2;

import com.xworkz.interfc.externali.*;

public class Comb implements SmartDoor, SmartFridge, SmartLock, SmartSpeaker,SmartThermostat {
    @Override
    public void lock() {
        System.out.println("running a method");
    }

    @Override
    public void unlock() {
        System.out.println("running a method");
    }

    @Override
    public void autoLock() {
        System.out.println("running a method");
    }

    @Override
    public void monitorEntry() {
        System.out.println("running a method");
    }

    @Override
    public void storeFood() {
        System.out.println("running a method");
    }

    @Override
    public void monitorTemperature() {
        System.out.println("running a method");
    }

    @Override
    public void alertExpiry() {
        System.out.println("running a method");
    }

    @Override
    public void playMusic() {
        System.out.println("running a method");
    }

    @Override
    public void adjustVolume() {
        System.out.println("running a method");
    }

    @Override
    public void voiceControl() {
        System.out.println("running a method");
    }

    @Override
    public void adjustTemperature() {
        System.out.println("running a method");
    }

    @Override
    public void setSchedule() {
        System.out.println("running a method");
    }

    @Override
    public void monitorEnergyUsage() {
        System.out.println("running a method");
    }
    @Override
    public void door() {
        System.out.println("door");
    }
    @Override
    public void fridge() {
        System.out.println("fridge");
    }
    @Override
    public void thermo() {
        System.out.println("thermo");
    }
}
