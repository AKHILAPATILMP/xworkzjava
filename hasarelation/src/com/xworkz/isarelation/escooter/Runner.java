package com.xworkz.isarelation.escooter;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of EScooter");
        EScooter base = new EScooter();
        base.start();
        base.stop();
        base.charge();
        base.ride();
        base.checkBattery();

        System.out.println("\nCreating an instance of SmartEScooter using EScooter reference");
        EScooter ref = new SmartEScooter();
        ref.start();
        ref.stop();
        ref.charge();
        ref.ride();
        ref.checkBattery();

        System.out.println("\nCreating an instance of SmartEScooter using subclass reference");
        SmartEScooter smart = new SmartEScooter();
        smart.start();
        smart.stop();
        smart.charge();
        smart.ride();
        smart.checkBattery();
        smart.trackLocation();

        System.out.println("\nUsing ScooterSystem with casting check");
        ScooterSystem system = new ScooterSystem();
        system.operate(base);
        system.operate(ref);
        system.operate(smart);
    }
}
