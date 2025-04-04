package com.xworkz.isarelation.flute;

public class BambooFlute extends Flute {

    public BambooFlute() {
        super();
        System.out.println("BambooFlute constructor is running - subclass");
    }

    @Override
    public void play() {
        System.out.println("Playing soothing tones on bamboo flute - subclass");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning bamboo flute gently - subclass");
    }

    @Override
    public void tune() {
        System.out.println("Tuning bamboo flute using air pressure - subclass");
    }

    @Override
    public void store() {
        System.out.println("Storing bamboo flute in a cloth bag - subclass");
    }
}


