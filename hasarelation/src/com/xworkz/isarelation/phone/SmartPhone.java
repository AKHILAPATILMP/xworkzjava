package com.xworkz.isarelation.phone;

public class SmartPhone extends Phone {

    public SmartPhone() {
        super();
        System.out.println("SmartPhone constructor is running - subclass");
    }

    @Override
    public void makeCall() {
        System.out.println("Making a VoIP call - subclass");
    }

    @Override
    public void receiveCall() {
        System.out.println("Receiving a video call - subclass");
    }

    @Override
    public void sendSMS() {
        System.out.println("Sending instant message - subclass");
    }

    @Override
    public void batteryStatus() {
        System.out.println("Battery status: 80% with optimization - subclass");
    }
}


