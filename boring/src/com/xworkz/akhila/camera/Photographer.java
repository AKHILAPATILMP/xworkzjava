package com.xworkz.akhila.camera;

public class Photographer {
    void use(Camera camera) {
        if (camera != null) {
            camera.capture();
        } else {
            System.out.println("No camera available to capture photos");
        }
    }
}
