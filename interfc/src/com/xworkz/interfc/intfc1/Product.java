package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.SmokeDetector;
import com.xworkz.interfc.externali.SnowConeMachine;

public class Product implements SmokeDetector, SnowConeMachine {
    @Override
    public void detectSmoke() {
        System.out.println("");
    }

    @Override
    public void soundAlarm() {
        System.out.println("");
    }

    @Override
    public void testSystem() {
        System.out.println("");
    }

    @Override
    public void makeSnowCones() {
        System.out.println("");
    }

    @Override
    public void serveSnowCones() {
        System.out.println("");
    }

    @Override
    public void cleanMachine() {
        System.out.println("");
    }
}
