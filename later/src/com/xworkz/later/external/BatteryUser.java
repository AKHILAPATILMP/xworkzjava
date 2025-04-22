package com.xworkz.later.external;

import com.xworkz.later.internal.Battery;

public class BatteryUser {

    Battery battery;

    public BatteryUser(Battery battery) {
        this.battery = battery;
        System.out.println("BatteryUser is initialized");
    }

    public void activate() {
        if (this.battery != null) {
            this.battery.charge();
        } else {
            System.out.println("No battery to charge");
        }
    }
}
