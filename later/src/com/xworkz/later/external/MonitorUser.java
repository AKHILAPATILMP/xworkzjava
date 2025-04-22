package com.xworkz.later.external;

import com.xworkz.later.internal.Monitor;

public class MonitorUser {

    Monitor monitor;

    public MonitorUser(Monitor monitor) {
        this.monitor = monitor;
        System.out.println("MonitorUser is initialized");
    }

    public void activate() {
        if (this.monitor != null) {
            this.monitor.display();
        } else {
            System.out.println("No monitor to display");
        }
    }
}
