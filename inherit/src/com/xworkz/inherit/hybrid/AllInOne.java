package com.xworkz.inherit.hybrid;

public class AllInOne extends Printer implements SmartDevice {
    Scanner scanner = new Scanner();

    public void copy() {
        System.out.println("AllInOne is copying.");
        scanner.scan(); // Using scanner functionality
    }

    public void connectToInternet() {
        System.out.println("AllInOne device connected to Internet.");
    }
}
