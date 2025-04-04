package com.xworkz.isarelation.lock;

public class SmartLock extends Lock {

    public SmartLock() {
        super();
        System.out.println("SmartLock constructor is running - subclass");
    }

    @Override
    public void lock() {
        System.out.println("SmartLock is locking via mobile app - subclass");
    }

    @Override
    public void unlock() {
        System.out.println("SmartLock is unlocking using fingerprint - subclass");
    }

    @Override
    public void checkStatus() {
        System.out.println("SmartLock status checked through app - subclass");
    }

    @Override
    public void resetLock() {
        System.out.println("SmartLock is reset to factory settings - subclass");
    }
}


