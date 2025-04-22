package com.xworkz.later.external;

import com.xworkz.later.internal.Clock;

public class ClockUser {

    Clock clock;

    public ClockUser(Clock clock) {
        this.clock = clock;
        System.out.println("ClockUser is initialized");
    }

    public void activate() {
        if (this.clock != null) {
            this.clock.tick();
        } else {
            System.out.println("No clock to tick");
        }
    }
}
