package com.xworkz.isarelation.helmet;

public class SmartHelmet extends Helmet {

    public SmartHelmet() {
        super();
        System.out.println("SmartHelmet constructor is running - subclass");
    }

    @Override
    public void wear() {
        System.out.println("Wearing smart helmet with sensors - subclass");
    }

    @Override
    public void remove() {
        System.out.println("Removing smart helmet safely - subclass");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning smart helmet with microfiber cloth - subclass");
    }

    @Override
    public void adjustStrap() {
        System.out.println("Auto-adjusting smart strap - subclass");
    }

    @Override
    public void protectHead() {
        System.out.println("SmartHelmet providing enhanced protection - subclass");
    }

    public void connectToApp() {
        System.out.println("Connecting smart helmet to mobile app - subclass");
    }
}
