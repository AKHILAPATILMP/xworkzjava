package com.xworkz.isarelation.bed;
public class SmartBed extends Bed {

    public SmartBed() {
        super();
        System.out.println("SmartBed constructor is running - subclass");
    }

    @Override
    public void sleep() {
        System.out.println("SmartBed auto-adjusts comfort while sleeping - subclass");
    }

    @Override
    public void adjustPillow() {
        System.out.println("SmartBed automatically adjusts the pillow height - subclass");
    }

    @Override
    public void makeBed() {
        System.out.println("SmartBed self-makes the bed - subclass");
    }

    @Override
    public void cleanBed() {
        System.out.println("SmartBed has auto-cleaning function - subclass");
    }
}
