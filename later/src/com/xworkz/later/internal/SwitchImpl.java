package com.xworkz.later.internal;

public class SwitchImpl implements Switch {

    public SwitchImpl() {
        super();
        System.out.println("SwitchImpl constructor running");
    }

    @Override
    public void toggle() {
        System.out.println("Switch is toggled...");
    }
}
