package com.xworkz.later.external;

import com.xworkz.later.internal.Microwave;

public class MicrowaveUser {

    Microwave microwave;

    public MicrowaveUser(Microwave microwave) {
        this.microwave = microwave;
        System.out.println("MicrowaveUser is initialized");
    }

    public void activate() {
        if (this.microwave != null) {
            this.microwave.cook();
        } else {
            System.out.println("No microwave to cook");
        }
    }
}
