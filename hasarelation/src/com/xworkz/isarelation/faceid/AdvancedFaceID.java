package com.xworkz.isarelation.faceid;

public class AdvancedFaceID extends FaceID {

    public AdvancedFaceID() {
        super();
        System.out.println("AdvancedFaceID constructor is running - subclass");
    }

    @Override
    public void scanFace() {
        System.out.println("Scanning face with 3D sensors - subclass");
    }

    @Override
    public void authenticateUser() {
        System.out.println("Authenticating with AI model - subclass");
    }

    @Override
    public void lockDevice() {
        System.out.println("Locking device with voice alert - subclass");
    }

    @Override
    public void unlockDevice() {
        System.out.println("Unlocking using retina + face match - subclass");
    }

    @Override
    public void disableFaceID() {
        System.out.println("AdvancedFaceID disabled with admin rights - subclass");
    }

    public void detectMask() {
        System.out.println("Detecting mask on user's face - subclass only");
    }
}
