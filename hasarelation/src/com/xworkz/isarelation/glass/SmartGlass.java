package com.xworkz.isarelation.glass;

public class SmartGlass extends Glass {

    public SmartGlass() {
        super();
        System.out.println("SmartGlass constructor is running - subclass");
    }

    @Override
    public void fill() {
        System.out.println("SmartGlass detects when water is filled - subclass");
    }

    @Override
    public void drink() {
        System.out.println("SmartGlass tracks hydration levels - subclass");
    }

    @Override
    public void clean() {
        System.out.println("SmartGlass has self-cleaning surface - subclass");
    }

    @Override
    public void displayMaterial() {
        System.out.println("SmartGlass is made of durable and intelligent material - subclass");
    }
}
