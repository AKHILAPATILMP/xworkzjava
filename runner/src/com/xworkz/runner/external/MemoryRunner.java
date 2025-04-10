package com.xworkz.runner.external;

import com.xworkz.runner.internal.Memory;

public class MemoryRunner {
    public static void main(String[] args) {
        Memory memory = new Memory("DDR4", 16, 3200.0);
        String memoryString = memory.toString();
        System.out.println("Memory details: " + memoryString);

        int hash = memory.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "RAM";
        String two = "cache";
        String three = "register";

        System.out.println("RAM: " + one.hashCode());
        System.out.println("cache: " + two.hashCode());
        System.out.println("register: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(memory));
    }
}
