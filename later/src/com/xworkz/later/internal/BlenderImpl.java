package com.xworkz.later.internal;

public class BlenderImpl implements Blender {

    public BlenderImpl() {
        super();
        System.out.println("BlenderImpl constructor running");
    }

    @Override
    public void blend() {
        System.out.println("Blender is blending ingredients...");
    }
}
