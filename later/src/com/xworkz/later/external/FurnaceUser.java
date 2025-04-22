package com.xworkz.later.external;

import com.xworkz.later.internal.Furnace;

public class FurnaceUser {

    Furnace furnace;

    public FurnaceUser(Furnace furnace) {
        this.furnace = furnace;
        System.out.println("FurnaceUser is initialized");
    }

    public void activate() {
        if (this.furnace != null) {
            this.furnace.heat();
        } else {
            System.out.println("No furnace to heat");
        }
    }
}
