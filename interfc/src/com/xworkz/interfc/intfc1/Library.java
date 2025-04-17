package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.Humidifier;
import com.xworkz.interfc.externali.HybridCar;

public class Library implements Humidifier, HybridCar {
    @Override
    public void humidify() {
        System.out.println("");
    }

    @Override
    public void dehumidify() {
        System.out.println("");
    }

    @Override
    public void adjustMoistureLevel() {
        System.out.println("");
    }

    @Override
    public void charge() {
        System.out.println("");
    }

    @Override
    public void switchModes() {
        System.out.println("");
    }

    @Override
    public void drive() {
        System.out.println("");
    }
}
