package com.xworkz.later.external;

import com.xworkz.later.internal.Switch;

public class SwitchUser {

    Switch switchRef;

    public SwitchUser(Switch switchRef) {
        this.switchRef = switchRef;
        System.out.println("SwitchUser is initialized");
    }

    public void press() {
        if (this.switchRef != null) {
            this.switchRef.toggle();
        } else {
            System.out.println("No switch to press");
        }
    }
}
