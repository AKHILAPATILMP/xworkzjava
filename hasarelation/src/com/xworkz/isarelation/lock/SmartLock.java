package com.xworkz.isarelation.lock;
    public class SmartLock extends Lock {
        public SmartLock() {
            super();
            System.out.println("SmartLock constructor is running");
        }

        public void fingerprintUnlock() {
            System.out.println("SmartLock is unlocked using a fingerprint");
        }

        public void passwordUnlock() {
            System.out.println("SmartLock is unlocked using a password");
        }

        public void remoteControl() {
            System.out.println("SmartLock is controlled remotely via an app");
        }

        public void autoLock() {
            System.out.println("SmartLock is auto-locking after a set duration");
        }

        public void connectToWiFi() {
            System.out.println("SmartLock is connecting to WiFi for remote access");
        }
    }

