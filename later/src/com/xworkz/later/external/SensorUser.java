package com.xworkz.later.external;

import com.xworkz.later.internal.Sensor;

public class SensorUser {

    Sensor sensor;

    public SensorUser(Sensor sensor) {
        this.sensor = sensor;
        System.out.println("SensorUser is initialized");
    }

    public void monitor() {
        if (this.sensor != null) {
            this.sensor.detect();
        } else {
            System.out.println("No sensor to monitor");
        }
    }
}
