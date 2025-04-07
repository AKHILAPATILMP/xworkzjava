package com.xworkz.isarelation.bed;

public class SmartBed extends Bed {

    public SmartBed() {
        super();
        System.out.println("SmartBed constructor is running - subclass");
    }

    @Override
    public void sleep() {
        System.out.println("SmartBed automatically adjusts firmness - subclass");
    }

    @Override
    public void makeBed() {
        System.out.println("SmartBed self-makes with built-in motors - subclass");
    }

    @Override
    public void clean() {
        System.out.println("SmartBed uses auto-cleaning tech - subclass");
    }

    @Override
    public void adjustPosition() {
        System.out.println("SmartBed adjusts via voice control - subclass");
    }

    @Override
    public void storeUnderbedItems() {
        System.out.println("SmartBed uses sliding drawers for storage - subclass");
    }

    public void trackSleepPatterns() {
        System.out.println("SmartBed is tracking sleep patterns - subclass method");
    }
}
