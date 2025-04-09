package com.xworkz.runner.external;

import com.xworkz.runner.internal.Monitor;

public class MonitorRunner {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Dell", 24, 15000);
        String monitorString = monitor.toString();
        System.out.println("monitor" + monitorString);
    }
}
