package com.xworkz.later.runner;

import com.xworkz.later.internal.Device;
import com.xworkz.later.internal.DeviceImpl;
import com.xworkz.later.external.DeviceUser;

public class DRunner {
    public static void main(String[] args) {
        Device device = new DeviceImpl();
        DeviceUser deviceUser = new DeviceUser(device); // abstraction
        deviceUser.activate();
    }
}
