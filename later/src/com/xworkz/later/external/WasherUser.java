package com.xworkz.later.external;

import com.xworkz.later.internal.Washer;

public class WasherUser {

    Washer washer;

    public WasherUser(Washer washer) {
        this.washer = washer;
        System.out.println("WasherUser is initialized");
    }

    public void activate() {
        if (this.washer != null) {
            this.washer.wash();
        } else {
            System.out.println("No washer to wash");
        }
    }
}
