package com.xworkz.isarelation.bulb;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Bulb");
        Bulb bulb = new Bulb();
        bulb.turnOn();
        bulb.turnOff();
        bulb.glow();

        System.out.println("\nCreating an instance of LEDLight using Bulb reference");
        Bulb bulbRef = new LEDLight();
        bulbRef.turnOn();
        bulbRef.turnOff();
        bulbRef.glow();

        System.out.println("\nCreating an instance of LEDLight using subclass reference");
        LEDLight ledLight = new LEDLight();
        ledLight.turnOn();
        ledLight.turnOff();
        ledLight.glow();
        ledLight.adjustBrightness();
    }
}


