package com.xworkz.runner.external;

import com.xworkz.runner.internal.Bus;

public class BusRunner {
    public static void main(String[] args) {
        Bus bus = new Bus("Volvo", 50, 4000000);
        String busString = bus.toString();
        System.out.println("bus" + busString);
    }
}
