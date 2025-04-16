package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Taxi;

public class TaxiService implements Taxi {
    @Override
    public void hailTaxi() {
        System.out.println("hail taxi");
    }

    @Override
    public void ride() {
        System.out.println("ride");
    }

    @Override
    public void payFare() {
        System.out.println("pay fare");
    }
}