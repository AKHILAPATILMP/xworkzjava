package com.xworkz.isarelation.phone;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Phone");
        Phone phone = new Phone();
        phone.makeCall();
        phone.receiveCall();
        phone.sendSMS();
        phone.batteryStatus();

        System.out.println("\nCreating an instance of SmartPhone using Phone reference");
        Phone phoneRef = new SmartPhone();
        phoneRef.makeCall();
        phoneRef.receiveCall();
        phoneRef.sendSMS();
        phoneRef.batteryStatus();

        System.out.println("\nCreating an instance of SmartPhone using subclass reference");
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCall();
        smartPhone.receiveCall();
        smartPhone.sendSMS();
        smartPhone.batteryStatus();
    }
}


