package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Oven;

public class SmartOven implements Oven {

    @Override
    public void preheat() {
        System.out.println("Preheating smart oven...");
    }

    @Override
    public void bake() {
        System.out.println("Baking using smart oven...");
    }

    @Override
    public void grill() {
        System.out.println("grill the food");
    }
    public void turnOff() {
        System.out.println("Turning off smart oven...");
    }
}