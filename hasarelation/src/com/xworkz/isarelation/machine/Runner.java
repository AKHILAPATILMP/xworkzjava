package com.xworkz.isarelation.machine;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of Machine");
        Machine machine = new Machine();
        machine.start();
        machine.stop();
        machine.operate();
        machine.maintenance();

        System.out.println("\nCreating an instance of WashingMachine using Machine reference");
        Machine machineRef = new WashingMachine();
        machineRef.start();
        machineRef.stop();
        machineRef.operate();
        machineRef.maintenance();

        System.out.println("\nCreating an instance of WashingMachine using subclass reference");
        WashingMachine wm = new WashingMachine();
        wm.start();
        wm.stop();
        wm.operate();
        wm.maintenance();
    }
}


