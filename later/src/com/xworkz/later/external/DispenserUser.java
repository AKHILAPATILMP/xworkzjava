package com.xworkz.later.external;

import com.xworkz.later.internal.Dispenser;

public class DispenserUser {

    Dispenser dispenser;

    public DispenserUser(Dispenser dispenser) {
        this.dispenser = dispenser;
        System.out.println("DispenserUser is initialized");
    }

    public void activate() {
        if (this.dispenser != null) {
            this.dispenser.dispense();
        } else {
            System.out.println("No dispenser to activate");
        }
    }
}
