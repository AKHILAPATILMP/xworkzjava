package com.xworkz.later.runner;

import com.xworkz.later.internal.Blender;
import com.xworkz.later.internal.BlenderImpl;
import com.xworkz.later.external.BlenderUser;

public class BlenderRunner {
    public static void main(String[] args) {
        Blender blender = new BlenderImpl();
        BlenderUser blenderUser = new BlenderUser(blender); // abstraction
        blenderUser.activate();
    }
}
