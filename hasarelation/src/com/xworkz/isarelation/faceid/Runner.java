package com.xworkz.isarelation.faceid;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of FaceID");
        FaceID faceID = new FaceID();
        faceID.detectFace();
        faceID.authenticate();
        faceID.lockDevice();
        faceID.unlockDevice();

        System.out.println("\nCreating an instance of AdvancedFaceID using FaceID reference");
        FaceID faceIDRef = new AdvancedFaceID();
        faceIDRef.detectFace();
        faceIDRef.authenticate();
        faceIDRef.lockDevice();
        faceIDRef.unlockDevice();

        System.out.println("\nCreating an instance of AdvancedFaceID using subclass reference");
        AdvancedFaceID advFaceID = new AdvancedFaceID();
        advFaceID.detectFace();
        advFaceID.authenticate();
        advFaceID.lockDevice();
        advFaceID.unlockDevice();
    }
}
