package com.xworkz.isarelation.microwave;

public class SmartMicrowave extends Microwave {

    public SmartMicrowave() {
        super();
        System.out.println("SmartMicrowave constructor is running - subclass");
    }

    @Override
    public void start() {
        System.out.println("SmartMicrowave is starting with smart controls - subclass");
    }

    @Override
    public void stop() {
        System.out.println("SmartMicrowave is stopping with auto shutdown - subclass");
    }

    @Override
    public void setTimer() {
        System.out.println("Setting timer via touchscreen - subclass");
    }

    @Override
    public void displayStatus() {
        System.out.println("SmartMicrowave status shown on LED screen - subclass");
    }
}


