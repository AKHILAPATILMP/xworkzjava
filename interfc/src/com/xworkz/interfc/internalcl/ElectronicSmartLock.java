package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.SmartLock;

public class ElectronicSmartLock implements SmartLock {

    @Override
    public void lock() {
        System.out.println("Locking the door...");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking the door...");
    }

    @Override
    public void setPasscode() {
        System.out.println("Setting the passcode for secure entry...");
    }
}
