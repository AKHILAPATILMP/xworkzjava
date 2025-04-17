package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Bed;

public class BedImpli implements Bed {
    @Override
    public void sleep() {
        System.out.println("Sleeping on bed");
    }

    @Override
    public void makeBed() {
        System.out.println("Bed made");
    }

    @Override
    public void adjustHeadrest() {
        System.out.println("Headrest adjusted");
    }

    @Override
    public void gotup() {
        System.out.println("got up from bed");
    }
}
