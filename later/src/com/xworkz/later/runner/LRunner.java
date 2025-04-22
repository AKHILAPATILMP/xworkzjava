package com.xworkz.later.runner;

import com.xworkz.later.internal.Light;
import com.xworkz.later.internal.LightImpl;
import com.xworkz.later.external.LightUser;

public class LRunner {
    public static void main(String[] args) {
        Light light = new LightImpl();
        LightUser lightUser = new LightUser(light); // abstraction
        lightUser.activate();
    }
}
