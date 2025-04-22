package com.xworkz.later.external;

import com.xworkz.later.internal.Fridge;

public class FridgeUser {

    Fridge fridge;

    public FridgeUser(Fridge fridge) {
        this.fridge = fridge;
        System.out.println("FridgeUser is initialized");
    }

    public void activate() {
        if (this.fridge != null) {
            this.fridge.cool();
        } else {
            System.out.println("No fridge to cool");
        }
    }
}
