package com.xworkz.isarelation.violin;
public class ElectricViolin extends Violin {

    public ElectricViolin() {
        super();
        System.out.println("ElectricViolin constructor is running - subclass");
    }

    @Override
    public void play() {
        System.out.println("Playing an electric melody on the electric violin - subclass");
    }

    @Override
    public void tune() {
        System.out.println("Auto-tuning the electric violin - subclass");
    }

    @Override
    public void stop() {
        System.out.println("Powering down the electric violin - subclass");
    }

    @Override
    public void maintain() {
        System.out.println("Maintaining electric components of the violin - subclass");
    }
}
