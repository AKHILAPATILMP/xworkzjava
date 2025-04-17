package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.Iron;
import com.xworkz.interfc.externali.Lamp;

public class Movie implements Iron, Lamp {
    @Override
    public void turnOn() {
        System.out.println("");
    }

    @Override
    public void turnOff() {
        System.out.println("");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("");
    }

    @Override
    public void heat() {
        System.out.println("");
    }

    @Override
    public void ironClothes() {
        System.out.println("");
    }

    @Override
    public void steam() {
        System.out.println("");
    }

    @Override
    public void melt() {
        System.out.println("iron melts");
    }

    @Override
    public void light() {
        System.out.println("lamp light");
    }

    @Override
    public void post() {
        System.out.println("post");
    }
}