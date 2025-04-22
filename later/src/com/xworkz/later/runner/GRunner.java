package com.xworkz.later.runner;

import com.xworkz.later.internal.Gadget;
import com.xworkz.later.internal.GadgetImpl;
import com.xworkz.later.external.GadgetUser;

public class GRunner {
    public static void main(String[] args) {
        Gadget gadget = new GadgetImpl();
        GadgetUser gadgetUser = new GadgetUser(gadget); // abstraction
        gadgetUser.use();
    }
}
