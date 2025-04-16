package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Scooter;

public class SmartScooter implements Scooter {

    @Override
    public void start() {
        System.out.println("Smart scooter is starting...");
    }

    @Override
    public void startEngine() {
        System.out.println("start the engine");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate the scooter");
    }

    @Override
    public void stop() {
        System.out.println("Smart scooter is stopping...");
    }

}