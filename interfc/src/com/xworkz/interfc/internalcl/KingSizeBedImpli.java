package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Bed;

public class KingSizeBedImpli implements Bed {

    @Override
    public void sleep() {
        System.out.println("Sleeping on king size bed");
    }

    @Override
    public void makeBed() {
        System.out.println("King size bed made");
    }

    @Override
    public void adjustHeadrest() {
        System.out.println("King size bed headrest adjusted");
    }
}
