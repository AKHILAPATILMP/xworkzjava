package com.xworkz.later.internal;

public class GrinderImpl implements Grinder {

    public GrinderImpl() {
        super();
        System.out.println("GrinderImpl constructor running");
    }

    @Override
    public void grind() {
        System.out.println("Grinder is grinding...");
    }
}
