package com.xworkz.later.external;

import com.xworkz.later.internal.Device;

public class DeviceUser {

    Device device;

    public DeviceUser(Device device) {
        this.device = device;
        System.out.println("DeviceUser is initialized");
    }

    public void activate() {
        if (this.device != null) {
            this.device.start();
        } else {
            System.out.println("No device to activate");
        }
    }
}
