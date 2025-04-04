package com.xworkz.isarelation.lock;
public class Lock {

    public Lock() {
        System.out.println("Lock constructor is running - parent class");
    }

    public void lock() {
        System.out.println("Locking manually - parent class");
    }

    public void unlock() {
        System.out.println("Unlocking manually - parent class");
    }

    public void checkStatus() {
        System.out.println("Checking lock status - parent class");
    }

    public void resetLock() {
        System.out.println("Resetting lock - parent class");
    }
}


