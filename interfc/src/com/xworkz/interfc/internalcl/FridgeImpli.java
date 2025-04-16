package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Fridge;

public class FridgeImpli implements Fridge {
    @Override
    public void cool() {
        System.out.println("Fridge cooling");
    }

    @Override
    public void defrost() {
        System.out.println("Fridge defrosting");
    }

    @Override
    public void setTemperature() {
        System.out.println("Fridge temperature set");
    }
}
