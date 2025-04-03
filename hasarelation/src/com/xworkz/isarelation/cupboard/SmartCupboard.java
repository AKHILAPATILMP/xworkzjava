package com.xworkz.isarelation.cupboard;

    public class SmartCupboard extends Cupboard {
        public SmartCupboard() {
            super();
            System.out.println("SmartCupboard constructor is running");
        }

        public void fingerprintLock() {
            System.out.println("Cupboard is unlocking using fingerprint");
        }

        public void voiceControl() {
            System.out.println("Cupboard is responding to voice commands");
        }

        public void autoOpen() {
            System.out.println("Cupboard is opening automatically");
        }

        public void smartLighting() {
            System.out.println("Cupboard lights are turning on automatically");
        }
    }

