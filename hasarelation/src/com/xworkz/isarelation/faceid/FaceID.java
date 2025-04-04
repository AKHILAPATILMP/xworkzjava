package com.xworkz.isarelation.faceid;
public class FaceID {

    public FaceID() {
        System.out.println("FaceID constructor is running - parent class");
    }

    public void detectFace() {
        System.out.println("Detecting face using standard camera - parent class");
    }

    public void authenticate() {
        System.out.println("Authenticating user with basic face recognition - parent class");
    }

    public void lockDevice() {
        System.out.println("Device locked - parent class");
    }

    public void unlockDevice() {
        System.out.println("Device unlocked with face recognition - parent class");
    }
}



