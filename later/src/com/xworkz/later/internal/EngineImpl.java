package com.xworkz.later.internal;

public class EngineImpl implements Engine {

    public EngineImpl() {
        super();
        System.out.println("EngineImpl constructor running");
    }

    @Override
    public void ignite() {
        System.out.println("Engine is igniting...");
    }
}
