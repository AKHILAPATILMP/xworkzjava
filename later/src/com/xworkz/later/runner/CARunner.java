package com.xworkz.later.runner;

import com.xworkz.later.internal.Camera;
import com.xworkz.later.internal.CameraImpl;
import com.xworkz.later.external.CameraUser;

public class CARunner {
    public static void main(String[] args) {
        Camera camera = new CameraImpl();
        CameraUser cameraUser = new CameraUser(camera); // abstraction
        cameraUser.shoot();
    }
}
