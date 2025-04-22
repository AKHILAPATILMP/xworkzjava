package com.xworkz.later.runner;

import com.xworkz.later.internal.Laptop;
import com.xworkz.later.internal.LaptopImpl;
import com.xworkz.later.external.OperatingSystem;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new LaptopImpl();
        OperatingSystem operatingSystem = new OperatingSystem(laptop); // abstraction
        operatingSystem.operate();
    }
}
