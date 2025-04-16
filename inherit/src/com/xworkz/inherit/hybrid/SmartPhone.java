package com.xworkz.inherit.hybrid;

public class SmartPhone implements SmartDevice {
    public void call() {
        System.out.println("SmartPhone making a call.");
    }

    public void connectToInternet() {
        System.out.println("SmartPhone connected to Internet.");
    }
}
