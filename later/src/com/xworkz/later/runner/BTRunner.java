package com.xworkz.later.runner;

import com.xworkz.later.internal.Battery;
import com.xworkz.later.internal.BatteryImpl;
import com.xworkz.later.external.BatteryUser;

public class BTRunner {
    public static void main(String[] args) {
        Battery battery = new BatteryImpl();
        BatteryUser batteryUser = new BatteryUser(battery); // abstraction
        batteryUser.activate();
    }
}
