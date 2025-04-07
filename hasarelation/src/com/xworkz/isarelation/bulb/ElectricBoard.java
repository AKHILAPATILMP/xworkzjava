package com.xworkz.isarelation.bulb;

public class ElectricBoard {

    public void control(Bulb bulb) {
        bulb.turnOn();
        bulb.glow();
        bulb.setVoltage();
        bulb.checkWattage();
        bulb.turnOff();

        if (bulb instanceof LEDBulb) {
            System.out.println("Casting: Bulb is instance of LEDBulb");
            LEDBulb led = (LEDBulb) bulb;
            led.colorChange();
        }
    }
}
