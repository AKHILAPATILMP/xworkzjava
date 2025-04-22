package com.xworkz.later.internal;

public class MonitorImpl implements Monitor {

    public MonitorImpl() {
        super();
        System.out.println("MonitorImpl constructor running");
    }

    @Override
    public void display() {
        System.out.println("Monitor is displaying...");
    }
}
