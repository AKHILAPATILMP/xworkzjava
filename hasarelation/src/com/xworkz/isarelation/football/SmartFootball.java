package com.xworkz.isarelation.football;

public class SmartFootball extends Football {

    public SmartFootball() {
        super();
        System.out.println("SmartFootball constructor is running - subclass");
    }

    @Override
    public void kick() {
        System.out.println("SmartFootball kicked and speed is tracked - subclass");
    }

    @Override
    public void pass() {
        System.out.println("SmartFootball passed with location tracking - subclass");
    }

    @Override
    public void bounce() {
        System.out.println("SmartFootball bouncing tracked by sensors - subclass");
    }

    @Override
    public void inflate() {
        System.out.println("SmartFootball auto-inflates with sensor - subclass");
    }

    @Override
    public void deflate() {
        System.out.println("SmartFootball auto-deflates after match - subclass");
    }

    public void connectBluetooth() {
        System.out.println("SmartFootball connected to mobile via Bluetooth - subclass");
    }
}
