package com.xworkz.isarelation.escooter;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of EScooter");
        EScooter escooter = new EScooter();
        escooter.start();
        escooter.stop();
        escooter.chargeBattery();
        escooter.displayStatus();

        System.out.println("\nCreating an instance of ElectricScooter using EScooter reference");
        EScooter escooterRef = new ElectricScooter();
        escooterRef.start();
        escooterRef.stop();
        escooterRef.chargeBattery();
        escooterRef.displayStatus();

        System.out.println("\nCreating an instance of ElectricScooter using subclass reference");
        ElectricScooter electric = new ElectricScooter();
        electric.start();
        electric.stop();
        electric.chargeBattery();
        electric.displayStatus();
    }
}
