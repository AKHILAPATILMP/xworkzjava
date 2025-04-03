package com.xworkz.isarelation.lock;

public class Runner {
        public static void main(String[] args) {
            System.out.println("\nCreating an instance of SmartLock using Lock reference");
            Lock lockRef = new SmartLock();
            lockRef.lock();
            lockRef.unlock();
            lockRef.checkStatus();
            lockRef.rustProof();
            lockRef.breakLock();

            System.out.println("\nCreating an instance of SmartLock using subclass reference");
            SmartLock smartLock = new SmartLock();
            smartLock.lock();
            smartLock.unlock();
            smartLock.checkStatus();
            smartLock.rustProof();
            smartLock.breakLock();
            smartLock.fingerprintUnlock();
            smartLock.passwordUnlock();
            smartLock.remoteControl();
            smartLock.autoLock();
            smartLock.connectToWiFi();
        }
    }

