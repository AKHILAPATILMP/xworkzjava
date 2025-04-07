package com.xworkz.isarelation.fridge;

public class SmartFridge extends Fridge {

    public SmartFridge() {
        super();
        System.out.println("SmartFridge constructor is running - subclass");
    }

    @Override
    public void coolItems() {
        System.out.println("SmartFridge cools items using temperature sensors - subclass");
    }

    @Override
    public void freeze() {
        System.out.println("SmartFridge automatically freezes based on contents - subclass");
    }

    @Override
    public void storeFood() {
        System.out.println("SmartFridge categorizes stored food - subclass");
    }

    @Override
    public void defrost() {
        System.out.println("SmartFridge auto-defrosts on schedule - subclass");
    }

    @Override
    public void turnOn() {
        System.out.println("SmartFridge turns on with smart power mode - subclass");
    }

    public void connectWifi() {
        System.out.println("SmartFridge is connected to Wi-Fi - subclass");
    }
}
