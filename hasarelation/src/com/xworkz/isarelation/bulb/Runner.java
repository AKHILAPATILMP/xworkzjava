package com.xworkz.isarelation.bulb;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Bulb");
        Bulb bulb = new Bulb();
        bulb.turnOn();
        bulb.glow();
        bulb.setVoltage();
        bulb.checkWattage();
        bulb.turnOff();

        System.out.println("\nCreating instance of LEDBulb using Bulb reference");
        Bulb bulbRef = new LEDBulb();
        bulbRef.turnOn();
        bulbRef.glow();
        bulbRef.setVoltage();
        bulbRef.checkWattage();
        bulbRef.turnOff();

        System.out.println("\nCreating instance of LEDBulb using subclass reference");
        LEDBulb led = new LEDBulb();
        led.turnOn();
        led.glow();
        led.setVoltage();
        led.checkWattage();
        led.turnOff();
        led.colorChange();

        System.out.println("\nUsing ElectricBoard to control bulbs");
        ElectricBoard board = new ElectricBoard();
        board.control(bulb);
        board.control(bulbRef);
        board.control(led);
    }
}
