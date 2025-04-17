package com.xworkz.interfc.intfc2;

import com.xworkz.interfc.externali.*;

public class Glue implements CarCharger, Chair, CoffeeMaker, Computer, Curtain {
    @Override
    public void chargeBattery() {
        System.out.println("running a method");
    }

    @Override
    public void monitorPowerLevel() {
        System.out.println("running a method");
    }

    @Override
    public void adjustChargingSpeed() {
        System.out.println("running a method");
    }

    @Override
    public void sit() {
        System.out.println("running a method");
    }

    @Override
    public void adjustHeight() {
        System.out.println("running a method");
    }

    @Override
    public void rotate() {
        System.out.println("running a method");
    }

    @Override
    public void pull() {
        Chair.super.pull();
    }

    @Override
    public void brew() {
        System.out.println("running a method");
    }

    @Override
    public void adjustStrength() {
        System.out.println("running a method");
    }

    @Override
    public void keepWarm() {
        System.out.println("running a method");
    }

    @Override
    public void makes() {
        CoffeeMaker.super.makes();
    }

    @Override
    public void start() {
        System.out.println("running a method");
    }

    @Override
    public void shutdown() {
        System.out.println("running a method");
    }

    @Override
    public void restart() {
        System.out.println("running a method");
    }

    @Override
    public void operate() {
        Computer.super.operate();
    }

    @Override
    public void open() {
        System.out.println("running a method");
    }

    @Override
    public void close() {
        System.out.println("running a method");
    }

    @Override
    public void wash() {
        System.out.println("running a method");
    }
}
