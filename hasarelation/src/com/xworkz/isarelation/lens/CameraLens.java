package com.xworkz.isarelation.lens;
public class CameraLens extends Lens {
    public CameraLens() {
        super();
        System.out.println("CameraLens constructor is running");
    }

    public void zoom() {
        System.out.println("CameraLens: Zooming in and out...");
    }

    public void adjustAperture() {
        System.out.println("CameraLens: Adjusting aperture for lighting...");
    }

    public void stabilizeImage() {
        System.out.println("CameraLens: Stabilizing image...");
    }

    public void autofocus() {
        System.out.println("CameraLens: Using autofocus...");
    }

    public void changeFocalLength() {
        System.out.println("CameraLens: Changing focal length...");
    }
}
