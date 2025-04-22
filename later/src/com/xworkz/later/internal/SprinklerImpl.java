package com.xworkz.later.internal;

public class SprinklerImpl implements Sprinkler {

    public SprinklerImpl() {
        super();
        System.out.println("SprinklerImpl constructor running");
    }

    @Override
    public void spray() {
        System.out.println("Sprinkler is spraying water...");
    }
}
