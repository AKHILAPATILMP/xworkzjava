package com.xworkz.isarelation.machine;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartMachine using Machine reference");
            Machine machineRef = new SmartMachine();
            machineRef.start();
            machineRef.operate();
            machineRef.maintenance();
            machineRef.powerSupply();
            machineRef.stop();

            System.out.println("\nCreating an instance of SmartMachine using subclass reference");
            SmartMachine smartMachine = new SmartMachine();
            smartMachine.start();
            smartMachine.operate();
            smartMachine.maintenance();
            smartMachine.powerSupply();
            smartMachine.stop();
            smartMachine.autoOperate();
            smartMachine.remoteControl();
            smartMachine.selfDiagnosis();
            smartMachine.voiceControl();
            smartMachine.energySavingMode();
        }
    }

