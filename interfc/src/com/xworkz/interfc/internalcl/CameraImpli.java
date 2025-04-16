package com.xworkz.interfc.internalcl;

import com.xworkz.interfc.externali.Camera;

public class CameraImpli implements Camera {
    @Override
    public void capturePhoto() {
        System.out.println("Camera capturing photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("Camera recording video");
    }

    @Override
    public void zoom() {
        System.out.println("Camera zooming");
    }
}
