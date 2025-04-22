package com.xworkz.later.external;

import com.xworkz.later.internal.Wheel;

public class WheelUser {

    Wheel wheel;

    public WheelUser(Wheel wheel) {
        this.wheel = wheel;
        System.out.println("WheelUser is initialized");
    }

    public void activate() {
        if (this.wheel != null) {
            this.wheel.rotate();
        } else {
            System.out.println("No wheel to rotate");
        }
    }
}
