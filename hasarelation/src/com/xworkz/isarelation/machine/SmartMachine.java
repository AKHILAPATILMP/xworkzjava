package com.xworkz.isarelation.machine;

    public class SmartMachine extends Machine {
        public SmartMachine() {
            super();
            System.out.println("SmartMachine constructor is running");
        }

        public void autoOperate() {
            System.out.println("SmartMachine is operating automatically");
        }

        public void remoteControl() {
            System.out.println("SmartMachine is controlled remotely");
        }

        public void selfDiagnosis() {
            System.out.println("SmartMachine is performing self-diagnosis");
        }

        public void voiceControl() {
            System.out.println("SmartMachine is responding to voice commands");
        }

        public void energySavingMode() {
            System.out.println("SmartMachine is in energy-saving mode");
        }
    }

