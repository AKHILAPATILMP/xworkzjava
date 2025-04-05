package com.xworkz.isarelation.toaster;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Toaster");
        Toaster toaster = new Toaster();
        toaster.turnOn();
        toaster.turnOff();
        toaster.toastBread();
        toaster.eject();

        System.out.println("\nCreating an instance of SmartToaster using Toaster reference");
        Toaster smartToaster = new SmartToaster();
        smartToaster.turnOn();
        smartToaster.turnOff();
        smartToaster.toastBread();
        smartToaster.eject();

        System.out.println("\nCreating an instance of SmartToaster using subclass reference");
        SmartToaster smart = new SmartToaster();
        smart.turnOn();
        smart.turnOff();
        smart.toastBread();
        smart.eject();
    }
}


