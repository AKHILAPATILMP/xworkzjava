package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.HybridCar;

public class ElectricHybridCar implements HybridCar {

    @Override
    public void charge() {
        System.out.println("charge");
    }

    @Override
    public void switchModes() {
        System.out.println("switch");
    }

    @Override
    public void drive() {
        System.out.println("drive");
    }
}

