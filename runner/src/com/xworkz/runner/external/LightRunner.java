package com.xworkz.runner.external;

import com.xworkz.runner.internal.Light;

public class LightRunner {
    public static void main(String[] args) {
        Light light = new Light("Illumination and hope", "Guiding star", 10.0);
        System.out.println("light" + light.toString());
    }
}
