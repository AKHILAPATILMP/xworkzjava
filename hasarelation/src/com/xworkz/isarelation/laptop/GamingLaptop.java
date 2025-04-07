package com.xworkz.isarelation.laptop;

public class GamingLaptop extends Laptop {

    public GamingLaptop() {
        super();
        System.out.println("GamingLaptop constructor is running - subclass");
    }

    @Override
    public void powerOn() {
        System.out.println("Powering on with RGB lights - subclass");
    }

    @Override
    public void powerOff() {
        System.out.println("Shutting down with system cooling - subclass");
    }

    @Override
    public void openLid() {
        System.out.println("Opening gaming lid with logo light - subclass");
    }

    @Override
    public void closeLid() {
        System.out.println("Closing lid and saving game state - subclass");
    }

    @Override
    public void charge() {
        System.out.println("Fast charging with performance mode - subclass");
    }

    public void activateTurboMode() {
        System.out.println("Turbo mode activated for high performance gaming - subclass only");
    }
}
