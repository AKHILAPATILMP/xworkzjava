package com.xworkz.later.runner;

import com.xworkz.later.internal.Sensor;
import com.xworkz.later.internal.SensorImpl;
import com.xworkz.later.external.SensorUser;

public class SRunner {
    public static void main(String[] args) {
        Sensor sensor = new SensorImpl();
        SensorUser sensorUser = new SensorUser(sensor); // abstraction
        sensorUser.monitor();
    }
}
