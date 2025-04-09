package com.xworkz.runner.external;

import com.xworkz.runner.internal.Memory;

public class MemoryRunner {
    public static void main(String[] args) {
        Memory memory = new Memory("Recollection of past events", "Nostalgia and lessons", 9.0);
        System.out.println("memory" + memory.toString());
    }
}
