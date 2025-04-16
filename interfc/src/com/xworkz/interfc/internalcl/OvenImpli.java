package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Oven;

public class OvenImpli implements Oven {
    @Override
    public void bake() {
        System.out.println("Oven is baking");
    }

    @Override
    public void grill() {
        System.out.println("Oven is grilling");
    }

    @Override
    public void preheat() {
        System.out.println("Oven is preheating");
    }
}
