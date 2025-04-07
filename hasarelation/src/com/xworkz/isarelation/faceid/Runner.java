package com.xworkz.isarelation.faceid;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of FaceID");
        FaceID basic = new FaceID();
        basic.scanFace();
        basic.authenticateUser();
        basic.lockDevice();
        basic.unlockDevice();
        basic.disableFaceID();

        System.out.println("\nCreating an instance of AdvancedFaceID using FaceID reference");
        FaceID reference = new AdvancedFaceID();
        reference.scanFace();
        reference.authenticateUser();
        reference.lockDevice();
        reference.unlockDevice();
        reference.disableFaceID();

        System.out.println("\nCreating an instance of AdvancedFaceID using subclass reference");
        AdvancedFaceID advanced = new AdvancedFaceID();
        advanced.scanFace();
        advanced.authenticateUser();
        advanced.lockDevice();
        advanced.unlockDevice();
        advanced.disableFaceID();
        advanced.detectMask();

        System.out.println("\nUsing DeviceSecurity for casting check");
        DeviceSecurity security = new DeviceSecurity();
        security.verify(basic);
        security.verify(reference);
        security.verify(advanced);
    }
}
