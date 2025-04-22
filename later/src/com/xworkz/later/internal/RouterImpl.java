package com.xworkz.later.internal;

public class RouterImpl implements Router {

    public RouterImpl() {
        super();
        System.out.println("RouterImpl constructor running");
    }

    @Override
    public void connect() {
        System.out.println("Router is connecting...");
    }
}
