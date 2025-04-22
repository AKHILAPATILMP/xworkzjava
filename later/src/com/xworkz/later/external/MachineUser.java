package com.xworkz.later.external;

import com.xworkz.later.internal.Machine;

public class MachineUser {

    Machine machine;

    public MachineUser(Machine machine) {
        this.machine = machine;
        System.out.println("MachineUser is initialized");
    }

    public void startMachine() {
        if (this.machine != null) {
            this.machine.operate();
        } else {
            System.out.println("No machine to operate");
        }
    }
}
