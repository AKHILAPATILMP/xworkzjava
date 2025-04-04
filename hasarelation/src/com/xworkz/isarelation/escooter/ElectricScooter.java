package com.xworkz.isarelation.escooter;
public class ElectricScooter extends EScooter {

    public ElectricScooter() {
        super();
        System.out.println("ElectricScooter constructor is running - subclass");
    }

    @Override
    public void start() {
        System.out.println("ElectricScooter starts with a push button - subclass");
    }

    @Override
    public void stop() {
        System.out.println("ElectricScooter stops using regenerative braking - subclass");
    }

    @Override
    public void chargeBattery() {
        System.out.println("ElectricScooter battery is fast charging - subclass");
    }

    @Override
    public void displayStatus() {
        System.out.println("ElectricScooter displays battery and speed on screen - subclass");
    }
}
