package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.SnowConeMachine;

public class ElectricSnowconeMachine implements SnowConeMachine {

    @Override
    public void makeSnowCones() {
        System.out.println("snow cone make");
    }

    @Override
    public void serveSnowCones() {
        System.out.println("snow cone serve");
    }

    @Override
    public void cleanMachine() {
        System.out.println("snow cone clean");
    }
}
