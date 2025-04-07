package com.xworkz.isarelation.fan;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating Fan instance:");
        Fan fan = new Fan();
        fan.turnOn();
        fan.changeSpeed();
        fan.rotate();
        fan.stopRotation();
        fan.turnOff();

        System.out.println("\nCreating SmartFan instance with Fan reference:");
        Fan smartRef = new SmartFan();
        smartRef.turnOn();
        smartRef.changeSpeed();
        smartRef.rotate();
        smartRef.stopRotation();
        smartRef.turnOff();

        System.out.println("\nCreating SmartFan instance with subclass reference:");
        SmartFan smartFan = new SmartFan();
        smartFan.turnOn();
        smartFan.changeSpeed();
        smartFan.rotate();
        smartFan.stopRotation();
        smartFan.turnOff();
        smartFan.voiceControl();

        System.out.println("\nRunning ApplianceController for casting:");
        ApplianceController controller = new ApplianceController();
        controller.operate(fan);
        controller.operate(smartRef);
        controller.operate(smartFan);
    }
}
