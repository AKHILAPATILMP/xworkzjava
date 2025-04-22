package com.xworkz.later.internal;

public class AlarmImpl implements Alarm {

    public AlarmImpl() {
        super();
        System.out.println("AlarmImpl constructor running");
    }

    @Override
    public void trigger() {
        System.out.println("Alarm is triggered...");
    }
}
