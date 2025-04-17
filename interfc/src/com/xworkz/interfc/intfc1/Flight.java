package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.FireExtinguisher;
import com.xworkz.interfc.externali.FoodProcessor;

public class Flight implements FireExtinguisher, FoodProcessor {
    @Override
    public void releaseFoam() {
        System.out.println("");
    }

    @Override
    public void extinguishFire() {
        System.out.println("");
    }

    @Override
    public void inspectPressure() {
        System.out.println("");
    }

    @Override
    public void chop() {
        System.out.println("");
    }

    @Override
    public void slice() {
        System.out.println("");
    }

    @Override
    public void knead() {
        System.out.println("");
    }
}
