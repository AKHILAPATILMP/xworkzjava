package com.xworkz.later.internal;

public class LaptopImpl implements Laptop {

    public LaptopImpl() {
        super();
        System.out.println("LaptopImpl constructor running");
    }

    @Override
    public void process() {
        System.out.println("Laptop is processing tasks...");
    }
}
