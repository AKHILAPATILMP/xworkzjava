package com.xworkz.later.runner;

import com.xworkz.later.internal.Dispenser;
import com.xworkz.later.internal.DispenserImpl;
import com.xworkz.later.external.DispenserUser;

public class DispenserRunner {
    public static void main(String[] args) {
        Dispenser dispenser = new DispenserImpl();
        DispenserUser dispenserUser = new DispenserUser(dispenser); // abstraction
        dispenserUser.activate();
    }
}
