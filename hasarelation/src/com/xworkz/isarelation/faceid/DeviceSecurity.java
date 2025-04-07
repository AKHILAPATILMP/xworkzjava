package com.xworkz.isarelation.faceid;

public class DeviceSecurity {

    public void verify(FaceID faceID) {
        faceID.scanFace();
        faceID.authenticateUser();
        faceID.lockDevice();
        faceID.unlockDevice();
        faceID.disableFaceID();

        if (faceID instanceof AdvancedFaceID) {
            System.out.println("Casting: FaceID is instance of AdvancedFaceID");
            AdvancedFaceID advanced = (AdvancedFaceID) faceID;
            advanced.detectMask();
        }
    }
}
