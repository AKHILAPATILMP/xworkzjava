package com.xworkz.later.external;

import com.xworkz.later.internal.Grinder;

public class GrinderUser {

    Grinder grinder;

    public GrinderUser(Grinder grinder) {
        this.grinder = grinder;
        System.out.println("GrinderUser is initialized");
    }

    public void activate() {
        if (this.grinder != null) {
            this.grinder.grind();
        } else {
            System.out.println("No grinder to operate");
        }
    }
}
