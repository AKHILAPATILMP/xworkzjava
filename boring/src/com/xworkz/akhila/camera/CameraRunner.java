package com.xworkz.akhila.camera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera = null;
        Photographer photographer = new Photographer();
        photographer.use(camera);
    }
}
