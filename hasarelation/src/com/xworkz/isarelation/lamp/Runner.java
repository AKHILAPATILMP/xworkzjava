package com.xworkz.isarelation.lamp;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Lamp");
        Lamp lamp = new Lamp();
        lamp.turnOn();
        lamp.turnOff();
        lamp.adjustBrightness();
        lamp.replaceBulb();

        System.out.println("\nCreating an instance of TableLamp using Lamp reference");
        Lamp lampRef = new TableLamp();
        lampRef.turnOn();
        lampRef.turnOff();
        lampRef.adjustBrightness();
        lampRef.replaceBulb();

        System.out.println("\nCreating an instance of TableLamp using subclass reference");
        TableLamp tableLamp = new TableLamp();
        tableLamp.turnOn();
        tableLamp.turnOff();
        tableLamp.adjustBrightness();
        tableLamp.replaceBulb();
    }
}
