package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Fridge;

public class DoubleDoorFridgeImpli implements Fridge {

    @Override
    public void cool() {
        System.out.println("Double door fridge cooling");
    }

    @Override
    public void defrost() {
        System.out.println("Double door fridge defrosting");
    }

    @Override
    public void setTemperature() {
        System.out.println("Double door fridge temperature set");
    }
}
