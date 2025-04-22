package com.xworkz.later.runner;

import com.xworkz.later.internal.Meter;
import com.xworkz.later.internal.MeterImpl;
import com.xworkz.later.external.MeterUser;

public class MeterRunner {
    public static void main(String[] args) {
        Meter meter = new MeterImpl();
        MeterUser meterUser = new MeterUser(meter); // abstraction
        meterUser.activate();
    }
}
