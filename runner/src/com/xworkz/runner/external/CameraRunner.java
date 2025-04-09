package com.xworkz.runner.external;

import com.xworkz.runner.internal.Camera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera = new Camera("Sony", 24, 55000);
        String cameraString = camera.toString();
        System.out.println("camera" + cameraString);
    }
}
