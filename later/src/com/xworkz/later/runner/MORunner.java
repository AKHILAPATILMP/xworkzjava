package com.xworkz.later.runner;

import com.xworkz.later.internal.Monitor;
import com.xworkz.later.internal.MonitorImpl;
import com.xworkz.later.external.MonitorUser;

public class MORunner {
    public static void main(String[] args) {
        Monitor monitor = new MonitorImpl();
        MonitorUser monitorUser = new MonitorUser(monitor); // abstraction
        monitorUser.activate();
    }
}
