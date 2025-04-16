package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Sofa;

public class ReclinerSofaImpli implements Sofa {

    @Override
    public void sit() {
        System.out.println("Sitting on recliner sofa");
    }

    @Override
    public void recline() {
        System.out.println("Recliner sofa reclined");
    }

    @Override
    public void unfoldBed() {
        System.out.println("Recliner sofa bed unfolded");
    }
}
