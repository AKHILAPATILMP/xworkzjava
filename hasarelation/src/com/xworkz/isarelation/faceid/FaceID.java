package com.xworkz.isarelation.faceid;

public class FaceID {

    public FaceID() {
        System.out.println("FaceID constructor is running - parent class");
    }

    public void scanFace() {
        System.out.println("Scanning face - parent class");
    }

    public void authenticateUser() {
        System.out.println("Authenticating user - parent class");
    }

    public void lockDevice() {
        System.out.println("Locking device - parent class");
    }

    public void unlockDevice() {
        System.out.println("Unlocking device - parent class");
    }

    public void disableFaceID() {
        System.out.println("Disabling FaceID - parent class");
    }
}
