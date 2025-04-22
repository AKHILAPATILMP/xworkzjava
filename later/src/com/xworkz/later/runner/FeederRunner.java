package com.xworkz.later.runner;

import com.xworkz.later.internal.Feeder;
import com.xworkz.later.internal.FeederImpl;
import com.xworkz.later.external.FeederUser;

public class FeederRunner {
    public static void main(String[] args) {
        Feeder feeder = new FeederImpl();
        FeederUser feederUser = new FeederUser(feeder); // abstraction
        feederUser.activate();
    }
}
