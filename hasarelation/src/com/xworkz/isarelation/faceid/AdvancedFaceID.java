package com.xworkz.isarelation.faceid;

public class AdvancedFaceID extends FaceID {

    public AdvancedFaceID() {
        super();
        System.out.println("AdvancedFaceID constructor is running - subclass");
    }

    @Override
    public void detectFace() {
        System.out.println("Detecting face using depth sensors and infrared - subclass");
    }

    @Override
    public void authenticate() {
        System.out.println("Authenticating with advanced AI-based facial recognition - subclass");
    }

    @Override
    public void lockDevice() {
        System.out.println("Device locked securely using FaceID - subclass");
    }

    @Override
    public void unlockDevice() {
        System.out.println("Device unlocked with secure FaceID - subclass");
    }
}
