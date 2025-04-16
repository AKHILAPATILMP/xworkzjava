package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Chair;

public class ChairImpli implements Chair {
    @Override
    public void sit() {
        System.out.println("Sitting on chair");
    }

    @Override
    public void adjustHeight() {
        System.out.println("Chair height adjusted");
    }

    @Override
    public void rotate() {
        System.out.println("Chair rotated");
    }
}
