package com.xworkz.later.external;

import com.xworkz.later.internal.Modem;

public class ModemUser {

    Modem modem;

    public ModemUser(Modem modem) {
        this.modem = modem;
        System.out.println("ModemUser is initialized");
    }

    public void activate() {
        if (this.modem != null) {
            this.modem.connect();
        } else {
            System.out.println("No modem to connect");
        }
    }
}
