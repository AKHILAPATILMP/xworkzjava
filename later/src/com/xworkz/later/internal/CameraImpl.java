package com.xworkz.later.internal;

public class CameraImpl implements Camera {

    public CameraImpl() {
        super();
        System.out.println("CameraImpl constructor running");
    }

    @Override
    public void capture() {
        System.out.println("Camera is capturing...");
    }
}
