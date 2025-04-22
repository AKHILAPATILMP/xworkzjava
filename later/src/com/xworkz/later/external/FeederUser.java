package com.xworkz.later.external;

import com.xworkz.later.internal.Feeder;

public class FeederUser {

    Feeder feeder;

    public FeederUser(Feeder feeder) {
        this.feeder = feeder;
        System.out.println("FeederUser is initialized");
    }

    public void activate() {
        if (this.feeder != null) {
            this.feeder.feed();
        } else {
            System.out.println("No feeder to feed");
        }
    }
}
