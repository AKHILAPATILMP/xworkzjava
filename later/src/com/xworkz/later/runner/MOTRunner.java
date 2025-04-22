package com.xworkz.later.runner;

import com.xworkz.later.internal.Motor;
import com.xworkz.later.internal.MotorImpl;
import com.xworkz.later.external.MotorUser;

public class MOTRunner {
    public static void main(String[] args) {
        Motor motor = new MotorImpl();
        MotorUser motorUser = new MotorUser(motor); // abstraction
        motorUser.activate();
    }
}
