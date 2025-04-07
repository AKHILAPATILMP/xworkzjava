package com.xworkz.isarelation.glass;

public class SmartGlass extends Glass {

    public SmartGlass() {
        super();
        System.out.println("SmartGlass constructor is running - subclass");
    }

    @Override
    public void reflectLight() {
        System.out.println("SmartGlass reflects light intelligently - subclass");
    }

    @Override
    public void transmitLight() {
        System.out.println("SmartGlass adjusts light transmission automatically - subclass");
    }

    @Override
    public void breakGlass() {
        System.out.println("SmartGlass resists breaking - subclass");
    }

    @Override
    public void cleanGlass() {
        System.out.println("SmartGlass cleans using self-cleaning tech - subclass");
    }

    @Override
    public void supportFrame() {
        System.out.println("SmartGlass supports with smart sensors - subclass");
    }

    public void adjustTint() {
        System.out.println("SmartGlass adjusts tint with mobile app - subclass");
    }
}
