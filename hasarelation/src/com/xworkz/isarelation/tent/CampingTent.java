package com.xworkz.isarelation.tent;
public class CampingTent extends Tent {

    public CampingTent() {
        super();
        System.out.println("CampingTent constructor is running - subclass");
    }

    @Override
    public void openTent() {
        System.out.println("Opening a waterproof camping tent - subclass");
    }

    @Override
    public void closeTent() {
        System.out.println("Closing the camping tent with zip - subclass");
    }

    @Override
    public void foldTent() {
        System.out.println("Folding the lightweight camping tent - subclass");
    }

    @Override
    public void setTent() {
        System.out.println("Setting up camping tent with stakes - subclass");
    }
}


