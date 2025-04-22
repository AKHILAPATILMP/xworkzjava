package com.xworkz.later.runner;

import com.xworkz.later.internal.Wheel;
import com.xworkz.later.internal.WheelImpl;
import com.xworkz.later.external.WheelUser;

public class WRunner {
    public static void main(String[] args) {
        Wheel wheel = new WheelImpl();
        WheelUser wheelUser = new WheelUser(wheel); // abstraction
        wheelUser.activate();
    }
}
