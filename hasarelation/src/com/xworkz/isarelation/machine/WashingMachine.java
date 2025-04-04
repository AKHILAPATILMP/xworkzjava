package com.xworkz.isarelation.machine;
public class WashingMachine extends Machine {

    public WashingMachine() {
        super();
        System.out.println("WashingMachine constructor is running - subclass");
    }

    @Override
    public void start() {
        System.out.println("WashingMachine is starting with wash cycle - subclass");
    }

    @Override
    public void stop() {
        System.out.println("WashingMachine is stopping after rinse - subclass");
    }

    @Override
    public void operate() {
        System.out.println("WashingMachine is operating in auto mode - subclass");
    }

    @Override
    public void maintenance() {
        System.out.println("WashingMachine self-cleaning mode is running - subclass");
    }
}

