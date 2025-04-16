package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Sofa;

public class SofaImpli implements Sofa {
    @Override
    public void sit() {
        System.out.println("Sitting on sofa");
    }

    @Override
    public void recline() {
        System.out.println("Sofa reclined");
    }

    @Override
    public void unfoldBed() {
        System.out.println("Sofa bed unfolded");
    }
}
