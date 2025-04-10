package com.xworkz.runner.external;

import com.xworkz.runner.internal.Monitor;

public class MonitorRunner {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("LG", 27, 14999.99);
        String monitorString = monitor.toString();
        System.out.println("Monitor details: " + monitorString);

        int hash = monitor.hashCode();
        System.out.println("hash code using reference: " + hash);

        String one = "display";
        String two = "screen";
        String three = "view";

        System.out.println("display: " + one.hashCode());
        System.out.println("screen: " + two.hashCode());
        System.out.println("view: " + three.hashCode());

        System.out.println("Original: " + System.identityHashCode(monitor));
    }
}
