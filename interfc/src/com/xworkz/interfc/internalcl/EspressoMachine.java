package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.CoffeeMaker;

public class EspressoMachine implements CoffeeMaker {
    @Override
    public void brew() {
        System.out.println("brew");
    }

    @Override
    public void adjustStrength() {
        System.out.println("adjust");
    }

    @Override
    public void keepWarm() {
        System.out.println("warm");
    }
}


