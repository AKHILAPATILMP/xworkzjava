package com.xworkz.isarelation.mirror;
public class SmartMirror extends Mirror {

    public SmartMirror() {
        super();
        System.out.println("SmartMirror constructor is running - subclass");
    }

    @Override
    public void reflect() {
        System.out.println("SmartMirror reflects and shows smart notifications - subclass");
    }

    @Override
    public void clean() {
        System.out.println("SmartMirror auto-cleans with anti-fog feature - subclass");
    }

    @Override
    public void hang() {
        System.out.println("SmartMirror is mounted with sensors - subclass");
    }

    @Override
    public void displayType() {
        System.out.println("This is a smart mirror with display features - subclass");
    }
}


