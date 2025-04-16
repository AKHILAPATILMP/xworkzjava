package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.SmartLock;

public class Lock implements SmartLock {

    @Override
    public void lock() {
        System.out.println("Locking the smart lock...");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking the smart lock...");
    }

    @Override
    public void autoLock() {
        System.out.println("Smart lock will auto-lock after 30 seconds...");
    }
}