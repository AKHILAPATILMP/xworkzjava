package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.BicycleHelmet;
import com.xworkz.interfc.externali.Blender;

public class Album implements BicycleHelmet, Blender {
    @Override
    public void protectHead() {
        System.out.println("protect");
    }

    @Override
    public void adjustStrap() {
        System.out.println("strap");
    }

    @Override
    public void remove() {
        System.out.println("remove");
    }

    @Override
    public void blend() {
        System.out.println("blend");
    }

    @Override
    public void chop() {
        System.out.println("chop");
    }

    @Override
    public void pulse() {
        System.out.println("pulse");
    }
}
