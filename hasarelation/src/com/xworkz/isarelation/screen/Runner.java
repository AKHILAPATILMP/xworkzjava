package com.xworkz.isarelation.screen;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Screen");
        Screen screen = new Screen();
        screen.display();
        screen.turnOn();
        screen.turnOff();
        screen.adjustBrightness();

        System.out.println("\nCreating an instance of SmartScreen using Screen reference");
        Screen screenRef = new SmartScreen();
        screenRef.display();
        screenRef.turnOn();
        screenRef.turnOff();
        screenRef.adjustBrightness();

        System.out.println("\nCreating an instance of SmartScreen using subclass reference");
        SmartScreen smartScreen = new SmartScreen();
        smartScreen.display();
        smartScreen.turnOn();
        smartScreen.turnOff();
        smartScreen.adjustBrightness();
    }
}
