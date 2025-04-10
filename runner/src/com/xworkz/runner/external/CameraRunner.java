package com.xworkz.runner.external;

import com.xworkz.runner.internal.Camera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera = new Camera("Canon", 24, 59999.99);
        String cameraString = camera.toString();
        System.out.println("Camera details: " + cameraString);

        int hash = camera.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "lens";
        String two = "shutter";
        String three = "sensor";

        System.out.println("lens: " + one.hashCode());
        System.out.println("shutter: " + two.hashCode());
        System.out.println("sensor: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(camera));
    }
}
