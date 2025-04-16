package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Oven;

public class ConvectionOvenImpli implements Oven {

    @Override
    public void bake() {
        System.out.println("Convection oven baking");
    }

    @Override
    public void grill() {
        System.out.println("Convection oven grilling");
    }

    @Override
    public void preheat() {
        System.out.println("Convection oven preheating");
    }
}
