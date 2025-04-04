package com.xworkz.isarelation.jet;

public class FighterJet extends Jet {

    public FighterJet() {
        super();
        System.out.println("FighterJet constructor is running - subclass");
    }

    @Override
    public void startEngine() {
        System.out.println("FighterJet engine started with afterburner - subclass");
    }

    @Override
    public void takeOff() {
        System.out.println("FighterJet is taking off vertically - subclass");
    }

    @Override
    public void fly() {
        System.out.println("FighterJet is flying at supersonic speed - subclass");
    }

    @Override
    public void land() {
        System.out.println("FighterJet is landing with precision - subclass");
    }
}
