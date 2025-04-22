package com.xworkz.later.external;

import com.xworkz.later.internal.Appliance;

public class ApplianceUser {

    Appliance appliance;

    public ApplianceUser(Appliance appliance) {
        this.appliance = appliance;
        System.out.println("ApplianceUser is initialized");
    }

    public void activate() {
        if (this.appliance != null) {
            this.appliance.powerOn();
        } else {
            System.out.println("No appliance to activate");
        }
    }
}
