package com.xworkz.isarelation.lamp;

public class LightingSystem {
    public void operate(Lamp lamp) {
        lamp.turnOn();
        lamp.turnOff();
        lamp.adjustBrightness();
        lamp.replaceBulb();
        lamp.cleanLamp();

        if (lamp instanceof SmartLamp) {
            System.out.println("Casting Lamp to SmartLamp...");
            SmartLamp smart = (SmartLamp) lamp;
            smart.changeColor();
        }
    }
}
