package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Refrigerator;

public class FrostFreeRefrigeratorImpli implements Refrigerator {

    @Override
    public void cool() {
        System.out.println("Frost-free refrigerator cooling");
    }

    @Override
    public void freeze() {
        System.out.println("Frost-free refrigerator freezing");
    }

    @Override
    public void defrost() {
        System.out.println("Frost-free refrigerator defrosting");
    }
}
