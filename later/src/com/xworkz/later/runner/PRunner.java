package com.xworkz.later.runner;

import com.xworkz.later.internal.Pump;
import com.xworkz.later.internal.PumpImpl;
import com.xworkz.later.external.PumpUser;

public class PRunner {
    public static void main(String[] args) {
        Pump pump = new PumpImpl();
        PumpUser pumpUser = new PumpUser(pump); // abstraction
        pumpUser.activate();
    }
}
