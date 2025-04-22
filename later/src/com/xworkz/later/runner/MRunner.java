package com.xworkz.later.runner;

import com.xworkz.later.internal.Machine;
import com.xworkz.later.internal.MachineImpl;
import com.xworkz.later.external.MachineUser;

public class MRunner {
    public static void main(String[] args) {
        Machine machine = new MachineImpl();
        MachineUser machineUser = new MachineUser(machine); // abstraction
        machineUser.startMachine();
    }
}
