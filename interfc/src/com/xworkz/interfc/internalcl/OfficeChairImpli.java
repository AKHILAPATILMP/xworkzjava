package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Chair;

public class OfficeChairImpli implements Chair {

    @Override
    public void sit() {
        System.out.println("Sitting on office chair");
    }

    @Override
    public void adjustHeight() {
        System.out.println("Office chair height adjusted");
    }

    @Override
    public void rotate() {
        System.out.println("Office chair rotated");
    }
}
