package com.xworkz.isarelation.jet;

public class FighterJet extends Jet {

    public FighterJet() {
        super();
        System.out.println("FighterJet constructor is running - subclass");
    }

    @Override
    public void fly() {
        System.out.println("FighterJet is flying at supersonic speed - subclass");
    }

    @Override
    public void land() {
        System.out.println("FighterJet landing with precision - subclass");
    }

    @Override
    public void refuel() {
        System.out.println("FighterJet is refueling mid-air - subclass");
    }

    @Override
    public void checkSystems() {
        System.out.println("FighterJet advanced system check - subclass");
    }

    @Override
    public void communicate() {
        System.out.println("FighterJet encrypted communication - subclass");
    }

    public void launchMissile() {
        System.out.println("FighterJet launching missile - subclass only method");
    }
}
