package com.xworkz.later.external;

import com.xworkz.later.internal.Blender;

public class BlenderUser {

    Blender blender;

    public BlenderUser(Blender blender) {
        this.blender = blender;
        System.out.println("BlenderUser is initialized");
    }

    public void activate() {
        if (this.blender != null) {
            this.blender.blend();
        } else {
            System.out.println("No blender to operate");
        }
    }
}
