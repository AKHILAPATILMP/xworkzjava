package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.Bed;
import com.xworkz.interfc.externali.Bicycle;

public class Account implements Bed, Bicycle {
    @Override
    public void sleep() {
        System.out.println("sleep");
    }

    @Override
    public void makeBed() {
        System.out.println("make bed");
    }

    @Override
    public void adjustHeadrest() {
        System.out.println("adjust");
    }

    @Override
    public void pedal() {
        System.out.println("pedal");
    }

    @Override
    public void brake() {
        System.out.println("brake");
    }

    @Override
    public void ringBell() {
        System.out.println("ring");
    }
    @Override
   public void ride(){
        System.out.println("ride the bicycle");
    }
}
