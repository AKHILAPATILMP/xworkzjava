package com.xworkz.runner.external;

import com.xworkz.runner.internal.Blender;

public class BlenderRunner {
    public static void main(String[] args) {
        Blender blender = new Blender("Philips", 3, 4500);
        System.out.println("blender" + blender.toString());
    }
}
