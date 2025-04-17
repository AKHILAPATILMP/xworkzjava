package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Airplane;

public class Jet implements Airplane {

    @Override
    public void takeOff() {
        System.out.println("Jet is taking off...");
    }

    @Override
    public void land() {
        System.out.println("Jet is landing...");
    }

    @Override
    public void fly() {
        System.out.println("Jet is flying at high altitude...");
    }

    @Override
    public void landon(){
        System.out.println("landing the airplane");
    }
}
