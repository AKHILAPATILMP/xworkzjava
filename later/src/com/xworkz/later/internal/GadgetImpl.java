package com.xworkz.later.internal;

public class GadgetImpl implements Gadget {

    public GadgetImpl() {
        super();
        System.out.println("GadgetImpl constructor running");
    }

    @Override
    public void function() {
        System.out.println("Gadget is functioning...");
    }
}
