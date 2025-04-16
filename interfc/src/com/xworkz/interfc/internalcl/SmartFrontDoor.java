package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.SmartDoor;

public class SmartFrontDoor implements SmartDoor {

    @Override
    public void lock() {
        System.out.println("Locking the front door...");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking the front door...");
    }

    @Override
    public void monitorEntry() {
        System.out.println("Monitoring entry through the front door...");
    }
}
