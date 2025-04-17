package com.xworkz.interfc.intfc1;

import com.xworkz.interfc.externali.Oven;
import com.xworkz.interfc.externali.Phone;

public class Music implements Oven, Phone {
    @Override
    public void bake() {
        System.out.println("");
    }

    @Override
    public void grill() {
        System.out.println("");
    }

    @Override
    public void preheat() {
        System.out.println("");
    }

    @Override
    public void call() {
        System.out.println("");
    }

    @Override
    public void text() {
        System.out.println("");
    }

    @Override
    public void browse() {
        System.out.println("");
    }
}
