package com.xworkz.later.external;

import com.xworkz.later.internal.Gadget;

public class GadgetUser {

    Gadget gadget;

    public GadgetUser(Gadget gadget) {
        this.gadget = gadget;
        System.out.println("GadgetUser is initialized");
    }

    public void use() {
        if (this.gadget != null) {
            this.gadget.function();
        } else {
            System.out.println("No gadget to use");
        }
    }
}
