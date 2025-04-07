package com.xworkz.isarelation.lamp;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Lamp:");
        Lamp basicLamp = new Lamp();
        basicLamp.turnOn();
        basicLamp.turnOff();
        basicLamp.adjustBrightness();
        basicLamp.replaceBulb();
        basicLamp.cleanLamp();

        System.out.println("\nCreating instance of SmartLamp using Lamp reference:");
        Lamp lampRef = new SmartLamp();
        lampRef.turnOn();
        lampRef.turnOff();
        lampRef.adjustBrightness();
        lampRef.replaceBulb();
        lampRef.cleanLamp();

        System.out.println("\nCreating instance of SmartLamp using subclass reference:");
        SmartLamp smartLamp = new SmartLamp();
        smartLamp.turnOn();
        smartLamp.turnOff();
        smartLamp.adjustBrightness();
        smartLamp.replaceBulb();
        smartLamp.cleanLamp();
        smartLamp.changeColor();

        System.out.println("\nUsing LightingSystem to handle and cast lamps:");
        LightingSystem system = new LightingSystem();
        system.operate(basicLamp);
        system.operate(lampRef);
        system.operate(smartLamp);
    }
}
