package com.xworkz.isarelation.bicycle;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Bicycle");
        Bicycle bicycle = new Bicycle();
        bicycle.pedal();
        bicycle.applyBrakes();
        bicycle.changeGear();
        bicycle.ringBell();

        System.out.println("\nCreating an instance of SmartBicycle using Bicycle reference");
        Bicycle smartBicycleRef = new SmartBicycle();
        smartBicycleRef.pedal();
        smartBicycleRef.applyBrakes();
        smartBicycleRef.changeGear();
        smartBicycleRef.ringBell();

        System.out.println("\nCreating an instance of SmartBicycle using subclass reference");
        SmartBicycle smartBicycle = new SmartBicycle();
        smartBicycle.pedal();
        smartBicycle.applyBrakes();
        smartBicycle.changeGear();
        smartBicycle.ringBell();
    }
}
