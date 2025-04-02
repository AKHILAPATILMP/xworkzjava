package com.xworkz.isarelation.lens;
public class Runner {
    public static void main(String[] args) {
        System.out.println("Creating an instance of Lens");
        Lens lens = new Lens();
        lens.focus();
        lens.magnify();
        lens.filterLight();
        lens.correctDistortion();
        lens.captureImage();

        System.out.println("\nCreating an instance of CameraLens using Lens reference");
        Lens lensRef = new CameraLens();
        lensRef.focus();
        lensRef.magnify();
        lensRef.filterLight();
        lensRef.correctDistortion();
        lensRef.captureImage();

        System.out.println("\nCreating an instance of CameraLens using subclass reference");
        CameraLens cameraLens = new CameraLens();
        cameraLens.focus();
        cameraLens.magnify();
        cameraLens.filterLight();
        cameraLens.correctDistortion();
        cameraLens.captureImage();
        cameraLens.zoom();
        cameraLens.adjustAperture();
        cameraLens.stabilizeImage();
        cameraLens.autofocus();
        cameraLens.changeFocalLength();
    }
}
