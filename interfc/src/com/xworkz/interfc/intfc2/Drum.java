package com.xworkz.interfc.intfc2;

import com.xworkz.interfc.externali.*;

public class Drum implements Airplane, AirPurifier, BarcodeScanner, Bed, Bicycle {
    @Override
    public void purify() {
        System.out.println("purify");
    }

    @Override
    public void replaceFilter() {
        System.out.println("replace");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("adjust speed");
    }

    @Override
    public void takeOff() {
        System.out.println("take off");
    }

    @Override
    public void land() {
        System.out.println("land");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void scanBarcode() {
        System.out.println("scan");
    }

    @Override
    public void connectToSystem() {
        System.out.println("connect");
    }

    @Override
    public void reset() {
        System.out.println("reset");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }

    @Override
    public void makeBed() {
        System.out.println("make bed");
    }

    @Override
    public void adjustHeadrest() {
        System.out.println("head rest");
    }

    @Override
    public void pedal() {
        System.out.println("pedal");
    }

    @Override
    public void brake() {
        System.out.println("brake");
    }

    @Override
    public void ringBell() {
        System.out.println("bell ring");
    }
}
