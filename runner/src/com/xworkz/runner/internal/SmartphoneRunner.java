package com.xworkz.runner.internal;

import com.xworkz.runner.external.Smartphone;

public class SmartphoneRunner {

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Samsung", 128, 25000);
        String smartphoneString = smartphone.toString();
        System.out.println("smartphone" + smartphoneString);
    }
}