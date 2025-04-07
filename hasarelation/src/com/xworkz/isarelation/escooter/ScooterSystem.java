package com.xworkz.isarelation.escooter;

public class ScooterSystem {

    public void operate(EScooter scooter) {
        scooter.start();
        scooter.stop();
        scooter.charge();
        scooter.ride();
        scooter.checkBattery();

        if (scooter instanceof SmartEScooter) {
            System.out.println("Casting: EScooter is SmartEScooter");
            SmartEScooter smart = (SmartEScooter) scooter;
            smart.trackLocation();
        }
    }
}
