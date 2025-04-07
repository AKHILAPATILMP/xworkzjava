package com.xworkz.isarelation.door;

public class SmartDoor extends Door {

    public SmartDoor() {
        super();
        System.out.println("SmartDoor constructor is running - subclass");
    }

    @Override
    public void open() {
        System.out.println("SmartDoor opening with fingerprint scan - subclass");
    }

    @Override
    public void close() {
        System.out.println("SmartDoor auto-closes after 10 seconds - subclass");
    }

    @Override
    public void lock() {
        System.out.println("SmartDoor locking with passcode - subclass");
    }

    @Override
    public void unlock() {
        System.out.println("SmartDoor unlocking with mobile app - subclass");
    }

    @Override
    public void knock() {
        System.out.println("SmartDoor plays chime on knock - subclass");
    }

    public void faceRecognition() {
        System.out.println("SmartDoor unlocking using face recognition - subclass only");
    }
}
