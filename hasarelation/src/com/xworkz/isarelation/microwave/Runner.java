package com.xworkz.isarelation.microwave;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Microwave");
        Microwave microwave = new Microwave();
        microwave.start();
        microwave.stop();
        microwave.setTimer();
        microwave.displayStatus();

        System.out.println("\nCreating an instance of SmartMicrowave using Microwave reference");
        Microwave microwaveRef = new SmartMicrowave();
        microwaveRef.start();
        microwaveRef.stop();
        microwaveRef.setTimer();
        microwaveRef.displayStatus();

        System.out.println("\nCreating an instance of SmartMicrowave using subclass reference");
        SmartMicrowave smartMicrowave = new SmartMicrowave();
        smartMicrowave.start();
        smartMicrowave.stop();
        smartMicrowave.setTimer();
        smartMicrowave.displayStatus();
    }
}


