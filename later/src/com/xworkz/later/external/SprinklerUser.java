package com.xworkz.later.external;

import com.xworkz.later.internal.Sprinkler;

public class SprinklerUser {

    Sprinkler sprinkler;

    public SprinklerUser(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
        System.out.println("SprinklerUser is initialized");
    }

    public void activate() {
        if (this.sprinkler != null) {
            this.sprinkler.spray();
        } else {
            System.out.println("No sprinkler to operate");
        }
    }
}
