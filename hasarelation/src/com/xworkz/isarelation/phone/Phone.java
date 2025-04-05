package com.xworkz.isarelation.phone;

public class Phone {

    public Phone() {
        System.out.println("Phone constructor is running - parent class");
    }

    public void makeCall() {
        System.out.println("Making a call - parent class");
    }

    public void receiveCall() {
        System.out.println("Receiving a call - parent class");
    }

    public void sendSMS() {
        System.out.println("Sending SMS - parent class");
    }

    public void batteryStatus() {
        System.out.println("Checking battery status - parent class");
    }
}
