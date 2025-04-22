package com.xworkz.later.external;

import com.xworkz.later.internal.Dryer;

public class DryerUser {

    Dryer dryer;

    public DryerUser(Dryer dryer) {
        this.dryer = dryer;
        System.out.println("DryerUser is initialized");
    }

    public void activate() {
        if (this.dryer != null) {
            this.dryer.dry();
        } else {
            System.out.println("No dryer to dry");
        }
    }
}
