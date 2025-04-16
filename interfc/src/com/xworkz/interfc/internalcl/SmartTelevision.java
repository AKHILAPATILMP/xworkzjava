package com.xworkz.interfc.internalcl;

public class SmartTelevision extends SmartTV {

    @Override
    public void streamContent() {
        System.out.println("Streaming content from an online service...");
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusting TV settings...");
    }

    @Override
    public void castToTV() {
        System.out.println("Casting media to TV from a mobile device...");
    }
}
