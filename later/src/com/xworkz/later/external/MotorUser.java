package com.xworkz.later.external;

import com.xworkz.later.internal.Motor;

public class MotorUser {

    Motor motor;

    public MotorUser(Motor motor) {
        this.motor = motor;
        System.out.println("MotorUser is initialized");
    }

    public void activate() {
        if (this.motor != null) {
            this.motor.start();
        } else {
            System.out.println("No motor to start");
        }
    }
}
