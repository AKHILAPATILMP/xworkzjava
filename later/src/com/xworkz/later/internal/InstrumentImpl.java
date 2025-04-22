package com.xworkz.later.internal;

public class InstrumentImpl implements Instrument {

    public InstrumentImpl() {
        super();
        System.out.println("InstrumentImpl constructor running");
    }

    @Override
    public void play() {
        System.out.println("Playing the instrument...");
    }
}
