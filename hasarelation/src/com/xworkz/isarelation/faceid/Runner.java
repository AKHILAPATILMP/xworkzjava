package com.xworkz.isarelation.faceid;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of FaceID");
            FaceID faceid = new FaceID();
            faceid.scanFace();
            faceid.authenticateUser();
            faceid.unlockDevice();
            faceid.storeFaceData();
            faceid.preventUnauthorizedAccess();

            System.out.println("\nCreating an instance of AdvancedFaceID using FaceID reference");
            FaceID faceidRef = new AdvancedFaceID();
            faceidRef.scanFace();
            faceidRef.authenticateUser();
            faceidRef.unlockDevice();
            faceidRef.storeFaceData();
            faceidRef.preventUnauthorizedAccess();

            System.out.println("\nCreating an instance of AdvancedFaceID using subclass reference");
            AdvancedFaceID advancedFaceID = new AdvancedFaceID();
            advancedFaceID.scanFace();
            advancedFaceID.authenticateUser();
            advancedFaceID.unlockDevice();
            advancedFaceID.storeFaceData();
            advancedFaceID.preventUnauthorizedAccess();
            advancedFaceID.detectLiveness();
            advancedFaceID.recognizeMultipleUsers();
            advancedFaceID.adaptToLightingConditions();
            advancedFaceID.encryptFaceData();
            advancedFaceID.integrateWithApps();
        }
    }

