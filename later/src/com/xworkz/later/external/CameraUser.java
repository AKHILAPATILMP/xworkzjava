package com.xworkz.later.external;

import com.xworkz.later.internal.Camera;

public class CameraUser {

    Camera camera;

    public CameraUser(Camera camera) {
        this.camera = camera;
        System.out.println("CameraUser is initialized");
    }

    public void shoot() {
        if (this.camera != null) {
            this.camera.capture();
        } else {
            System.out.println("No camera to capture");
        }
    }
}
