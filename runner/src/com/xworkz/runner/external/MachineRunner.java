package com.xworkz.runner.external;

import com.xworkz.runner.internal.Machine;

public class MachineRunner {
    public static void main(String[] args) {
        Machine machine = new Machine("Lathe", "Cutting", 1500.0);
        String machineString = machine.toString();
        System.out.println("Machine details: " + machineString);

        int hash = machine.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "gear";
        String two = "motor";
        String three = "drill";

        System.out.println("gear: " + one.hashCode());
        System.out.println("motor: " + two.hashCode());
        System.out.println("drill: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(machine));
    }
}
