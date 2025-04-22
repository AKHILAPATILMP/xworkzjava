package com.xworkz.later.external;

import com.xworkz.later.internal.Laptop;

public class OperatingSystem {

    Laptop laptop;

    public OperatingSystem(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("OperatingSystem is managing the Laptop");
    }

    public void operate() {
        if (this.laptop != null) {
            this.laptop.process();
        } else {
            System.out.println("No laptop to operate");
        }
    }
}
