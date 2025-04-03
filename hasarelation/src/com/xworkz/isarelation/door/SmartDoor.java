package com.xworkz.isarelation.door;

    public class SmartDoor extends Door {
        public SmartDoor() {
            super();
            System.out.println("SmartDoor constructor is running");
        }

        public void fingerprintUnlock() {
            System.out.println("SmartDoor is unlocked using fingerprint recognition");
        }

        public void remoteControl() {
            System.out.println("SmartDoor is controlled remotely via a smartphone app");
        }

        public void autoLock() {
            System.out.println("SmartDoor is auto-locking after a set duration");
        }

        public void videoSurveillance() {
            System.out.println("SmartDoor is monitoring the entrance using a camera");
        }

        public void voiceControl() {
            System.out.println("SmartDoor is responding to voice commands");
        }
    }
