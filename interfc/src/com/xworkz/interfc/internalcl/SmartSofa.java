package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Sofa;

public class SmartSofa implements Sofa {

    @Override
    public void sit() {
        System.out.println("sit on the sofa");
    }

    @Override
    public void recline() {
        System.out.println("Reclining the smart sofa...");
    }

    @Override
    public void unfoldBed() {
        System.out.println("unfold bed ");
    }

}