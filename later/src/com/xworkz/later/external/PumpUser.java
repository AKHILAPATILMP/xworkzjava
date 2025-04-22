package com.xworkz.later.external;

import com.xworkz.later.internal.Pump;

public class PumpUser {

    Pump pump;

    public PumpUser(Pump pump) {
        this.pump = pump;
        System.out.println("PumpUser is initialized");
    }

    public void activate() {
        if (this.pump != null) {
            this.pump.startPumping();
        } else {
            System.out.println("No pump to start");
        }
    }
}
