package com.xworkz.later.internal;

public class LensImpl implements Lens {

    public LensImpl() {
        super();
        System.out.println("LensImpl constructor running");
    }

    @Override
    public void focus() {
        System.out.println("Lens is focusing...");
    }
}
