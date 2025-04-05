package com.xworkz.isarelation.pilot;

public class CommercialPilot extends Pilot {

    public CommercialPilot() {
        super();
        System.out.println("CommercialPilot constructor is running - subclass");
    }

    @Override
    public void fly() {
        System.out.println("CommercialPilot is flying a commercial aircraft - subclass");
    }

    @Override
    public void land() {
        System.out.println("CommercialPilot is landing at a busy airport - subclass");
    }

    @Override
    public void communicate() {
        System.out.println("CommercialPilot is using advanced communication systems - subclass");
    }

    @Override
    public void performCheck() {
        System.out.println("CommercialPilot is doing digital pre-flight checks - subclass");
    }
}
