package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.MicrowaveOven;

public class GrillMicrowaveOvenImpli implements MicrowaveOven {

    @Override
    public void microwave() {
        System.out.println("Grill microwave oven microwaving");
    }

    @Override
    public void bake() {
        System.out.println("Grill microwave oven baking");
    }

    @Override
    public void grill() {
        System.out.println("Grill microwave oven grilling");
    }

    @Override
    public void oven() {
        System.out.println("oven");
    }
}