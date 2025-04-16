package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Refrigerator;

public class RefrigeratorImpli implements Refrigerator {
    @Override
    public void cool() {
        System.out.println("Refrigerator cooling");
    }

    @Override
    public void freeze() {
        System.out.println("Refrigerator freezing");
    }

    @Override
    public void defrost() {
        System.out.println("Refrigerator defrosting");
    }
}
