package com.xworkz.isarelation.escooter;

public class SmartEScooter extends EScooter {

    public SmartEScooter() {
        super();
        System.out.println("SmartEScooter constructor is running - subclass");
    }

    @Override
    public void start() {
        System.out.println("SmartEScooter starts with app unlock - subclass");
    }

    @Override
    public void stop() {
        System.out.println("SmartEScooter stops with geo-fencing - subclass");
    }

    @Override
    public void charge() {
        System.out.println("SmartEScooter supports fast charging - subclass");
    }

    @Override
    public void ride() {
        System.out.println("SmartEScooter ride is auto-balanced - subclass");
    }

    @Override
    public void checkBattery() {
        System.out.println("SmartEScooter displays battery stats in app - subclass");
    }

    public void trackLocation() {
        System.out.println("SmartEScooter is tracking live location - subclass only");
    }
}
