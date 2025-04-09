package com.xworkz.runner.external;

import com.xworkz.runner.internal.Machine;

public class MachineRunner {
    public static void main(String[] args) {
        Machine machine = new Machine("Washing", "Laundry", 15000);
        System.out.println("machine" + machine.toString());
    }
}
