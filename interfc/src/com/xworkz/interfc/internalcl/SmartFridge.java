package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Fridge;

public class SmartFridge implements Fridge {

    @Override
    public void cool() {
        System.out.println("Smart fridge is cooling...");
    }

    @Override
    public void defrost() {
        System.out.println("Smart fridge is defrosting...");
    }

    @Override
    public void setTemperature() {

    }

}