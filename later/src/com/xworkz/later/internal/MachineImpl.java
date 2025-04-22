package com.xworkz.later.internal;

public class MachineImpl implements Machine {

    public MachineImpl() {
        super();
        System.out.println("MachineImpl constructor running");
    }

    @Override
    public void operate() {
        System.out.println("Machine is now operating...");
    }
}
