package com.xworkz.later.external;

import com.xworkz.later.internal.Light;

public class LightUser {

    Light light;

    public LightUser(Light light) {
        this.light = light;
        System.out.println("LightUser is initialized");
    }

    public void activate() {
        if (this.light != null) {
            this.light.turnOn();
        } else {
            System.out.println("No light to turn on");
        }
    }
}
