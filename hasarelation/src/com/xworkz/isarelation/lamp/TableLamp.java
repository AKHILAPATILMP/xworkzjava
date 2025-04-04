package com.xworkz.isarelation.lamp;


public class TableLamp extends Lamp {

    public TableLamp() {
        super();
        System.out.println("TableLamp constructor is running - subclass");
    }

    @Override
    public void turnOn() {
        System.out.println("TableLamp is turned on with touch sensor - subclass");
    }

    @Override
    public void turnOff() {
        System.out.println("TableLamp is turned off with remote - subclass");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("TableLamp brightness adjusted automatically - subclass");
    }

    @Override
    public void replaceBulb() {
        System.out.println("TableLamp LED bulb replaced - subclass");
    }
}
