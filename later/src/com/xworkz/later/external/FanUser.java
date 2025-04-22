package com.xworkz.later.external;

import com.xworkz.later.internal.Fan;

public class FanUser {

    Fan fan;

    public FanUser(Fan fan) {
        this.fan = fan;
        System.out.println("FanUser is initialized");
    }

    public void activate() {
        if (this.fan != null) {
            this.fan.spin();
        } else {
            System.out.println("No fan to spin");
        }
    }
}
