package com.xworkz.isarelation.fan;

public class ApplianceController {

    public void operate(Fan fan) {
        fan.turnOn();
        fan.changeSpeed();
        fan.rotate();
        fan.stopRotation();
        fan.turnOff();

        if (fan instanceof SmartFan) {
            System.out.println("Casting: Fan is instance of SmartFan");
            SmartFan smart = (SmartFan) fan;
            smart.voiceControl();
        }
    }
}
