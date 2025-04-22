package com.xworkz.later.external;

import com.xworkz.later.internal.Meter;

public class MeterUser {

    Meter meter;

    public MeterUser(Meter meter) {
        this.meter = meter;
        System.out.println("MeterUser is initialized");
    }

    public void activate() {
        if (this.meter != null) {
            this.meter.measure();
        } else {
            System.out.println("No meter to measure");
        }
    }
}
